import static java.lang.System.*;

import java.util.Scanner;
public class DNumberSearch1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int clearCount = 0;//正解数
		int num = 0;//入力値
		int daburi = 0;
		int[] box = new int[10];
		out.print("ダブっている数字を入力してください。\n");
		/*スタート*/
		long start = System.currentTimeMillis();
		do {
			/*答えとなる数を設定*/
			daburi = new java.util.Random().nextInt(9)+1;
			/*箱の中にランダム数を10個入れる*/
			box = inputArray(daburi);
			/*プリント*/
			printArray(box);
			do {
				num = sc.nextInt();
				if(num == daburi) {
					clearCount++;;
					break;
				}else {
					out.printf("miss!!%15c",':');
					continue;
				}
			}while(num != daburi);
			
		}while(clearCount<10);
		/*ストップ*/
		long end = System.currentTimeMillis();
		/*単位がmsなので秒に直すために*/
		double keika = (end - start)/1000.0;
		/*経過時間表示*/
		out.print(keika+"秒かかりました。\n");
		/*それによって早いか遅いか*/
		if(keika>25.0) {
			out.print("鈍すぎます。");
		}else if(keika>20.0) {
			out.print("少し鈍いですね。");
		}else if(keika>17.0) {
			out.print("まあまあですね。");
		}else {
			out.print("素早いですね。");
		}
		
	}
	
	
	/*全要素0のint型配列boxとnextを使ってランダム数格納*/
	static int[] inputArray(int daburi) {
		int count = 0;
		int[] next = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int[] box = {0,0,0,0,0,0,0,0,0,0};
		do {
			int rand = new java.util.Random().nextInt(10);
			if(next[rand] == rand) {
				continue;
			}else {
				box[count] = rand;
				next[rand] = rand;
				count++;;
			}
		}while(count<10);
		
		for(int i=0;i<box.length;i++) {
			if(box[i]==0) {
				box[i] = daburi;
			}else {
				continue;
			}
		}
		return box;
	}
	
	static void printArray(int[] array) {
		for(int n:array){
			out.print(n+" ");
		}
		out.print(":");
	}
	
}

/*格納先の配列box
 * 格納先の添え字の番号を管理する配列next
 * これらの連携でダブりなくかつランダムに格納*/
