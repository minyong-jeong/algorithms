import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] result = new int[26];
        for (int i = 0; i < 26; i++) {
        	result[i] = -1;
        }
        
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
        	int loc = str.charAt(i) - 'a';
        	if (result[loc] == -1)
        		result[loc] = i;
        }  
        
        String sol = "";
        for (int i = 0; i < 25; i++) {
        	sol = sol + result[i] + " ";
        }
        sol += result[25];
        
        bw.write(sol + "\n");
		bw.flush();
		bw.close();
	}
}