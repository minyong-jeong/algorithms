import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        arr = insertion(arr);
        
        for (int i = 0; i < n; i++) {
        	bw.write(arr[i] + "\n");
        }
        bw.flush();
	}
	
	public static int[] bubble(int[] arr) {
		int len = arr.length;
		boolean loop = true;
		
		while (loop) {
			loop = false;
			for (int i = 1; i < len; i++) {
				if (arr[i-1] > arr[i]) {
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					loop = true;
				}
			}
			len--;
		}
		
		return arr;
	}
	
	public static int[] insertion(int[] arr) {
		int len = arr.length;
		
		for (int i = 1; i < len; i++) {
			int temp = arr[i];
			int curr = i - 1;
			while ((curr >= 0) && (arr[curr] > temp)) {
				arr[curr + 1] = arr[curr];
				curr--;
			}
			arr[curr+1] = temp;
		}
		
		return arr;
	}
}
