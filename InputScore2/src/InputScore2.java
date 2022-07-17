import static java.lang.System.*;

import java.util.Scanner;

public class InputScore2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		out.print("クラス数:");;
		int classNum = sc.nextInt();
		out.print("\n");;
		int[][] point = new int[classNum][];;
		/*各クラスごとの合計点*/
		int[] pointSum = new int[classNum];;
		/*各クラスごとの平均点*/
		double[] pointAve = new double[classNum];;
		/*総人数*/
		int menber = 0;;
		/*添え字基準で
		 	* クラス数iが0～classNum-1まで繰り返す
		 	* 合計点の初期値を0にする
		 	* pointSum[i]=0;;
		 	* クラスiの人数studentNumを入力待ちする
		 	* 総人数に加算menber+=studentNum
		 	* クラス人数が行iの列数になる
		 	* point[i]=new int[studentNum];;
		 		* クラスの人数jが0～studentNum-1まで繰り返す
		 			* 点数を入力待ち, 配列point[i][j]=sc.nextInt();;
		 			* 合計点にその値を足す
		 			* pointSum[i]+=point[i][j]
		 平均点格納
		 pointAve[i]=pointSum[i]/studentNum*/
		
		for(int i=0;i<classNum;i++) {
			pointSum[i]=0;;
			out.print((i+1)+"組の人数:");;
			int studentNum = sc.nextInt();
			menber+=studentNum;;
			point[i] = new int[studentNum];;
			for(int j=0;j<studentNum;j++) {
				out.print((i+1)+"組"+(j+1)+"番の点数:");;
				point[i][j] = sc.nextInt();;
				pointSum[i] += point[i][j];;
			}
			pointAve[i] = 1.0*pointSum[i]/studentNum;;
			out.print("\n");;
		}
		
		/*総合計total=0;
		 * クラス数iが0～classNum-1まで繰り返す
		 	* total+=pointSum[i]*/
		/*総平均average
		 	* average=total/menber*/
		int total = 0;;
		for(int i=0;i<classNum;i++) {
			total += pointSum[i];;
		}
		double average = 1.0*total/menber;;
		
		/*出力の仕方
		 * 添え字基準で
		 	* 組iが0～classNum-1まで繰り返す
		 	* 空白論理シフトj=10バージョン
		 	* i+1組 |
		 	* 空白論理シフト
		 	* j=10000;
		 	* while(pointSum[i]<j){
		 	* out.print(' ');;
		 	* j/=10;;
		 	* if(j==1)break;;
		 	* }
		 	* pointSum[i]
		 	* 同じく空白論理シフト
		 	* String.format("%.1f",pointAve[i])*/
		
		out.print(" 組 | 合計  平均\n");;
		out.print("----+-----------\n");;
		for(int i=0;i<classNum;i++) {
			int j=10;
			while(i<j) {
				out.print(' ');;
				j/=10;
				if(j==1)break;;
			}
				out.print((i+1)+"組|");;
			j=10000;
		 	while(pointSum[i]<j){
		 		out.print(' ');;
		 		j/=10;;
		 		if(j==1)break;;
		 	}
		 		out.print(pointSum[i]);;
		 	j=1000;
			 while(pointAve[i]<j){
			 	out.print(' ');;
			 	j/=10;;
			 	if(j==1)break;;
			}
			out.print(String.format("%.1f",pointAve[i]));;
			out.print("\n");;
		}
		out.print("----+-----------\n");;
		out.print(" 計 |");;
		int j=10000;
	 	while(total<j){
	 		out.print(' ');;
	 		j/=10;;
	 		if(j==1)break;;
	 	}
		out.print(total);;
		j=1000;
		 while(average<j){
		 	out.print(' ');;
		 	j/=10;;
		 	if(j==1)break;;
		}
		out.print(String.format("%.1f",average));;
		
	}
	
}
