
import static java.lang.System.*;

public class GraphicRotation2 {

	public static void main(String[] args) {
		/*指定する回転方法cmd*/
		int cmd=0; 
		/*図形データ*/
		char grf[][]= { 
		{'■','□','■','□','□','■','□','■'}, 
		{'□','□','■','□','□','■','□','□'}, 
		{'■','■','■','□','□','■','■','■'}, 
		{'□','□','□','□','□','□','□','□'}, 
		{'□','□','□','□','□','□','□','□'}, 
		{'■','■','■','□','□','■','■','■'}, 
		{'□','□','■','□','□','■','□','□'}, 
		{'■','□','■','□','□','■','□','■'}
		}; 
		
		/*元の図形8×8を表示する*/
		Syuturyoku(grf);;
		
		do {
		out.println("コマンドを入力してください。");;
		out.print("1:右 90 度回転,2:左 90 度回転,3:180 度回転,9:終了 >");;
		cmd = new java.util.Scanner(System.in).nextInt();;
		
			switch(cmd) {
			case 1:
				OneRotation(grf);;
				Syuturyoku(grf);;
				break;
			case 2:
				OneRotation(grf);;
				OneRotation(grf);;
				OneRotation(grf);;
				Syuturyoku(grf);;
				break;
			case 3:
				OneRotation(grf);;
				OneRotation(grf);;
				Syuturyoku(grf);;
				break;
			case 9:
				break;
			}
		}while(cmd!=9);
	}
	/*wrkの中に4分割したgrfをコピーして, 
	 * 回転先の値をカウンタ変数を使いながら各配列番地に代入する*/
	/*①まず初めに保存先(wrk)に回転予定の分割した配列を代入*/
	/*列ごとに見ていくと
		 * 一番左の列が一番上の行に値が移る
		 * 二番目の列は上から二番目の行に値が移る
		 * 三番目の列は上から三番目の行に値が移る
		 * 一番右の列は一番下の行に値が移る
		 * ②この考え方で, 回転先(grf)が行の順番ごとに値が調整されるよう
		 * 保存先(wrk)から引っ張ってくる
		 * */
	public static void RoutationQuarter(char[][] grf,int sti,int stj,int n) {
		char wrk[][] = new char [6][6];
		
		/*配列wrkに切り取った図形部分を保存*/
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				wrk[i][j] = grf[sti+i][stj+j];;
			}
		}
		/*配列grfが90度回転後, 配列wrkが回転前の関係に*/
		/*配列wrkの番号はずっと0から4の行列であることに注意*/
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=0;j--) {
				grf[sti+i][stj+n-1-j] = wrk[j][i];;
			}
		}
		
	}
	/*4分割した4つ全部回す
	 * これで右90度回転を１回転分*/
	public static void OneRotation(char[][] grf) {
		RoutationQuarter(grf,0,0,4);;
		RoutationQuarter(grf,0,4,4);;
		RoutationQuarter(grf,4,0,4);;
		RoutationQuarter(grf,4,4,4);;
	}
	/*8×8すべて表記する*/
	public static void Syuturyoku(char[][] grf) {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				out.print(grf[i][j]);;
			}
			out.print("\n");
		}
	}
}
