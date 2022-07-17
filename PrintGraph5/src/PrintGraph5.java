import static java.lang.System.*;

import java.util.Scanner;
public class PrintGraph5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*データ数*/
		int num = 0;
		/*データを範囲ごとに区別した各数*/
		int[] sortscore = new int[10];
		/*グラフシート*/
		char[][] seet = new char[10][50];
		
		out.print("150cm～200cmの身長データ n人分をグラフで表します\n");
		out.print("データ数 n = ");
		do {
			num = sc.nextInt();
			if(num>50) {
				out.print("nは50以下でお願いします\n");
			}
		}while(num>50);

		/*データ入力用格納先配列*/
		double[] score = new double[num];
		/*データ入力*/
		score = nyuryokuNum(num);
		/*そのデータを範囲ごとに区別した各数*/
		sortscore = sortScore(score,num);
		/*区別した各数からグラフシートに落とし込む*/
		seet = arrayOperation(sortscore);
		/*出力*/
		yokoNum();
		yokoZiku();
		arrayOperation2(seet);
		yokoZiku();
		
	}
	/*データ数を取得しデータを1次元配列に入力させるメソッド
	 *ret double[] */
	static double[] nyuryokuNum(int num) {
		double[] score = new double[num];
		for(int i=0;i<num;i++) {
			out.printf("NO %d = ",(i+1));
			score[i] = sc.nextDouble();
		}
		return score;
	}
	
	/*横軸の数字*/
	static void yokoNum() {
		out.print("        ");
		for(int i=0;i<=50;i+=5) {
			if(i==5) {
				out.printf("%-4d",i);
			}else {
				out.printf("%-5d",i);
			}
		}
		out.print("\n");
	}
	
	/*横軸の線*/
	static void yokoZiku() {
		out.printf("%59s","+----+----+----+----+----+----+----+----+----+----+");
		out.print("\n");
	}
	
	/*データscoreから範囲ごとsortscoreに区別*/
	/*ret int[]*/
	static int[] sortScore(double[] score,int num) {
		int[] sortscore = new int[10];
		for(int j=0;j<num;j++) {
			for(int k=0,l=195;k<10;k++,l-=5) {
				if(score[j]>=l) {
					sortscore[k]++;;
					break;
				}
			}
		}
		return sortscore;
	}
	
	/*2次元配列seetにそれぞれの区分の数分*を入れ込む*/
	/*ret char[][]*/
	static char[][] arrayOperation(int[] sortscore) {
		char[][] seet = new char[10][50];
		for(int i=0;i<10;i++) {
			for(int j=0;j<sortscore[i];j++) {
				seet[i][j] = '*';
			}
		}
		return seet;
	}
	
	/*2次元配列seetを出力*/
	static void arrayOperation2(char[][] seet) {
		int sitanum = 195;
		int uenum = 200;
		for(int i=0;i<10;i++) {
			int j=0;
			out.printf("%d-%d :",sitanum,uenum);
			while(seet[i][j]=='*') {
				out.print(seet[i][j]);
				j++;;
			}
			sitanum-=5;
			uenum-=5;
			out.print("\n");
		}
		out.print("\n");
	}
}
