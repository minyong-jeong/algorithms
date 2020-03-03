import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int remainCar = scan.nextInt();
        int max = remainCar;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            int out = scan.nextInt();

            remainCar += in - out;
            if (remainCar < 0) {
                max = 0;
                break;
            }

            if (remainCar > max) {
                max = remainCar;
            }
        }

        System.out.println(max);
    }
}