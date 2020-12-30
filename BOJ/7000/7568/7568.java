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
    	int[][] info = new int[t][2];
    	int[] rank = new int[t];
    	for (int i = 0; i < t; i++) {
    		StringTokenizer strtok = new StringTokenizer(br.readLine());
    		info[i][0] = Integer.parseInt(strtok.nextToken());
    		info[i][1] = Integer.parseInt(strtok.nextToken());
    	}
    	
    	for (int i = 0; i < t; i++) {
    		for (int j = 0; j < t; j++) {
    			if (i != j) {
    				if (info[i][0] < info[j][0] && info[i][1] < info[j][1]) {
    					rank[i]++;
    				}
    			}
    		}
    	}
    	
    	for (int i = 0; i < t-1; i++) bw.write((rank[i] + 1) + " ");
    	bw.write((rank[t-1] + 1) + "\n");
    	bw.flush();
    }
    
}
