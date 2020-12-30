import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr = new int[10001];
	static int result = 0;
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	for (int i = 0; i < t; i++) {
    		result = 0;
    		int n = Integer.parseInt(br.readLine());
    		StringTokenizer strtok = new StringTokenizer(br.readLine());
    		for (int j = 1; j <= n; j++) arr[j] = Integer.parseInt(strtok.nextToken());
    		for (int j = 1; j <= n; j++) dfs(j);
    		bw.write(result + "\n");
    	}
    	bw.flush();
    }
   
    public static void dfs(int curr) {
    	if (arr[curr] == -1) return;
    	
    	int dest = arr[curr];
    	arr[curr] = -1;
    	if (curr == arr[curr] || arr[dest] == -1) {
    		result++;
    		return;
    	}
    	
    	dfs(dest);
    }
}
