import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 0; i < 3; i++) {
        	String[] str = br.readLine().split(" ");
        	int result = 0;
        	for (int j = 0; j < str.length; j++) {
        		if (Integer.parseInt(str[j]) == 0)
        			result++;
        	}
        	
        	switch(result) {
        		case 1:
        			bw.write("A\n");
        			break;
        		case 2:
        			bw.write("B\n");
        			break;
        		case 3:
        			bw.write("C\n");
        			break;
        		case 4:
        			bw.write("D\n");
        			break;
        		case 0:
        			bw.write("E\n");
        			break;
        	}
        }
        
        bw.flush();
	}
	
}
