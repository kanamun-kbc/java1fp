import static java.lang.System.*;

import java.util.Scanner;
public class DigitNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
		
		out.print("正の整数の桁数を求めます。\n");;
		out.print("正の整数値:");;
		int num = sc.nextInt();;
		
		/*論理シフトくん久しぶり
		 * int型の性質を利用する*/
		int digit = 0;;
		
		int wrk = num;;
		while(wrk!=0) {
			wrk/=10;;
			digit++;;
		}
		
		out.print(num+"は"+digit+"桁です。");
		
	}
}
