import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static final int BLANK = 0;
	static final int WALL = 1;
	static final int VIRUS = 2;
	static final int ADDWALL = 3;
	static final int[] dRow = {0, -1, 0, 1};
	static final int[] dCol = {-1, 0, 1, 0};
	
	static int N, M;
	static int[][] map = new int[9][9];
	static int totalWall = 0;
	static int max = -1;
	static int totalArea;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer strtok = new StringTokenizer(br.readLine());
		N = Integer.parseInt(strtok.nextToken());
		M = Integer.parseInt(strtok.nextToken());
		totalArea = N * M;
		
		for (int i = 0; i < N; i++) {
			strtok = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(strtok.nextToken());
				if (map[i][j] == WALL) totalWall++;
			}
		}
		
		int[] wallPos = new int[ADDWALL];
		solve(wallPos, 0, 0);
		
		bw.write(max + "\n");
		bw.flush();
	}
	
	static void solve(int[] arr, int wallNum, int curr) {
        if (wallNum == ADDWALL) {
            makeMap(arr);
            findSafetyArea();
            rollbackMap(arr);
            return;
        }

        if (curr == totalArea) {
            return;
        }
        
        if (map[curr / M][curr % M] == BLANK) {
            arr[wallNum] = curr;
            solve(arr, wallNum + 1, curr + 1);
        }
        solve(arr, wallNum, curr + 1);
    }
	
	static void makeMap(int[] arr) {
        for (int i = 0; i < ADDWALL; i++) {
            int row = arr[i] / M;
            int col = arr[i] % M;
            map[row][col] = WALL;
        }
    }
	
	static void findSafetyArea() {

        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], false);
        }

        int numOfVirus = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == VIRUS && !visited[i][j]) {
                    numOfVirus += virusArea(i, j, visited);
                }
            }
        }

        max = Math.max(max, totalArea - (numOfVirus + totalWall + ADDWALL));
    }

    static int virusArea(int row, int col, boolean[][] visited) {
        visited[row][col] = true;

        int ret = 1;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dRow[i];
            int nextCol = col + dCol[i];

            if (nextRow >= 0 && nextRow < N && nextCol >= 0 && nextCol < M) {
	            if (map[nextRow][nextCol] != WALL && !visited[nextRow][nextCol]) {
	                ret += virusArea(nextRow, nextCol, visited);
	            }
            }
        }

        return ret;
    }
    
    static void rollbackMap(int[] arr) {
        for (int i = 0; i < ADDWALL; i++) {
            int row = arr[i] / M;
            int col = arr[i] % M;
            map[row][col] = BLANK;
        }
    }
}