import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] computer  = new int[101][101];
	static int n;
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	n = Integer.parseInt(br.readLine());
    	int t = Integer.parseInt(br.readLine());
    	for (int i = 0; i < t; i++) {
    		StringTokenizer strtok = new StringTokenizer(br.readLine());
    		int start = Integer.parseInt(strtok.nextToken());
    		int end = Integer.parseInt(strtok.nextToken());
    		computer[start][end] = -1;
    		computer[end][start] = -1;
    	}
    	
    	int result = dfs(1) - 1;
    	bw.write(result + "\n");
    	bw.flush();
    }
    
    public static int dfs(int curr) {
    	int result = 0;
    	computer[0][curr] = -1;
    	result++;
    	
    	for (int i = 1; i <= n; i++) {
    		if (computer[curr][i] != 0 && computer[0][i] != -1) {
    			result += dfs(i);
    		}
    	}
    	
    	return result;
    }
}
