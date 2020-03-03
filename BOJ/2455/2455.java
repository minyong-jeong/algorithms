import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int num = 0;
        for (int i = 0; i < 4; i++) {
        	String[] str = br.readLine().split(" ");
        	int out = Integer.parseInt(str[0]);
        	int in = Integer.parseInt(str[1]);
        	num = num - out + in;
        	if (num > max)
        		max = num;
        }
        
        bw.write(max + "\n");
        bw.flush();
	}
}
