import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] people = new int[15][15];
        for (int i = 1; i < 15; i++)
        	people[0][i] = i;


        for (int i = 1; i < 15; i++) {
        	int sum = 0;
        	for (int j = 1; j < 15; j++) {
        		sum += people[i-1][j];
        		people[i][j] = sum;
        	}
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	int k = Integer.parseInt(br.readLine());
        	int n = Integer.parseInt(br.readLine());

        	bw.write(Integer.toString(people[k][n]));
        	bw.write('\n');
        }

        bw.flush();
	}

}
