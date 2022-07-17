
public class PrintTriangleLB {
	public static void main(String[] args) {
		
		System.out.println("左下直角の二等辺三角形を表示します。");;
		System.out.println("段数は :");;
		
		int num = new java.util.Scanner(System.in).nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<(i+1);j++) {
				System.out.print('*'); 
			}
			System.out.print("\n");
		}
	}
}
