import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split(" ");
        
        int resultE = Integer.parseInt(arr[0]);
        int resultS = Integer.parseInt(arr[1]);
        int resultM = Integer.parseInt(arr[2]);
        
        int E = 1;
        int S = 1;
        int M = 1;
        int count = 1;
        
        while(true) {
        	if (E == 16) E = 1;
        	if (S == 29) S = 1;
        	if (M == 20) M = 1;
        	
        	if (resultE == E && resultS == S && resultM == M)
        		break;
        	
        	count++;
        	E++;
        	S++;
        	M++;
        }
        
        bw.write(count + "\n");
        bw.flush();
	}
}
