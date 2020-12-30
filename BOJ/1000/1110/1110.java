import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int num = scan.nextInt();
    		int initialNum = num;
    		int count = 0;
    		int ten;
    		int one;
    		int temp;
    		
    		do {
    			count ++;
    			ten = num / 10;
    			one = num % 10;
    			temp = (ten + one) % 10;
    			num = one * 10 + temp;
    		} while(initialNum != num);
    		
    		System.out.println(count);
    }        
    
}