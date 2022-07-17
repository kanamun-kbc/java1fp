import static java.lang.System.*;

import java.util.Scanner;
public class Deposit {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		out.print("積立預金額(x 円) :");;
		int x = sc.nextInt();
		out.print("積立月数(n ヵ月) :");;
		int n = sc.nextInt();
		out.print("積立預金額(r %) :");;
		double r = sc.nextDouble();
		
		double[] ganri = new double[n];;
		/*利息計算で用いるやつ*/
		double wrk = (0.01)*r/2;;
		
		int i=0;;
		while(i<n) {
			if(i<12) {
				if(i==0) {
					ganri[i]=x;
				}else {
					ganri[i]=ganri[i-1]+x;
				}
				if(i==11) {
					ganri[i]+=(ganri[i-6]*wrk);
				}
			}else {
				if(i%6==5) {
					ganri[i]=ganri[i-1]+x;
					ganri[i]+=(ganri[i-6]*wrk);
				}else {
					ganri[i]=ganri[i-1]+x;
				}
			}
			i++;;
		}
		
		out.println("月    元利合計");
		for(int j=0;j<n;j++) {
			out.print((j+1));
			int k=100000;
			while((j+1)<k) {
				out.print(' ');;
				k/=10;
				if(k==1)break;;
			}
			out.println((int)Math.round(ganri[j]));;
		}

	}
}
