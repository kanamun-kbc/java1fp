import static java.lang.System.*;

import java.util.Scanner;
public class GraphicRotation {
	static Scanner sc = new Scanner(System.in);
	static char wrk[][] = new char [6][6];
	static char grf[][]= {
		{'　','　','■','■','　','　'},
		{'　','　','■','■','　','　'},
		{'　','　','■','■','■','■'},
		{'　','　','■','■','　','　'},
		{'　','　','■','■','　','　'},
		{'■','■','■','■','■','■'}};
	public static void main(String[] args) {
		int cmd=0;
		printArray();
		do {
			out.println("コマンドを入力してください。");;
			out.print("1:右90 度回転,2:左90 度回転,3:上下反転,4:左右反転,9:終了 >");;
			
			cmd=sc.nextInt();
			switch(cmd) {
			case 1:
				Routation();
				printArray();
				break;
			case 2:
				Routation();
				Routation();
				Routation();
				printArray();
				break;
			case 3:
				highRow();
				printArray();
				break;
			case 4:
				rightLeft();
				printArray();
				break;
			case 9:
				out.print("終了します\n");
				break;
			default:
				continue;
			}
			
		}while(cmd!=9);
		
	}
	
	public static void arrayCopy() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				wrk[i][j] = grf[i][j];;
			}
		}
	}
	
	/*90度回転操作*/
	static void Routation() {
		/*配列wrkにgrfを一旦コピーしておく*/
		arrayCopy();
		/*回転先に置きたい場所をgrfの座標に記す形*/
		for(int i=0;i<6;i++) {
			for(int j=5;j>=0;j--) {
				grf[i][5-j] = wrk[j][i];;
			}
		}
	}
	
	/*左右反転*/
	static void rightLeft() {
		arrayCopy();
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				grf[i][5-j] = wrk[i][j];
			}
		}
	}
	
	/*上下反転*/
	static void highRow() {
		arrayCopy();
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				grf[5-i][j] = wrk[i][j];
			}
		}
		
	}
	
	/*ただ表示するだけ*/
	static void printArray() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				out.print(grf[i][j]);;
			}
			out.print("\n");
		}
	}
	
}
