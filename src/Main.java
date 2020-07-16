import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какую фразу вы хотите ввести? ");
        Scanner scanner = new Scanner(System.in);
        String type1 = scanner.next();
        switch (type1) {
            case "бяка":
            case "Бяка":
            case "БЯКА":
                System.out.printf("Вы ввели %s", "ВЫРЕЗАНО ЦЕНЗУРОЙ");
                break;
            default:
                System.out.print("Вы ввели " + type1);
        /*}
        if (type1.equals("бяка")) {
            System.out.printf("Вы ввели %s", "ВЫРЕЗАНО ЦЕНЗУРОЙ");
        }
        if (type1.contains("бяка")) {
            System.out.println("Вы ввели " + type1);
        }*/
        }
    }
}