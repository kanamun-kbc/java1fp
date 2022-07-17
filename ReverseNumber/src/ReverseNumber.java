import static java.lang.System.*;

import java.util.Scanner;
public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numA = new int[8];
		out.print("8個の整数を入力してください。\n");
		for(int i=0;i<numA.length;i++) {
			out.print("整数"+(i+1)+" :");
			numA[i] = sc.nextInt();
		}
		out.print("\n配列numAを並び替え\n\n配列numAの内容\n------------\n");
		
		for(int j=0;j<(numA.length)/2;j++) {
			int wrk = numA[j];
			numA[j] = numA[numA.length-1-j];
			numA[numA.length-1-j] = wrk;
		}
		
		for(int i=0;i<numA.length;i++) {
			out.println("numA["+i+"] = "+numA[i]);
		}
	}
}
