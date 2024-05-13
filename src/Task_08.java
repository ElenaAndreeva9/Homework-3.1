
import java.util.Scanner;
public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите первое число: ");
        int x = scanner.nextInt();
        System.out.print("ВВедите второе число: ");
        int y = scanner.nextInt();
        if (x % 2 == 0 && y % 21!= 0){
            System.out.println("Yes");
        } else if(x % 2!+ 0 && y % 2!+0){
            System.out.println("Yes");
        }
    }
}
