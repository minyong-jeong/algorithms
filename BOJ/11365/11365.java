import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	String str = br.readLine();
        	if (str.equals("END"))
        		break;
        	
        	char[] sentence = str.toCharArray();
        	for (int i = sentence.length - 1; i >= 0; i--) {
        		bw.write(sentence[i]);
        	}
        	bw.write('\n');
        }
        
        bw.flush();
	}
}
