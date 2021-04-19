package sw.academy.d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddSum {
	/**
	 *
	 * @see <a href="https://swexpertacademy.com/main/main.do">홀수만 더하기</a>
	 * */
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				int t = Integer.parseInt(st.nextToken());
				if(t%2==1){
					sum+=t;
				}
			}
			System.out.println("#"+test_case+" "+ sum);
		}
	}
}
