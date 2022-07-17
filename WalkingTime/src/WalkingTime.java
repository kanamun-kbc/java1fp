import static java.lang.System.*;

import java.util.Scanner;
/*距離と時速から目的地までにかかる時間を計算する*/
public class WalkingTime {
	static Scanner sc = new Scanner(System.in);;
	public static void main(String[] args) {
		
		out.print("目的地までの距離(km)と時速(km/h)を入力してください。\n");
		out.print("距離(km) :");
		double Distance = sc.nextDouble();
		out.print("時速(km/h) :");
		double Speed = sc.nextDouble();
		
		double wrk = 0.0;;//分単位で預かる
		int hour = 0;;//時
		int minute = 0;;//分
		/*時と分だけ表示, 秒数が生じたら分に1を加算
		 * 1時間かからない場合は分のみ表示*/
		/*km/hourをkm/minuteに変換し計算しやすくする
		 * km/minute=(1/60)*km/hour*/
		/*km/(km/minute)=minute*/
		
		wrk = Distance*60/Speed;;//かかる時間(単位は分, 小数点付き)
		
		for(;wrk>60;wrk-=60) {
			hour++;;
		}
		for(;minute<wrk;minute++) {}
		
		out.print("目的地まで、");;
		if(hour==0) {
			out.print(minute+"分です。");;
		}else {
			out.print(hour+"時間"+minute+"分です。");;
		}
		
	}
}
