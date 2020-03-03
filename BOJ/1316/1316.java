import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
        	int ans = 0;
        	int[] alphabet = new int[26];
        	char[] str = br.readLine().toCharArray();
        	char pre = str[0];
        	alphabet[pre-'a'] = 1;
        	for (int j = 0; j < str.length; j++) {
        		char curr = str[j];
        		if (curr != pre) {
        			if (alphabet[curr-'a'] == 1) {
        				ans = -1;
        				break;
        			}
        			else {
        				alphabet[curr-'a'] = 1;
        			}
        		}
        		pre = curr;
        	}
        	
        	if (ans != -1)
        		result++;
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
	}
}