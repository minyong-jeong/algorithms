import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        		String[] str = br.readLine().split(" ");
        		int h = Integer.parseInt(str[0]);
        		int w = Integer.parseInt(str[1]);
        		int n = Integer.parseInt(str[2]);
        		
        		int j = 1;
        		int k = 1;
        		for (j = 1; j <= w; j++) {
        			for (k = 1; k <= h; k++) {
        				n--;
        				if (n == 0)
        					break;
        			}
        			if (n == 0)
    					break;
        		}
        		
        		if (j < 10)
        			bw.write(k + "0" + j);
        		else
        			bw.write(k + "" + j);
        		
        		bw.write('\n');
        }
        
 
		bw.flush();
 
	}
 
}