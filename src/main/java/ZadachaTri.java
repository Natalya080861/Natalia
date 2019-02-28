import java.util.Scanner;

public class ZadachaTri {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Введите число a, из отрезка от 5 до 155");
        int a = input.nextInt();
        if(a <= 155 & a >= 5) {
            System.out.println("Число " + a + "  из отрезка от 5 до 155");
            if(a >= 25 & a <= 100) {
                System.out.println("Число " + a + " попало в интервал от 25 до 100");
            }else {
                System.out.println("Число " + a + " не попало в интервал от 25 до 100");
            }
        } else {
            System.out.println("Число " + a + "  не из отрезка от 5 до 155");
        }
    }
}