import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (true){
            System.out.println("Введите год: ");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);

        System.out.println("Введите количество дней: ");
        String enter = scanner.nextLine();
        int days = Integer.parseInt(enter);

        int realDays = calculateDaysByYear(year);

        if (realDays == days) {
            counter++;
        }else {
            System.out.println("Неправильно! В этом году " + realDays + " дней!");
            System.out.println("Набрано очков: " + counter);
            break;
        }
        }
    }

    private static int calculateDaysByYear(int year) {

        if (year % 400 == 0){
            return 366;
        }else if (year % 4 == 0 && year % 100 != 0){
            return 366;
        }else {
            return 365;
        }
    }
}