import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int num = scan.nextInt();
    		int result = 0;
    		
    		if (num % 2 == 0) {
    			result = (1 + num) * (num / 2);
    		}
    		else {
    			result = (1 + num) * (num / 2) + (num / 2 + 1);
    		}
    		
    		System.out.println(result);
    }        
    
}