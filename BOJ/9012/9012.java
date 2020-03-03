import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	char[] str = br.readLine().toCharArray();
        	int count = 0;
        	boolean result = true;
        	for (int j = 0; j < str.length; j++) {
        		if (str[j] == '(')
        			count++;
        		else {
        			if (count == 0) {
        				result = false;
        				break;
        			}
        			count--;
        		}
        	}
        	
        	if (count != 0)
        		result = false;
        	
        	if (result) bw.write("YES\n");
        	else bw.write("NO\n");
        }
        
        bw.flush();
	}
	
}
