import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int len = Integer.parseInt(scan.nextLine());
    		String num = scan.nextLine();
    		
    		int result = 0;
    		for (int i = 0; i < len; i++) {
    			result = result + num.charAt(i) - '0';
    		}
    		
    		System.out.println(result);
    }        
    
}