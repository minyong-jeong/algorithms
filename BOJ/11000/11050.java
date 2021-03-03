import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer strtok = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(strtok.nextToken());
    	int K = Integer.parseInt(strtok.nextToken());
    	
    	int result = 1;
    	for (int i = 1; i <= K; i++) {
    		result = result * N / i;
    		N--;
    	}
    	
    	bw.write(result + "\n");
    	bw.flush();
    }
    
}