import java.util.Scanner;

public class ZadachaChetyre{
    public static long chet;
    public static long nochet;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n");
        long n = input.nextInt();
    for (; n!=0; n = n / 10) {

        if (n % 2 == 0)
            chet++;
        else
            nochet++;}
            System.out.println("Количество четных " + chet + " - Количество нечетных" + nochet);

}}
