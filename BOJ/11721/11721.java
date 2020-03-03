import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		String str = scan.nextLine();
    		
    		for (int i = 1; i <= str.length(); i++) {
    			if ((i % 10) != 0)
    				System.out.print(str.charAt(i-1));
    			else
    				System.out.println(str.charAt(i-1));
    		}
    }        
    
}