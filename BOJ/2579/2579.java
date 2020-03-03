import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	int[] stair = new int[t];
    	int[][] result = new int[t][2];
    	
    	for (int i = 0; i < t; i++) {
    		stair[i] = Integer.parseInt(br.readLine());
    	}
    	
    	result[0][0] = stair[0];
    	result[1][0] = stair[0] + stair[1];
    	result[1][1] = stair[1];
    	for (int i = 2; i < t; i++) {
    		result[i][0] = result[i-1][1] + stair[i];
    		result[i][1] = Math.max(result[i-2][0], result[i-2][1]) + stair[i];
    	}
    	
    	bw.write(Math.max(result[t-1][0], result[t-1][1]) + "\n");
    	bw.flush();
    }
    
}
