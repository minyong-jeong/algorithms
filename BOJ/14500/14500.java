import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] table;
	static int row;
	static int col;
	static int max = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer strtok = new StringTokenizer(br.readLine());
		row = Integer.parseInt(strtok.nextToken());
		col = Integer.parseInt(strtok.nextToken());
		table = new int[row][col];
		for (int i = 0; i < row; i++) {
			strtok = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				table[i][j] = Integer.parseInt(strtok.nextToken());
			}
		}
		
		tetromino();
		bw.write(max + "\n");
		bw.flush();
	}
	
	public static void tetromino() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < 4; k++) {
					block1(i, j, k, 1, 0);
					block2(i, j, k, 1, 0, -1);
					block3(i, j, k, 1, 0);
					block4(i, j, k, 1, 0);
					block5(i, j, k, 1, 0);
				}
			}
		}
	}
	
	// ㅡ
	public static void block1(int x, int y, int d, int curr, int sum) {
		if (x >= row || x < 0) return;
		if (y >= col || y < 0) return;
		
		sum += table[x][y];
		
		if (curr == 4) {
			if (sum > max) max = sum;
			return;
		}
		
		if (d == 0) block1(x-1, y, d, curr+1, sum);
		else if (d == 1) block1(x, y+1, d, curr+1, sum);
		else if (d == 2) block1(x+1, y, d, curr+1, sum);
		else if (d == 3) block1(x, y-1, d, curr+1, sum);
	}
	
	// ㄹ
	public static void block2(int x, int y, int d, int curr, int sum, int pre) {
		if (x >= row || x < 0) return;
		if (y >= col || y < 0) return;
		
		sum += table[x][y];
		
		if (curr == 4) {
			if (sum > max) max = sum;
			return;
		}
		
		if (curr == 2) {
			int d1 = (d + 3) % 4;
			if (d1 == 0) block2(x-1, y, d1, curr+1, sum, 0);
			else if (d1 == 1) block2(x, y+1, d1, curr+1, sum, 0);
			else if (d1 == 2) block2(x+1, y, d1, curr+1, sum, 0);
			else if (d1 == 3) block2(x, y-1, d1, curr+1, sum, 0);
			d = (d + 1) % 4;
		}
		if (curr == 3) {
			if (pre == 0) d = (d + 1) % 4;
			else if (pre == 1) d = (d + 3) % 4;
		}
		
		if (d == 0) block2(x-1, y, d, curr+1, sum, 1);
		else if (d == 1) block2(x, y+1, d, curr+1, sum, 1);
		else if (d == 2) block2(x+1, y, d, curr+1, sum, 1);
		else if (d == 3) block2(x, y-1, d, curr+1, sum, 1);
	}
	
	// ㅁ
	public static void block3(int x, int y, int d, int curr, int sum) {
		if (x >= row || x < 0) return;
		if (y >= col || y < 0) return;
		
		sum += table[x][y];
		
		if (curr == 4) {
			if (sum > max) max = sum;
			return;
		}
		
		if (curr == 1) d = (d + 1) % 4;
		if (curr == 2) d = (d + 1) % 4;
		if (curr == 3) d = (d + 1) % 4;
		
		if (d == 0) block3(x-1, y, d, curr+1, sum);
		else if (d == 1) block3(x, y+1, d, curr+1, sum);
		else if (d == 2) block3(x+1, y, d, curr+1, sum);
		else if (d == 3) block3(x, y-1, d, curr+1, sum);
	}
	
	// ㄴ
	public static void block4(int x, int y, int d, int curr, int sum) {
		if (x >= row || x < 0) return;
		if (y >= col || y < 0) return;
		
		sum += table[x][y];
		
		if (curr == 4) {
			if (sum > max) max = sum;
			return;
		}
		
		if (curr == 3) {
			int d1 = (d + 3) % 4;
			if (d1 == 0) block4(x-1, y, d1, curr+1, sum);
			else if (d1 == 1) block4(x, y+1, d1, curr+1, sum);
			else if (d1 == 2) block4(x+1, y, d1, curr+1, sum);
			else if (d1 == 3) block4(x, y-1, d1, curr+1, sum);
			d = (d + 1) % 4;
		}
		
		if (d == 0) block4(x-1, y, d, curr+1, sum);
		else if (d == 1) block4(x, y+1, d, curr+1, sum);
		else if (d == 2) block4(x+1, y, d, curr+1, sum);
		else if (d == 3) block4(x, y-1, d, curr+1, sum);
	}
	
	// ㅜ
	public static void block5(int x, int y, int d, int curr, int sum) {
		if (x >= row || x < 0) return;
		if (y >= col || y < 0) return;
		
		sum += table[x][y];
		
		if (curr == 3) {
			if (sum > max) max = sum;
			return;
		}
		
		if (curr == 2) {
			int middleDirection = (d + 1) % 4;
			int add = 0;
			if (middleDirection == 0) add = block5Middle(x-1, y);
			else if (middleDirection == 1) add = block5Middle(x, y+1);
			else if (middleDirection == 2) add = block5Middle(x+1, y);
			else if (middleDirection == 3) add = block5Middle(x, y-1);
			if (add == -1) return;
			sum += add;
		}
		
		if (d == 0) block5(x-1, y, d, curr+1, sum);
		else if (d == 1) block5(x, y+1, d, curr+1, sum);
		else if (d == 2) block5(x+1, y, d, curr+1, sum);
		else if (d == 3) block5(x, y-1, d, curr+1, sum);
	}
	
	public static int block5Middle(int x, int y) {
		if (x >= row || x < 0) return -1;
		if (y >= col || y < 0) return -1;
		
		return table[x][y];
	}
}