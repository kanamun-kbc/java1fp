import static java.lang.System.*;

import java.util.Scanner;

public class Measure {
	static Scanner sc = new Scanner(System.in);
	static int judge;;
	public static void main(String[] args) {
		
		do {
			out.println("約数表示プログラム");;
			out.print("整数値を入力 :");;
			int num = sc.nextInt();
		
			int count=0;;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					out.print(i+" ");
					count++;;
				}
			}
		
			out.println("約数は"+count+"個です。");;
			out.print("続けますか？(1…Yes / 2…No) :");
			judge = sc.nextInt();
			out.print("\n");
		
		}while(judge==1);
	}
}
