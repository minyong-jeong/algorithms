import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] table;
	static int max = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		table = new int[N + 1][2];
		StringTokenizer strtok;
		for (int i = 1; i <= N; i++) {
			strtok = new StringTokenizer(br.readLine());
			table[i][0] = Integer.parseInt(strtok.nextToken());
			table[i][1] = Integer.parseInt(strtok.nextToken());
		}
		
		solve();
		
		bw.write(max + "\n");
		bw.flush();
	}
	
	public static void solve() {
		for (int i = 1; i <= N; i++) {
			dfs(i, 0);
		}
	}
	
	public static void dfs(int day, int earn) {
		int nextDay = day + table[day][0];
		
		if (nextDay >= N + 1) {
			if (nextDay == N + 1) earn += table[day][1];
			if (earn > max) max = earn;
			return;
		}
		
		earn += table[day][1];
		for (int i = nextDay; i <= N; i++) {
			dfs(i, earn);
		}
	}
	
}