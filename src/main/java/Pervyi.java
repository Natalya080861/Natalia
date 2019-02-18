import java.util.Scanner;

public class Pervyi {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        String day, week, mood;
        System.out.println("Какой сегодня день недели?");
        week=input.nextLine();
        System.out.println("Какое сегодня число?");
        day=input.nextLine();

        System.out.println("Какое настроение?");
        mood=input.nextLine();

        String text ;

        text = "Сегодня - " + day + "  день недели - " + week + "  настроение - " + mood;
        System.out.println(text);





    }
}
