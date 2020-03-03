import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] tree = new int[n][n];
		tree[0][0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			tree[i][0] = tree[i-1][0] + Integer.parseInt(arr[0]);
			for (int j = 1; j < arr.length; j++) {
				int largeNum = Math.max(tree[i-1][j-1], tree[i-1][j]);
				tree[i][j] = largeNum + Integer.parseInt(arr[j]);
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (tree[n-1][i] > max) {
				max = tree[n-1][i];
			}
		}
		
		bw.write(max + "\n");
		bw.flush();
	}
	
}