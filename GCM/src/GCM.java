/*最大公約数*/
public class GCM {
	public static void main(String[] args) {
		
		/*2つの数*/
		int a=0;;
		int b=0;;
		/*余り*/
		int c=0;;
		/*交換用の枠*/
		int t=0;;
		
		/*aとbを入力する
		 * このとき大きさの違いは問わない*/
		System.out.println("aとbを入力");;
		System.out.print("a = ");;
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("b = ");;
		b=new java.util.Scanner(System.in).nextInt();
		
		/*a>bでそろえる*/
		if(b>a) {
			t=a;;
			a=b;;
			b=t;;
		}
		
		/*cが0になるまでユークリッドの互除法続ける*/
		do {
			c=a%b;;
			if(c!=0) {
				a=b;
				b=c;
			}
		}while(c!=0);
		
		System.out.println("GCM = "+b);;
	}
}
