import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
    		int num = scan.nextInt();
    		int[] result = new int[n];
    		int count = 0;
    		for (int i = 0; i < n; i++) {
    			int compNum = scan.nextInt();
    			if (num > compNum)
    				result[count++] = compNum;
    		}
    		
    		for (int i = 0; i < count - 1; i++) {
    			System.out.print(result[i] + " ");
    		}
    		System.out.println(result[count - 1]);
    }        
    
}