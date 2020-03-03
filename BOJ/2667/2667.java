import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	static int[][] map = new int[25][25];
	static boolean[][] visited = new boolean[25][25];
	static int n;
	
	static final int[] dx = { -1, 0, 1, 0 };
	static final int[] dy = { 0, 1, 0, -1 };
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	n = Integer.parseInt(br.readLine());
    	for (int i = 0; i < 25; i++) Arrays.fill(visited[i], false);
    	for (int i = 0; i < n; i++) {
    		char[] line = br.readLine().toCharArray();
    		for (int j = 0; j < n; j++) {
    			map[i][j] = line[j] - 48;
    		}
    	}
    	
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < n; j++) {
    			if (!visited[i][j]) {
    				int result = dfs(i, j);
    				if (result != 0) {
    					int index = 0;
    					for (int item : list) {
    						if (result <= item) break;
    						index++;
    					}
    					list.add(index, result);  
    				}
    			}
    		}
    	}
    	
    	bw.write(list.size() + "\n");
    	for (int i : list) bw.write(i + "\n");
    	bw.flush();
    }
    
    public static int dfs(int x, int y) {
    	int result = 0;
    	
    	if (x < 0 || x >= n || y < 0 || y >= n || map[x][y] == 0 || visited[x][y]) return 0;
    	
    	visited[x][y] = true;
    	result++;
    	
    	for (int i = 0; i < 4; i++) {
    		result += dfs(x + dx[i], y + dy[i]);
    	}
    	
    	return result;
    }
}
