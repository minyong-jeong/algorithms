import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        int score;
        for (int i = 0; i < 5; i++) {
        	score = Integer.parseInt(br.readLine());
        	if (score < 40)
        		score = 40;
        	sum += score;
        }
        int avg = sum / 5;
        
        bw.write(avg + "\n");
		bw.flush();
		bw.close();
	}
}