/*三平方の定理を求める
 * 各辺2以上100以下
 * a<=b<=cの関係とする
 * 各辺とは言っているが, 一番長さのあるc
 * これが100以下であるときa, bも100以下であることは自明
 * cが2から100の間繰り返す.インクリメント
 * bが2からcの間繰り返す(c以下だから). インクリメント
 * aが2からbの間繰り返す(b以下だから). インクリメント
 * もしa^2+b^2がc^2と同じならは, 各値を表示する*/
public class Pythagoras {
	public static void main(String[] args) {
		
		for(int c=2;c<=100;c++) {
			for(int b=2;b<=c;b++) {
				for(int a=2;a<=b;a++) {
					if((a*a+b*b)==c*c) {
						System.out.println("a = "+a+" b = "+b+" c = "+c);;
					}
				}
			}
		}
		
		
	}
}
