import static java.lang.System.*;

import java.util.Scanner;
public class SlotMachine {
	static Scanner sc = new Scanner(System.in);
	/*int[3][3]*/
	static int Coin = 100;
	static int[][] Slot = {{0,0,0},{0,0,0},{0,0,0}};
	public SlotMachine() {
	}
	
	public static void main(String[] args) {
		
		/*持ってるCoinが3未満になるまで*/
		do {
			out.print("何枚コインを入れますか?(1-3) :");
			int inCoin=0;//投入するコイン
			int outCoin=0;//払いだされるコイン
			/*1ゲームで使うコインの枚数設定*/
			do {
				inCoin = sc.nextInt();
				if(inCoin==1 || inCoin==2 || inCoin==3) {
					break;
				}else {
					out.print("投入枚数は1枚から3枚です. よろしくお願いします.");
					continue;
				}
			}while(true);
			
			/*投入されたので持ちコインからその枚数を引く*/
			Coin -= inCoin;
			/*スロットに乱数をはめ込む*/
			Slot = slotNumber();
			/*一行ずつ見て獲得枚数を計算する*/
			/*1枚1行, 2枚3行, 3枚5行*/
			switch(inCoin) {
			case 1:
				outCoin += threeSeven(Slot[1][0],Slot[1][1],Slot[1][2]);
				break;
			case 2:
				for(int i=0;i<Slot.length;i++) {
					outCoin += threeSeven(Slot[i][0],Slot[i][1],Slot[i][2]);
				}
				break;
			case 3:
				for(int i=0;i<Slot.length;i++) {
					outCoin += threeSeven(Slot[i][0],Slot[i][1],Slot[i][2]);
				}
				outCoin += threeSeven(Slot[0][0],Slot[1][1],Slot[2][2]);
				outCoin += threeSeven(Slot[2][0],Slot[1][1],Slot[0][2]);
				break;
			}
			/*スロットの面を表示*/
			printSlot(Slot);
			/*払い出しを手持ちコインに加算
			 * 払い出し枚数と残りコインを表示*/
			Coin += outCoin;
			out.printf("払い出し枚数=%d\n",outCoin);
			out.printf("残りコイン=%d 枚\n\n", Coin);
			
		}while(Coin>=3);
		
		out.print("終了します。");
	}
	
	/*3つの条件1つのライン分のコイン獲得数分岐*/
	static int threeSeven(int left,int middle,int right) {
		if(left==middle && middle==right && left==7) {
			return 100;
		}else if(left==middle && left==7) {
			return 10;
		}else if(left==7) {
			return 2;
		}else {
			return 0;
		}
	}
	
	
	/*3×3のスロット一面を設定する*/
	static int[][] slotNumber(){
		int[][] array = new int[3][3];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j] = new java.util.Random().nextInt(10);
			}
		}
		return array;
	}
	
	
	/*スロットの表示*/
	static void printSlot(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(j==0) {
					out.print(array[i][j]);
				}else {
					out.printf("%2d",array[i][j]);
				}
			}
			out.print("\n");
		}
		
	}
	
}
