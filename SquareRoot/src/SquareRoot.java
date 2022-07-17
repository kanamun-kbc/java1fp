import static java.lang.System.*;

import java.util.Scanner;
/*おそらくニュートン法で近似値を求める公式
 * UECでもやった覚えがある*/
public class SquareRoot {
	static Scanner sc = new Scanner(System.in);
	static Double num;
	public static void main(String[] args) {
		
		out.print("平方根を求めたい数字を入力してください :");;
		num = sc.nextDouble();;
		
		double roopnum=num/2;;
		double num1;;
		
		int i=0;;
		do {
			num1 = roopnum;;
			
			roopnum = ((num/num1) + num1)/2;;
			
			i++;;
		}while((num1-roopnum)!=0 && i<15);
		
		out.println(roopnum);;
	}
	
	
}
