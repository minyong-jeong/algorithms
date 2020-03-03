import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int d = 1;
	static int[][] table;
	static int nApple;
	static int[] rotate = new int[10001];
	static int nRotate;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static LinkedList<Integer> list = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		table = new int[n][n];
		nApple = Integer.parseInt(br.readLine());
		StringTokenizer strtok;
		for (int i = 0; i < nApple; i++) {
			strtok = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(strtok.nextToken());
			int col = Integer.parseInt(strtok.nextToken());
			table[row-1][col-1] = 1;
		}
		nRotate = Integer.parseInt(br.readLine());
		for (int i = 0; i < nRotate; i++) {
			strtok = new StringTokenizer(br.readLine());
			int second = Integer.parseInt(strtok.nextToken());
			String direction = strtok.nextToken();
			if (direction.equals("L")) rotate[second] = 1;
			else if (direction.equals("D")) rotate[second] = 2;
		}
		int result = snakeGame();
		
		bw.write(result + "\n");
		bw.flush();
	}
	
	static int snakeGame() {
		int x = 0;
		int y = 0;
		int time = 0;
		list.add(0);
		x += dx[d];
		y += dy[d];
		while(true) {
			time++;
			if (x < 0 || x >= n || y < 0 || y >= n) break;
			if (list.contains(x * n + y)) break;
			list.add(x * n + y);
			if (table[x][y] != 1) list.remove(0);
			else table[x][y] = 0;
	        
			if (rotate[time] == 1) d = (d + 3) % 4;
			else if (rotate[time] == 2) d = (d + 1) % 4;
			
			x += dx[d];
			y += dy[d];
		}
		
		return time;
	}
}