import static java.lang.System.*;

import java.util.Scanner;

public class Fibonacci {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		out.println("整数を入力してください");
		out.print("表示上限 :");
		
		int num = sc.nextInt();
		
		int fib1 = 1;;
		int fib2 = 1;;
		int fib3 = 2;;
		int i = 0;;
		
		while(fib3<num) {
			
			if(i==0) {
				out.println(fib1);;
				out.println(fib2);;
				out.println(fib3);;
			}
			
			fib1 = fib2;;
			fib2 = fib3;;
			fib3 = fib1 + fib2;;
			
			if(fib3>num) {
				break;
			}
			
			out.println(fib3);;
			i++;;
		}
		
	}
}
