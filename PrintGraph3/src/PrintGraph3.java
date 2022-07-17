import static java.lang.System.*;

import java.util.Scanner;

public class PrintGraph3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*要素数を入力待ち*/
		out.print("要素数 :");
		int num = sc.nextInt();
		
		/*要素数分の乱数を配列に格納*/
		int[] score = new int[num];
		ranNum(score,num);
		
		/*グラフの格納と出力*/
		char[][] seet = new char[10][num];
		arrayOperation(score,seet,num);
		
		/*下線を出力*/
		/*要素番号を出力*/
		yokoZiku(num);
		
	}
	
	/*グラフの格納と出力*/
	public static void arrayOperation(int[] ransu,char[][] seet,int yousosu){
		/*文字配列に空白と*を格納*/
		for(int i=9;i>=0;i--) {
			for(int j=0;j<yousosu;j++) {
				if(ransu[j]>i) {
					seet[i][j] = '*';
				}else {
					seet[i][j] = ' ';
				}
			}
		}
		
		/*文字配列を出力*/
		for(int i=9;i>=0;i--) {
			for(int j=0;j<yousosu;j++) {
				out.print(seet[i][j]+" ");
			}
			out.print("\n");
		}
	
	}
	
	/*要素数分の乱数を配列に格納*/
	public static void ranNum(int[] ransu,int yousosu){
		for(int l=0;l<yousosu;l++) {
			ransu[l] = new java.util.Random().nextInt(10)+1;
		}
	}
	
	/*横軸の出力*/
	public static void yokoZiku(int yousosu){
		/*下線を出力*/
		for(int m=0;m<yousosu;m++) {
			out.print("--");
		}
		out.print("\n");
		/*要素番号を出力*/
		for(int k=0;k<yousosu;k++) {
			out.print((k%10+" "));
		}
	}
	
}
