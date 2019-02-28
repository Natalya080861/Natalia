import java.util.Scanner;

public class ZadachaOdin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число a");

        double a = input.nextDouble();

        System.out.println("Введите число b");

        double b = input.nextDouble();

        if (Math.abs(20 - a) == Math.abs(20 - b)) {
            System.out.println("Числа а и в равноудалены от 20");

        } else if (Math.abs(20 - a) > Math.abs(20 - b)) {
            System.out.println("Ближайщее число к 20 = " + b);
        } else {
            System.out.println("Ближайшее число к 20 = " + a);


        }
    }
}