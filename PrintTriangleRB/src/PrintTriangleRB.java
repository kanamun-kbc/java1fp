import static java.lang.System.*;

public class PrintTriangleRB {
	
	public static void main(String[] args) {
		
		out.println("右下直角の二等辺三角形を表示します。");;
		out.print("段数は :");;
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=(num-i);j>0;j--) {
				out.print(' ');
			}
			for(int k=1;k<=i;k++) {
				out.print('*');
			}
			out.print("\n");
		}
		
	}
}
