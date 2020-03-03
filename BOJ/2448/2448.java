import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static char[][] result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        result = new char[n][n*2-1];
        for (int i = 0; i < n; i++) {
        	Arrays.fill(result[i], ' ');
        }
        
        makeTree(0, n-1, n);
        
        for (int i = 0; i < n; i++) {
        	bw.write(result[i]);
        	bw.write('\n');
        } 
        
        bw.flush();
        bw.close();
	}
	
	public static void makeTree(int x, int y, int n) {
		if (n == 3) {
			result[x][y] = '*';
			result[x+1][y-1] = result[x+1][y+1] = '*';
			result[x+2][y-2] = result[x+2][y-1] = result[x+2][y] = result[x+2][y+1] = result[x+2][y+2] = '*';
			return;
		}
		
		makeTree(x, y, n/2);
		makeTree(x+n/2, y-n/2, n/2);
		makeTree(x+n/2, y+n/2, n/2);
	}
	
}
