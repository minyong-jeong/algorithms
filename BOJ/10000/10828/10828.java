import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int top;
	static int[] stack;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        top = -1;
        stack = new int[10001];
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	String[] str = br.readLine().split(" ");
        	
        	if (str[0].equals("push")) { push(Integer.parseInt(str[1])); }
        	else if (str[0].equals("pop")) { bw.write(pop() + "\n"); }
        	else if (str[0].equals("size")) { bw.write(size() + "\n"); }
        	else if (str[0].equals("empty")) { bw.write(empty() + "\n"); }
        	else if (str[0].equals("top")) { bw.write(top() + "\n"); }
        }
        
        bw.flush();
	}
	
	public static void push(int num) { stack[++top] = num; }
	public static int pop() { return (top > -1) ? stack[top--] : -1; }
	public static int size() { return top + 1; }
	public static int empty() { return (top == -1) ? 1 : 0; }
	public static int top() { return (top != - 1) ? stack[top] : -1; }
	
}