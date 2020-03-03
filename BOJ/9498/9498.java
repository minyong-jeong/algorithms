import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int num = scan.nextInt();
    		
    		String result;
    		if (num <= 100 && num >= 90) result = "A";
    		else if (num >= 80) result = "B";
    		else if (num >= 70) result = "C";
    		else if (num >= 60) result = "D";
    		else result = "F";
    		
    		System.out.println(result);
    }        
    
}