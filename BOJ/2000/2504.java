import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int top = -1;
		char[] stack = new char[30];
		int[] result = new int[30];
		
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '(' || str[i] == '[') stack[++top] = str[i];
			
			if (str[i] == ')') {
				if (top == -1 || stack[top] != '(') break;
				
				if (result[top+1] == 0) {
					result[top] += 2;
				} else {
					result[top] += result[top+1] * 2;
					result[top+1] = 0;
				}
				
				top--;
			}
			
			if (str[i] == ']') {
				if (top == -1 || stack[top] != '[') break;
				
				if (result[top+1] == 0) {
					result[top] += 3;
				} else {
					result[top] += result[top+1] * 3;
					result[top+1] = 0;
				}
				
				top--;
			}
		}
		
		if (top == -1) bw.write(result[0] + "\n");
		else bw.write("0\n");
		bw.flush();
    }
    
}