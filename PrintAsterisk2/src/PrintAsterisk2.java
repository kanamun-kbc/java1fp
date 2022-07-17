import static java.lang.System.*;

import java.util.Scanner;
public class PrintAsterisk2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		out.print("縦に何個表示しますか(2以上)？");;
		int vert = sc.nextInt();
		out.print("横に何個表示しますか(2以上)？");;
		int side = sc.nextInt();
		
		/*添え字基準で話すなら
		 * 縦iが0 or vert-1のときは
		 	* 横jが0～side-1まで'*'を表示
		 * iがそれ以外の時は
		 	* 横kが0～side-1まで繰り返す
		 		* 横kが0 or side-1のときは'*'を表示
		 		* kがそれ以外の時は' 'を表示*/
		
		for(int i=0;i<vert;i++) {
			if(i==0 || i==vert-1) {
				for(int j=0;j<side;j++) {
					out.print('*');
				}
			}else {
				for(int k=0;k<side;k++) {
					if(k==0 || k==side-1) {
						out.print('*');
					}else {
						out.print(' ');
					}
				}
			}
			out.print("\n");
		}
		
		
		
	}
}
