import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int[][] video;
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	video = new int[n+1][n+1];
    	for (int i = 1; i <= n; i++) {
    		char[] line = br.readLine().toCharArray();
    		for (int j = 1; j <= n; j++) {
    			video[i][j] = line[j-1] - 48;
    		}
    	}
    	
    	String result = compress(1, 1, n);
    	
    	bw.write(result);
    	bw.write('\n');
    	bw.flush();
    }
    
    public static String compress(int startX, int startY, int n) {
    	StringBuffer strbuf = new StringBuffer();
    	StringBuffer result = new StringBuffer();
    	strbuf.append("(");
    	result.append("(");
    	
    	int test = 0;
    	for (int i = startX; i < startX + n; i++) {
    		for (int j = startY; j < startY + n; j++) {
    			strbuf.append(video[i][j]);
    			test += video[i][j];
    		}
    	}
    	
    	if (test == 0) return "0";
    	else if (test == n * n) return "1";
    	else {
    		if (n != 2) {
    			result.append(compress(startX, startY, n/2));
    			result.append(compress(startX, startY + n/2, n/2));
    			result.append(compress(startX + n/2, startY, n/2));
    			result.append(compress(startX + n/2, startY + n/2, n/2));
    		} else {
    			strbuf.append(")");
    			return strbuf.toString();
    		}
    	}
    	
    	result.append(")");
    	return result.toString();
    }
   
}
