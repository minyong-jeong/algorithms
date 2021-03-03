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
		int N = Integer.parseInt(strtok.nextToken());
		int M = Integer.parseInt(strtok.nextToken());
		int[][] arr1 = new int[N][M];
		for (int i = 0; i < N; i++) {
			strtok = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr1[i][j] = Integer.parseInt(strtok.nextToken());
			}
		}
		strtok = new StringTokenizer(br.readLine());
		M = Integer.parseInt(strtok.nextToken());
		int K = Integer.parseInt(strtok.nextToken());
		int[][] arr2 = new int[M][K];
		for (int i = 0; i < M; i++) {
			strtok = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				arr2[i][j] = Integer.parseInt(strtok.nextToken()); 
			}
		}
		
		int[][] result = new int[N][K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				for (int q = 0; q < M; q++) {
					result[i][j] += arr1[i][q] * arr2[q][j];
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K - 1; j++) {
				bw.write(result[i][j] + " ");
			}
			bw.write(result[i][K-1] + "\n");
		}
		
		bw.flush();
	}
	
}