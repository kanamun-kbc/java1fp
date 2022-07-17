import static java.lang.System.*;

import java.util.Scanner;
public class PrintAsterisk3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		out.print("複数の長方形を表示\n");;
		out.print("横幅:");;
		int side = sc.nextInt();;
		out.print("高さ:");;
		int high = sc.nextInt();;
		out.print("個数:");;
		int num = sc.nextInt();
		
		/*添え字基準で話すなら
		 * 高さiが0～high-1まで繰り返す 
		 	* 個数jが0～num-1まで繰り返す
		 		* 横幅kが0～sideまで繰り返す
		 			* もしkがsideなら' 'を表示する
		 			* kがそれ以外なら'*'を表示する
		 改行する*/
		
		for(int i=0;i<high;i++) {
			for(int j=0;j<num;j++) {
				for(int k=0;k<=side;k++) {
					if(k==side) {
						out.print(' ');
					}else {
						out.print('*');
					}
				}
			}
			out.print("\n");
		}
		
	}
}


