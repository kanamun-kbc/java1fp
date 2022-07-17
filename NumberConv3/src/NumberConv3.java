import static java.lang.System.*;

import java.util.Scanner;
public class NumberConv3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.println("基数変換プログラム（１０進数→n 進数）");
		out.println("10 進数をｎ進数に変換します DecToN <d> <n> d:10 進数 n:基数");
		out.print("10 進数を入力してください：");
		int gonum = 0;
		int num = sc.nextInt();
		do {
			out.print("何進数に変換しますか？（16 進数まで）：");
			gonum = sc.nextInt();
			if(gonum>16) {
				out.print("16進数までです\n");
				continue;
			}else {
				break;
			}
		}while(true);
		String[] array = getNum(num,gonum);
		int count = digits(num,gonum);
		out.print("10進数 "+num+" は"+gonum+"進数で ");
		for(int i=count-1;i>=0;i--){
		 out.print(array[i]);
		}
		out.print(" です");
	}
	
	public static String[] getNum(int num,int gonum) {
		String[] array = new String[256];
		for(int i=0;;i++) {
			int wrk = num%gonum;
			/*wrkが10以上15以下なら
			 * アルファベットに変える
			 * そうでないならそのまま
			 * その後array[i]に格納
			 */
			if(wrk>=10) {
				switch(wrk){
				case 10:
					array[i]="A";
					break;
				case 11:
					array[i]="B";
					break;
				case 12:
					array[i]="C";
					break;
				case 13:
					array[i]="D";
					break;
				case 14:
					array[i]="E";
					break;
				case 15:
					array[i]="F";
					break;
				}
			}else {
				array[i]=String.valueOf(wrk);
			}
			
			/* numにnumをgonumで割った値を代入
			 * numがgonumを下回ったら(終了条件)
			 * i+1にそれを格納する
			 * 格納する値は
			 * numが10以上15以下なら
			 * そうでないならそのまま
			 * アルファベットに変える
			 * その後array[i+1]に格納
			 */
			num/=gonum;
			
			if(num<gonum) {
				if(num>=10) {
					switch(num){
					case 10:
						array[i+1]="A";
						break;
					case 11:
						array[i+1]="B";
						break;
					case 12:
						array[i+1]="C";
						break;
					case 13:
						array[i+1]="D";
						break;
					case 14:
						array[i+1]="E";
						break;
					case 15:
						array[i+1]="F";
						break;
					}
				}else {
					array[i+1]=String.valueOf(num);
				}
				break;
			}
			
		}
		
		return array;
	}
	
	
	public static int digits(int num,int gonum) {
		int i=1;
		for(;;i++) {
			num/=gonum;
			if(num<gonum) {
				i++;
				break;
			}else {
				continue;
			}
		}
		return i;
	}
}
