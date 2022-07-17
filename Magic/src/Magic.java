import static java.lang.System.*;

import java.util.Scanner;
public class Magic {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.print("n = ");
		/*nの値を入力待ち*/
		int n = sc.nextInt();
		/*int型配列n*nのアドレスを生成*/
		int[][] seet = new int[n][n];
		/*nを割った余りが0or1で配列への格納の仕方を変える*/
		switch(n%2) {
		case 0:
			seet = evenNumber(n);
			break;
		case 1:
			seet = oddNumber(n);
			break;
		}
		printArray(seet);
	}
	
	static int[][] oddNumber(int n){
		int[][] seet = new int[n][n];
		seet[0][n/2] = 1;
		int high = 0;
		int wide = n/2;
		for(int i=2;i<=(n*n);i++) {
			high--;if(high<0) {high=n-1;}
			wide++;if(wide>(n-1)) {wide=0;}
			if(seet[high][wide]==0) {
				seet[high][wide]=i;
			}else {
				high++;if(high>(n-1)){high=0;}
				wide--;if(wide<0){wide=n-1;}
				high++;if(high>(n-1)){high=0;}
				seet[high][wide]=i;
			}
		}
		return seet;
	}
	
	static int[][] evenNumber(int n){
		int[][] seet = new int[n][n];
		int[][] seet2 = new int[n][n];
		int i=1;
		for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) {
				seet[j][k] = i;
				seet2[j][k] = n*n-i+1;
				if(j==k || j+k==n-1) {
					seet[j][k] = seet2[j][k];
				}
				i++;
			}
		}
		return seet;
	}
	
	static void printArray(int[][] array) {
		for(int i=1;i<=(2*array.length+1);i++) {
			switch(i%2) {
			case 0:
				out.print("|");
				for(int k=0;k<array.length;k++) {
					out.printf("%3d|", array[(i/2-1)][k]);
				}
				out.print("\n");
				break;
			case 1:
				for(int j=0;j<array.length;j++) {
					out.print("+---");
				}
				out.print("+\n");
				break;
			}
		}
	}
}
