/*ツェラーの公式ver.*/
public class DayoftheWeek {
	public static void main(String[] args) {
		
		int year=0, month=0, day=0;;
		
		int weeka=0;;
		
		System.out.print("年:");;
		year = new java.util.Scanner(System.in).nextInt();;
		System.out.print("月:");;
		month = new java.util.Scanner(System.in).nextInt();;
		System.out.print("日:");;
		day = new java.util.Scanner(System.in).nextInt();;
		
		
		/*3月スタートの1月2月を13月14月と考える
		 * うるう年で影響があるのは2月だからこの方が考えやすく計算しやすい*/
	     if (month < 3) {
	         year--;;
	         month += 12;;
	     }
	     
	     /*ツェラーの公式*/
		 weeka = (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + day) % 7;;
		
		 
		 /*出力前に年と月を元に戻しておく*/
		 if(month>12) {
			 year++;;
			 month-=12;;
		 }
		Weekly(weeka,year,month,day);;
	}
	
	
	public static void Weekly(int weeka,int year, int month, int day) {
		switch(weeka) {
		
		case 0:
			System.out.print(year+"年"+month+"月"+day+"日は日曜日です");;
			break;
		case 1:
			System.out.print(year+"年"+month+"月"+day+"日は月曜日です");;
			break;
		case 2:
			System.out.print(year+"年"+month+"月"+day+"日は火曜日です");;
			break;
		case 3:
			System.out.print(year+"年"+month+"月"+day+"日は水曜日です");;
			break;
		case 4:
			System.out.print(year+"年"+month+"月"+day+"日は木曜日です");;
			break;
		case 5:
			System.out.print(year+"年"+month+"月"+day+"日は金曜日です");;
			break;
		case 6:
			System.out.print(year+"年"+month+"月"+day+"日は土曜日です");;
			break;
		}
		
		return;
	}
}
