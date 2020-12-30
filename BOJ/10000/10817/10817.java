import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int[] num = new int[3];
    		num[0] = scan.nextInt();
    		num[1] = scan.nextInt();
    		num[2] = scan.nextInt();
    		
    		for (int i = 0; i < 2; i++) {
    			for (int j = 0; j < 2 - i; j++) {
    				if (num[j] > num[j+1]) {
    					int temp = num[j];
    					num[j] = num[j+1];
    					num[j+1] = temp;
    				}
    			}
    		}
    		
    		System.out.println(num[1]);
    }        
    
}