import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int range = 1;
        int i = 0;
        while(num > range) {
            i++;
            range += 6 * i;
        }

        System.out.println(i + 1);
    }
}