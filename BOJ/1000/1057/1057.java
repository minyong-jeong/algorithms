import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer strtok = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(strtok.nextToken());
		int kim = Integer.parseInt(strtok.nextToken());
		int im = Integer.parseInt(strtok.nextToken());
		
		int round = 1;
		int[] board = new int[n + 2];
		board[kim] = 1; 
		board[im] = 1;
		
		boolean end = false;
		while(n != 1) {
			int[] temp = new int[n + 2];
			int count = 0;
			for (int i = 1; i <= n; i = i + 2) {
				int user1 = board[i];
				int user2 = board[i+1];
				
				if (user1 + user2 == 2) {
					end = true;
					break;
				}
				
				temp[++count] = Math.max(user1, user2);
			}
			
			if (end) break;
			board = temp;
			n = count;
			round++;
		}
		
		if (end) bw.write(round + "\n");
		else bw.write("-1\n");
		bw.flush();
	}
	
}