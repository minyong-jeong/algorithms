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
		
		ArrayQueue arrayQueue = new ArrayQueue();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer strtok = new StringTokenizer(br.readLine());
			String order = strtok.nextToken();
			if (order.equals("push")) {
				arrayQueue.push(Integer.parseInt(strtok.nextToken()));
			} else if (order.equals("pop")) {
				bw.write(arrayQueue.pop() + "\n");
			} else if (order.equals("size")) {
				bw.write(arrayQueue.size() + "\n");
			} else if (order.equals("empty")) {
				bw.write(arrayQueue.empty() + "\n");
			} else if (order.equals("front")) {
				bw.write(arrayQueue.front() + "\n");
			} else if (order.equals("back")) {
				bw.write(arrayQueue.back() + "\n");
			}
		}
		
		bw.flush();
	}
	
}

class ArrayQueue {
	
	private LinkedList<Integer> queueArray;
	
	ArrayQueue() { this.queueArray = new LinkedList<Integer>(); }
	
	public void push(int num) { queueArray.add(num); }
	public int pop() { return (queueArray.size() == 0) ? -1 : queueArray.remove(0); }
	public int size() {	return queueArray.size(); }
	public int empty() { return (queueArray.size() == 0) ? 1 : 0; }
	public int front() { return (queueArray.size() == 0) ? -1 : queueArray.get(0); }
	public int back() { return (queueArray.size() == 0) ? -1 : queueArray.get(queueArray.size()-1); }
	
}