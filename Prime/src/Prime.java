import static java.lang.System.*;

import java.util.Scanner;

public class Prime {
	
	static Scanner sc = new java.util.Scanner(System.in);
	static int num;;
	
	public static void main(String[] args) {
		
		/*入力まち*/
		do {
			out.print("2 以上の整数を入力してください :");
			num = sc.nextInt();;
		}while(num<2);
		
		int i = 2;;
		int count = 0;;
		
		/*割り切れた回数をカウント*/
		for(;i<=num;i++) {
			if(num%i==0) {
				count++;;
			}
		}
		
		if(count==1) {
			out.print(num+"は素数だよ");
		}else {
			out.print(num+"は素数じゃないよ");
		}
		
	}
}
