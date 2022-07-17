import static java.lang.System.*;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);
	static int num;
	public static void main(String[] args) {
		out.print("整数を入力してください :");
		num = sc.nextInt();
		
		/*出力用保存変数*/
		int j=0;;
		do {
			j++;;
			/*計算用後段変数*/
			int i=j;;
			int sum = 1;;
			while(i>0) {
				sum*=i;;
				i--;;
			}
			out.println(j+"! = "+sum);
		}while(j<num);
	}
}
