import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость билета: ");
        int price = scanner.nextInt();

        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(price);
        System.out.println("Начислено " + miles + " бонусных миль.");
    }
}