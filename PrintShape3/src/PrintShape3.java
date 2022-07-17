import static java.lang.System.*;

public class PrintShape3 {
	public static void main(String[] args) {
		
		out.print("何段表示しますか？:");
		int num = new java.util.Scanner(System.in).nextInt();;
		
		int pcount = 1;;
		
		/*0～4はi%5個表示　5～9は5-i%5個表示*/
		
		while(pcount<=num) {
			for(int i=1;i<=9;i++) {
				if(i<5) {
					for(int j=0;j<i;j++)out.print('●');;
					out.println(pcount);;
					pcount++;;
					if(pcount>num)break;;
				}else if(i>=5 && i<=9) {
					for(int j=0;j<(5-i%5);j++)out.print('●');;
					out.println(pcount);;
					pcount++;;
					if(pcount>num)break;;
				}
			}
			if(pcount<=num) {
				out.println(pcount);;
				pcount++;;
				if(pcount>num)break;;
			}
		}
		out.print("終了");
	}
}
