import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Наименование товара: ");
        String name = scanner.nextLine();
        System.out.printf("Ваш товар: %s \n", name);
        System.out.print("Количество: ");
        int quantity = scanner.nextInt();
        System.out.printf("В количестве: %d \n", quantity);
        System.out.print("Укажите номер телефона: ");
        int number = scanner.nextInt();
        System.out.printf("Ваш номер: %d \n", number);
        scanner.nextLine();
        System.out.print("Укажите адрес доставки: ");
        String address = scanner.nextLine();
        System.out.printf("Товар: %s, в количестве: %d, прибудет к вам в ближайшее время. Товар доставим по адресу: %s. Ваш контактный номер телефона: %d \n", name, quantity, address, number);
        scanner.close();
    }
}