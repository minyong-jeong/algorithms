import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	for (int i = 0; i < t; i++) {
    		StringTokenizer strtok = new StringTokenizer(br.readLine());
    		int M = Integer.parseInt(strtok.nextToken());
    		int N = Integer.parseInt(strtok.nextToken());
    		int x = Integer.parseInt(strtok.nextToken());
    		int y = Integer.parseInt(strtok.nextToken());
    		
    		int end = M * N / Math.min(M, N);
    		int count = 0;
    		int result = -1;
    		while (count <= end) {
        		if ((M * count + x - y) % N == 0) {
        			result = M * count + x;
        			break;
        		}
        		count++;
    		}
    		bw.write(result + "\n");
    	}
    	
    	bw.flush();
    }
    
}
