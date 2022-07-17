import static java.lang.System.*;

public class PrintPyramid1 {
	public static void main(String[] args) {
		
		out.println("ピラミッドを表示します。");
		out.print("段数は:");
		int num = new java.util.Scanner(System.in).nextInt();;
		
		/*単純な段数のみ*/
		for(int i=0;i<num;i++) {
			/*左側空白部分表示
			 *個数→ num-1から0まで*/
			for(int k=0;k<num-i-1;k++) {
				out.print(" ");;
			}
			/*単純に*を個数分表示するだけ
			 *個数→ 1,3,5,7という具合に*/
			int j=0;;
			do {
				out.print('*');
				j++;;
			}while(j<i*2+1);;
			out.print("\n");
		}
		
	}
}
