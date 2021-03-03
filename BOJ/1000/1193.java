import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static char[][] result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int i = 1;
        int sum = 0;
        while (sum + i < num) {
        	sum += i;
        	i++;
        }
        
        int remain = num - sum;
        if (i%2 == 1)
        	bw.write((i-remain+1) + "/" + remain);
        else
        	bw.write(remain + "/" + (i-remain+1));
        bw.write('\n');
        bw.flush();
	}
	
}
