import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer strtok = new StringTokenizer(br.readLine());
        
        int row = Integer.parseInt(strtok.nextToken());
        int column = Integer.parseInt(strtok.nextToken());
        
        strtok = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(strtok.nextToken());
        int y = Integer.parseInt(strtok.nextToken());
        int d = Integer.parseInt(strtok.nextToken());
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        
        int[][] map = new int[row][column];
        for (int i = 0; i < row; i++) {
        		strtok = new StringTokenizer(br.readLine());
        		for (int j = 0; j < column; j++) {
        			map[i][j] = Integer.parseInt(strtok.nextToken());
        		}
        }
        
        int count = 0;
        while (true) {
        		int cd;
        		int cx;
        		int cy;
        		
        		if (map[x][y] == 0) {
        			count++;
        			map[x][y] = 2;
        		}
        		
        		boolean proceed = false;
        		for (int i = 0; i < 4; i++) {
        			cd = (d + 3) % 4;
        			cx = x + dx[cd];
        			cy = y + dy[cd];
        			
        			if (map[cx][cy] == 0) {
        				x = cx;
        				y = cy;
        				d = cd;
        				proceed = true;
        				break;
        			} else {
        				d = cd;
        			}
        		}
        		
        		if (!proceed) {
        			if (map[x-dx[d]][y-dy[d]] == 1)
        				break;
        			else {
        				x = x - dx[d];
        				y = y - dy[d];
        			}
        		}
        }
        
        bw.write(count + "\n");
		bw.flush();
	}
}