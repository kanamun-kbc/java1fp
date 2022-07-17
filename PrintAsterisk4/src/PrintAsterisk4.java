import static java.lang.System.*;

import java.util.Scanner;
public class PrintAsterisk4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		out.print("複数の長方形を表示\n");;
		out.print("横幅:");;
		int side = sc.nextInt();;
		out.print("高さ");;
		int high = sc.nextInt();;
		out.print("個数");;
		int num = sc.nextInt();;
		
		/*添え字基準
		 * 個数iが0～num-1まで繰り返す
		 	* 高さjが0～high-1まで繰り返す
		 		* 横幅kが0～side-1まで繰り返す
		 			* '*'を表示する
		 	* 改行する
		 * 改行する*/
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=high;j++) {
					for(int k=0;k<side;k++) {
						out.print("*");
				}
				out.print("\n");
			}
			out.print("\n");
		}
		
	}
}
