import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số lượng muốn in ra");
        int count = 0;
        int inputNumber = scanner.nextInt();
        int number = 2;
        while (count < inputNumber){
            if (checkPrime(number)){
                System.out.print(number + ",");
                number++;
            }else {
                number++;
                continue;
            }
            count++;
        }
    }

    public static boolean checkPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
        }
        return check;
    }
}
