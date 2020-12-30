import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int[] cup = new int[4];
        cup[1] = 1;
        cup[2] = 2;
        cup[3] = 3;
        for (int i = 0; i < M; i++) {
        		StringTokenizer strtok = new StringTokenizer(br.readLine());
        		int X = Integer.parseInt(strtok.nextToken());
        		int Y = Integer.parseInt(strtok.nextToken());
        		int temp = cup[X];
        		cup[X] = cup[Y];
        		cup[Y] = temp;
        }
        
        for (int i = 1; i < 4; i++) {
        		if (cup[i] == 1) bw.write(i + "\n");
        }
		bw.flush();
    }
    
}