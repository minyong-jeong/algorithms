import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] alphabet = new int[26];
        String str = br.readLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
        	int loc = str.charAt(i) - 'A';
        	alphabet[loc]++;
        }
        
        int max = 0;
        int state = 0;
        for (int i = 1; i < 26; i++) {
        	if (alphabet[max] < alphabet[i]) {
        		max = i;
        		state = 0;
        	}
        	else if (alphabet[max] == alphabet[i])
        		state = 1;
        }
        
        if (state == 1)
        	bw.write("?\n");
        else
        	bw.write((char)(max + 'A') + "\n");
        
		bw.flush();
		bw.close();
	}
}