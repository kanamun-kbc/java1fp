import static java.lang.System.*;

import java.util.Scanner;
public class PostageChage {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [][] price = {
				{ 50, 130}, { 100, 190}, { 250, 270}, { 500, 390},
				{1000, 700}, {2000, 950}, {3000, 1150}, {4000, 1350}
				};
		
		out.print("長さ(cm):");
		int length = sc.nextInt();;
		out.print("はば(cm):");
		int wide = sc.nextInt();;
		out.print("厚さ(cm):");
		double high = sc.nextDouble();;
		out.print("重さ(g):");
		int weight = sc.nextInt();;
		
		/*それぞれを比較する際に使う変数は
		 * 長さlength, 幅wide, 厚さ(length+wide+high), 重さweight*/
		/*厚さ比較の変数が長いのでdouble型lwhを追加する*/
		double lwh= length + wide + high;;
		
		/*評価ポイントを設定する
		 * 2つの変数と4つの条件を用意し, 
		 * 4点満点の評価で, 定形か定形外か扱わないかを決める*/
		
		/*定形*/
		int teikei = 0;;
		/*定形外*/
		int teikeigai = 0;;
		
		/*長さlength評価*/
		if(length<14) {
			/*扱わない欄*/
		}else { 
			if(length<=23.5) {
				teikei++;
				teikeigai++;;
			}else {
				teikeigai++;;
			}
		}
		
		/*幅wide評価*/
		if(wide<9) {
			/*扱わない欄*/
		}else {
			if(wide<=12) {
				teikei++;;
				teikeigai++;;
			}else {
				teikeigai++;;
			}
		}
		
		/*厚さthick評価*/
		if(high<=1) {
			if(lwh<=90) {teikeigai++;;}
			teikei++;;
		}else {
			if(lwh>90) {
				/*取り扱わない欄*/
			}else {
				teikeigai++;;
			}
		}
		
		/*重さweight評価*/
		if(weight>4000) {
			/*扱わない欄*/
		}else {
			if(weight<50) {
				teikei++;;
				teikeigai++;;
			}else {
				teikeigai++;;
			}
		}
		
		/*評価ポイントで呼び出すメソッドを変える分岐*/
		/* 定形  定形外
		 * 4      4
		 * 4      ×
		 * ×     4
		 * ×     ×
		 * 下2つの分岐を記す方が文が短くなる
		 * */
		if(teikei!=4 && teikeigai!=4) {
			out.print("この郵便物は取り扱いできません。");;
		}else if(teikei!=4 && teikeigai==4) {
			nonregular(weight,price);;
		}else {
			regular(weight);;
		}
		
	}
	
	public static void regular(int karusa) {
		if(karusa<=25) {
			out.print("郵便料金=80円");
		}else {
			out.print("郵便料金=90円");
		}
		/*void型メソッドなので返り値なし*/
	}
	
	public static void nonregular(int omosa, int[][] array) {
		
		for(int i=0;i<array.length;i++) {
			if(omosa<=array[i][0]) {
				out.print("郵便料金="+array[i][1]+"円");
				break;
			}else {
				continue;
			}
		}
		/*void型メソッドなので返り値なし*/
	}
	
}
