import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате уууу: ");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);

        if (year % 400 == 0){
            System.out.println("Количество дней: 366");
        }else if (year % 100 ==0){
            System.out.println("Количество дней: 365");
        }else if (year % 4 ==0){
            System.out.println("Количество дней: 366");
        }else {
            System.out.println("Количество дней: 365");
        }

    }
}