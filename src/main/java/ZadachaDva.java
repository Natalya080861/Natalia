import java.util.Scanner;

public class ZadachaDva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число " + n + " - четное");
        } else {
            System.out.println("Число " + n + " - нечетное");

        }
    }
}


