/*10進数を2進数に変換する*/
import static java.lang.System.*;

public class NumberConv2 {
	public static void main(String[] args) {
		
		out.println("奇数変換プログラム(10進数→2進数)");;
		out.print("整数を入力:");
		
		/*入力してもらう10進数
		 * 後で使うため入力後は動かさない*/
		int num10 = new java.util.Scanner(System.in).nextInt();;
		/*2進数格納用の配列アドレス*/
		int[] num2 = new int[256];;
		/*2で割った商を格納するワーク変数*/
		int wrk=num10;;
		int i = 0;;
		for(;;i++) {
			num2[i] = wrk % 2;;
			wrk /= 2;;
			if(wrk == 0) {
				break;
			}else if(wrk == 1) {
				num2[i+1] = 1;;
				break;
			}
		}
		
		out.print("("+num10+")10 = (");
		int j = i+1;;
		for(;j>=0;j--) {
			out.print(num2[j]);;
		}
		out.print(")2");;
	}
}
