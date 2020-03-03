import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer strtok = new StringTokenizer(br.readLine());
    	int first = Integer.parseInt(strtok.nextToken());
    	for (int i = 1; i < n; i++) {
    		int temp = Integer.parseInt(strtok.nextToken());
    		int lcm = first * temp / gcd(first, temp);
    		bw.write(lcm/temp + "/" + lcm/first + "\n");
    	}
    	bw.flush();
    }
    
    static int gcd(int a, int b) {
    	return (a % b == 0 ? b : gcd(b, a%b)); 
    }
    
}
