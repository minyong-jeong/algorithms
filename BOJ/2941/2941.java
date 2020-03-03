import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        char[] str = br.readLine().toCharArray();
        int result = 0;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
        	int state = 0;
        	if (i < str.length - 2) {
        		String comp = "" + str[i] + str[i+1] + str[i+2];
        		for (int j = 0; j < alphabet.length; j++) {
        			if (comp.equals(alphabet[j])) {
        				i = i + 2;
        				result++;
        				state = 1;
        				break;
        			}
        		}
        	}
        	
        	if (i < str.length - 1 && state != 1) {
        		String comp = "" + str[i] + str[i+1];
        		for (int j = 0; j < alphabet.length; j++) {
        			if (comp.equals(alphabet[j])) {
        				i = i + 1;
        				result++;
        				state = 1;
        				break;
        			}
        		}
        	}
        	
        	if (state != 1)
        		result++;
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
	}
}