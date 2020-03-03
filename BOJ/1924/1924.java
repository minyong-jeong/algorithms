import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    		String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    		int mon = scan.nextInt();
    		int day = scan.nextInt();
    		
    		int totalDays = 0;
    		for (int i = 0; i < mon - 1; i++) {
    			totalDays += month[i];
    		}
    		totalDays += day;
    		
    		int resultNum = totalDays % 7;
    		System.out.println(dayOfWeek[resultNum]);
    }        
    
}