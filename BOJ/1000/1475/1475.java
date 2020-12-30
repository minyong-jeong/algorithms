import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numCase = new int[10];

        char[] num = br.readLine().toCharArray();
        for (int i = 0; i < num.length; i++) {
        	numCase[num[i]-'0']++;
        }

        int max = (numCase[6] + numCase[9]);
        max = (max%2 == 0) ? (max/2) : (max/2 + 1);
        for (int i = 0; i < numCase.length; i++) {
        	if (numCase[i] > max && i != 6 && i != 9)
        		max = numCase[i];
        }

        bw.write(Integer.toString(max));
        bw.write('\n');
        bw.flush();
	}

}
