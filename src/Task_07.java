import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");

        Scanner scanner = new Scanner(System.in);
                System.out.print("ВВедите символ: ");
                String simvol = scanner.nextLine();
                Pattern patLatLetter = Pattern.compile("[а-zA-Z]");
                Mather matLatLettre = patLatLetter.matcher(simvol);

                Pattern patKirLetter = Pattern.compile("[а-яA-Я]");
                Mather matKirLettre = patKirLetter.matcher(simvol);

                Pattern patNumber = Pattern.compile("[0-9]");
                Mather matNumber = patNumber.matcher(simvol);

                if(matLatLettre.matches()){
                    System.out.println("Латиница");
                }else if (matKirLettre.matches()){
                    System.out.println("Кирилица");
                }else if (matNumber .matches()){
                    System.out.println("Цифра");
                } else {
                    System.out.println("Невозможно определить");
                }

            }
}
