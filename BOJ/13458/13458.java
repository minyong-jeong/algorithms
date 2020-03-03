import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] room = new int[n];
		StringTokenizer strtok = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			room[i] = Integer.parseInt(strtok.nextToken());
		}
		strtok = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(strtok.nextToken());
		int C = Integer.parseInt(strtok.nextToken());
		
		long result = 0;
		for (int i = 0; i < n; i++) {
			result++;
			int remain = room[i] - B;
			if (remain > 0) {
				result += (remain % C == 0) ? (remain / C) : (remain / C + 1);
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
	}
	
}