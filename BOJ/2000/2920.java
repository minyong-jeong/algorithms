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
        int state = (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) ? 1 : 2;
        int pre = Integer.parseInt(arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int curr = Integer.parseInt(arr[i]);
            if (state == 1) {
                if (pre < curr) {
                    state = -1;
                    break;
                }
            }
            else {
                if (pre > curr) {
                    state = -1;
                    break;
                }
            }
            pre = curr;
        }

        if (state == 1) {
            bw.write("descending\n");
        }
        else if (state == 2) {
            bw.write("ascending\n");
        }
        else {
            bw.write("mixed\n");
        }
		
		bw.flush();
		bw.close();
	}
}