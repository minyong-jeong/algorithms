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
    		long start = Integer.parseInt(strtok.nextToken());
    		long end = Integer.parseInt(strtok.nextToken());
    		long dist = end - start;
    		long result = 0;
    		
    		long num = 1;
    		while(true) {
    			if (num * num >= dist) break;
    			num++;
    		}
    		
    		if (num * num - num >= dist) {
    			result = 2 * num - 2;
    		} else {
    			result = 2 * num - 1;
    		}
    		
    		bw.write(result + "\n");
    	}
    	
    	bw.flush();
    }
    
}
