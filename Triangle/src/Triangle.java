
public class Triangle {
	public static void main(String[] args) {
		double a=0;;
		double b=0;;
		double c=0;;
		double s=0;;
		double area0=0;;
		int area=0;;
		
		System.out.println("三辺の長さを入力");;
		System.out.print("辺１:");;
		a=new java.util.Scanner(System.in).nextDouble();;
		System.out.print("辺２:");;
		b=new java.util.Scanner(System.in).nextDouble();;
		System.out.print("辺３:");;
		c=new java.util.Scanner(System.in).nextDouble();;
		
		if((a+b)>c && (b+c)>a && (c+a)>b) {
			
			s=(a+b+c)/2;;
			
			area0=Math.sqrt(s*(s-a)*(s-b)*(s-c));;
			area=(int)area0;;
			
			System.out.println("面積:"+area);;
			
		}else {
			
			System.out.println("三角形になりません");;
			
		}
		
		
	}
}
