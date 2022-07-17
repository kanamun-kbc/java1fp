import static java.lang.System.*;

import java.util.Scanner;
public class PrintGrid {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.print("縦に何個表示しますか（2 以上）？：");
		int high = sc.nextInt();
		out.print("横に何個表示しますか（2 以上）？：");
		int width = sc.nextInt();
		
		for(int i=0;i<high;i++) {
			if(i%2==0) {
				for(int j=0;j<width;j++) {
					if(j%2==0) {
						out.print('+');
					}else{
						out.print('-');
					}
				}
			}else{
				for(int j=0;j<width;j++) {
					if(j%2==0) {
						out.print('|');
					}else{
						out.print(' ');
					}
				}
			}
			out.print("\n");
		}
	}
	
}
