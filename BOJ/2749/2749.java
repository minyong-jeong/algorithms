import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int mod = 1000000;
        int p = mod / 10 * 15;
        int[] fibo = new int[p];
        fibo[0] = 0;
        fibo[1] = 1;
        
        long n = Long.parseLong(br.readLine());
        for (int i = 2; i < p; i++) {
        	fibo[i] = fibo[i-1] + fibo[i-2];
        	fibo[i] %= mod;
        }
        
        bw.write(fibo[(int)(n%p)] + "\n");
        bw.flush();
	}
}
