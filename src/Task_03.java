import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("задание 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Кошка");
        System.out.println("2.Собака");
        System.out.println("3.Корова");
        System.out.println("4.Лошадь");
        System.out.println("5.Свинья");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Кошка издает звук мяу");
                break;
            case 2:
                System.out.println("Собака издает звук гав ");
                break;
            case 3:
                System.out.println("Корова издает звук му");
                break;
            case 4:
                System.out.println("Лошадь издает звук иго-го");
                break;
            case 5:
                System.out.println("Свинья издает звук хрю");
                break;
            default:
                System.out.println("Виберите животное из списка");
        }

    }
}
