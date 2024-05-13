import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        Scanner scanner = new Scanner(System.in);
        int daysInYear = 0;
        System.out.print("ВВедите год: ");
        int year = scanner.nextInt();
        if(year % 4 == 0 &&(year % 100 != 0 || year % 400 == 0)){
            System.out.print("Год" + year + "является високосным");
            daysInYear =366;
        } else {
            System.out.print("Год" + year + " не является високосным");
            daysInYear =365;
        }
        System.out.print("В году" + year + "" + daysInYear + "дней");
    }
}
