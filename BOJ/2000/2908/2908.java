import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        char[] num1 = str[0].toCharArray();
        char[] num2 = str[1].toCharArray();
        
        int result = 1;
        for (int i = 2; i >= 0; i--) {
        	if (num1[i] > num2[i]) {
        		result = 1;
        		break;
        	}
        	else if (num2[i] > num1[i]){
        		result = 2;
        		break;
        	}
        }
        
        String answer = "";
        for (int i = 2; i >= 0; i--) {
        	if (result == 1) {
        		answer += num1[i];
        	}
        	else {
        		answer += num2[i];
        	}
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
	}
}