import static java.lang.System.*;

import java.util.Scanner;
public class Equation {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.print("2次方程式の解を求める\nax2+bx+c=0\n");
		out.print("整数a :");
		float a = sc.nextFloat();
		out.print("整数b :");
		float b = sc.nextFloat();
		out.print("整数c :");
		float c = sc.nextFloat();
		
		float d=0;
		
		if(a==0) {
			if(b==0) {
				if(c==0) {
					//1.a
					out.print("解は不定");
				}else {
					//1.b
					out.print("解は不能");
				}
			}else {
				//1.c
				out.print("解は一つの実数解 x = "+(-c/b));
			}
		}else {
			d=b*b-4*a*c;
			if(d>0) {
				//2.a
				out.print("解は異なる実数解 x = "+(float)((-b+Math.sqrt(d))/(2*a))+", "+(float)(-b-Math.sqrt(d))/(2*a));
			}else if(d==0) {
				//2.b
				out.print("解は1つの実数解 x = "+(-b/2*a));
			}else {
				//2.c
				out.print("解は複素数解 x = "+(-b/(2*a))+"+"+((Math.sqrt(-d))/(2*a))+"i, "+(-b/(2*a))+"-"+((Math.sqrt(-d))/(2*a))+"i");
			}
		}
		
	}
}
