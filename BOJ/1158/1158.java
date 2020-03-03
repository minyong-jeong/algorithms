import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer strtok = new StringTokenizer(br.readLine());
		ArrayQueue arrayQueue = new ArrayQueue();
		
		int n = Integer.parseInt(strtok.nextToken());
		int m = Integer.parseInt(strtok.nextToken());
		int[] arr = new int[5001];
		int curr = 0;
		int count = 0;
		int end = 0;
		while(true) {
			if (end == n) break;
			
			curr++;
			if (arr[curr] == 0) {
				count++;
			}
			
			if (count == m) {
				count = 0;
				arr[curr] = 1;
				arrayQueue.push(curr);
				end++;
			}
			
			if (curr == n) curr = 0;
		}
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("<");
		while (arrayQueue.size() != 1) {
			strbuf.append(arrayQueue.pop());
			strbuf.append(", ");
		}
		strbuf.append(arrayQueue.pop());
		strbuf.append(">\n");
		bw.write(strbuf.toString());
		bw.flush();
	}
	
}

class ArrayQueue {
	
	private LinkedList<Integer> queueArray;
	
	ArrayQueue() { this.queueArray = new LinkedList<Integer>(); }
	
	public void push(int num) { queueArray.add(num); }
	public int pop() { return queueArray.remove(0); }
	public int size() { return queueArray.size(); }
	
}