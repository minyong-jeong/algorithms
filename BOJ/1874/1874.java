import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer strbuf = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int top = -1;
		int[] stack = new int[n];
		
		int curr = 1;
		String result = "";
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			while (curr <= num) {
				stack[++top] = curr;
				curr++;
				strbuf.append("+\n");
			}
			
			if (stack[top] == num) {
				strbuf.append("-\n");
				top--;
			}
		}
		
		if (top == -1) bw.write(strbuf.toString());
		else bw.write("NO");
		bw.flush();
	}
	
}