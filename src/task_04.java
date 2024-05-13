import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");

        Scanner scanner = new Scanner(System.in);
                System.out.println("Введите координату x: ");
                double x = scanner.nextDouble();
                System.out.println("Введите координату y: ");
                double y = scanner.nextDouble();
                if (x > 0 && y > 0){
                    System.out.println("Точка находится в 1 четверти");
                } else if (x < 0 && y > 0) {
                    System.out.println("Точка находится во 2 четверти");
                } else if (x < 0 && y < 0) {
                    System.out.println("Точка находится в 3 четверти");
                } else if (x > 0 && y < 0) {
                    System.out.println("Точка находится в 4 четверти");
                } else {
                    System.out.println("Точка находится в окружности");

                }
    }
}
