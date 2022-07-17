/*じゃんけんアプリ*/
public class Janken {
	public static void main(String[] args) {
		System.out.println("じゃんけんゲーム");;
		System.out.println("( グー:0, チョキ:1, パー:2)");;
		
		/*自分の手と相手の手を用意*/
		int mynumber=0;;
		int enemy=0;;
		/*あいこになった時
		 * 掛け声変更用にカウンタ設置*/
		int i=0;
		
		System.out.print("じゃんけん…");;
		
		do {
			i++;;
			
			/*相手の手を決める*/
			enemy=new java.util.Random().nextInt(3);
			
			/*自分の手を入力*/
			mynumber=new java.util.Scanner(System.in).nextInt();
			
			/*一回目以外はしょ！！*/
			if(i==1) {
				System.out.println("ポン！！");;
			}else {
				System.out.println("しょ！！");;
			}
			
			
			System.out.println("あなたの手　×　コンピュータの手");;
			
			/*自分の手の表示*/
			switch(mynumber) {
			case 0:
				System.out.print("グー　　　　　　　");;
				break;
			case 1:
				System.out.print("チョキ　　　　　　　");;
				break;
			case 2:
				System.out.print("パー　　　　　　　");;
			}
			
			/*相手の手の表示*/
			switch(enemy) {
			case 0:
				System.out.println("グー　　　　　　　");;
				break;
			case 1:
				System.out.println("チョキ　　　　　　　");;
				break;
			case 2:
				System.out.println("パー　　　　　　　");;
			}
			
			
			/*勝ち負けあいこの判定*/
			/*あいこ*/
			if(mynumber==enemy) {
				System.out.println("あいこ");;
				System.out.println("( グー:0, チョキ:1, パー:2)");;
				System.out.print("あいこで…");;
			}else if(((mynumber+1)==enemy) || (mynumber==2 && enemy==0)) {
				/*勝ち*/
				/*0のとき1, 1のとき2, 2のとき0でないといけないから*/
				System.out.println("あなたの勝ち(^-^)");;
			}else {
				System.out.println("あなたの負け(*_*)");;
			}
			
			/*あいこの間は続ける*/
		}while(mynumber==enemy);
		
		
	}
}
