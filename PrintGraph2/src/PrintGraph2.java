import static java.lang.System.*;

import java.util.Scanner;
public class PrintGraph2 {
	static Scanner sc = new Scanner(System.in);
	static int [] score={
				1, 62, 3, 4,65, 6, 7,68, 9,10,
				41,42,43,44,55,56,57,58,69,60,
				21,22,23,24,25,36,37,38,39,30,
				41,42,43,44,45,46,57,58,59,50,
				61,62,73,74,75,86,87,38,95,100}; //得点
	public static void main(String[] args) {
		
		
				int cnt,i;
				int[] sum = {0,0,0,0,0}; //各区分の人数集計
				char[] kbn = {'A','B','C','D','E'}; //各区分名
		
		/*80～100 kbn[0] sum[0]++
		 * 60～79 kbn[1] sum[1]++
		 * 40～59 kbn[2] sum[2]++
		 * 20～39 kbn[3] sum[3]++
		 *  0～19  kbn[4] sum[4]++
		 *  
		 *  全体人数score.length
		 *  区分人数sum[i]
		 * */
		
		cnt = 0;
		while(cnt!=score.length) {
			if(score[cnt]>79) {
				sum[0]++;;
			}else if(score[cnt]>59) {
				sum[1]++;;
			}else if(score[cnt]>39) {
				sum[2]++;;
			}else if(score[cnt]>19) {
				sum[3]++;;
			}else {
				sum[4]++;;
			}
			cnt++;;
		}
		
		for(int j=0;j<kbn.length;j++) {
				out.printf("区分%c ",kbn[j]);
				for(int k=0;k<sum[j];k++) {
					out.print("*");
				}
				out.printf("%d人(%d%c)\n", sum[j],(sum[j]*100/score.length),'%');
		}
		
	}
}
