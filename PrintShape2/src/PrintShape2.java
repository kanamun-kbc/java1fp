import static java.lang.System.*;;

public class PrintShape2 {
	/*3で割った余りが1なら●
	 * それ以外は◯を表示
	 * 縦の数まで続ける
	 * 	横の数になったら改行する*/
	public static void main(String[] args) {
	
	out.print("縦に何個表示しますか？:");;
	int vert = new java.util.Scanner(System.in).nextInt();
	out.print("縦に何個表示しますか？:");;
	int side = new java.util.Scanner(System.in).nextInt();
	
	/*添え字基準だと
	 * ●は
	 * 0段目は0,3,6,9
	 * 1段目は1,4,7
	 * 2段目は2,5,8
	 * 3段目は0,3,6,9*/
	for(int i=0;i<vert;i++) {
		for(int j=0;j<side;j++) {
			if(j%3==i%3) {
				out.print('●');
			}else {
				out.print('◯');
			}
		}
		out.print("\n");
	}
	
	}
}
