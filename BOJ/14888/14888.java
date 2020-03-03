import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int max;
	static int min;
	static int n;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		max = -1000000000;
		min = 1000000000;
		int[] operator = new int[4];
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		// initialize
		String[] arr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) num[i] = Integer.parseInt(arr[i]);
		arr = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) operator[i] = Integer.parseInt(arr[i]);
		
		// dfs
		dfs(1, num[0], operator[0], operator[1], operator[2], operator[3]);
		
		bw.write(max + "\n");
		bw.write(min + "\n");
		bw.flush();
	}
	
	public static void dfs(int curr, int sum, int plus, int minus, int mul, int div) {
		if (curr >= n) {
			if (sum > max) max = sum;
			if (sum < min) min = sum;
			return;
		}
		
		if (plus > 0) dfs(curr + 1, sum + num[curr], plus - 1, minus, mul, div);
		if (minus > 0) dfs(curr + 1, sum - num[curr], plus, minus - 1, mul, div);
		if (mul > 0) dfs(curr + 1, sum * num[curr], plus, minus, mul - 1, div);
		if (div > 0) dfs(curr + 1, sum / num[curr], plus, minus, mul, div - 1);
	}
}