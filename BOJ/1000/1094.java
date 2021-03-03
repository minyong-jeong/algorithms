import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int curr = 64;
        int size = 0;
        int total = 0;
        
        while(num != size) {
        	if (size + curr > num) {
        		curr = curr / 2;
        	}
        	else {
        		total++;
        		size = size + curr;
        		curr = curr / 2;
        	}
        }
        
        bw.write(total + "\n");
        bw.flush();
	}
}
