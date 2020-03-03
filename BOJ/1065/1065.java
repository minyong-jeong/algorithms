import java.util.Scanner;

class Main {
	
    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int num = scan.nextInt();
    		int sum = 0;
    		for (int i = 1; i <= num; i++) {
    			if (test(i))
    				sum++;
    		}
    		System.out.println(sum);
    }
    
    public static boolean test(int num) {
    		boolean result = true;
    		int val = 0;
    		
    		if (num < 100)
    			result = true;
    		else {
    			val = num % 10 - (num/10) % 10;
    			num = num / 10;
    			while(num >= 10) {
    				if (val != (num % 10 - (num/10) % 10)) {
    					result = false;
    					break;
    				}
    				num = num / 10;
    			}
    		}
    		
    		return result;
    }
}