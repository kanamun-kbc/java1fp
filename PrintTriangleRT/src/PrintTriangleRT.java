import static java.lang.System.*;

public class PrintTriangleRT {
	public static void main(String[] args) {
		
		out.println("右上直角の二等辺三角形を表示します。");;
		out.print("段数は :");;
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<i;k++) {
				out.print(' ');
			}
			for(int j=(num-i);j>0;j--) {
				out.print('*');
			}
			out.print("\n");
		}
		
	}
}
