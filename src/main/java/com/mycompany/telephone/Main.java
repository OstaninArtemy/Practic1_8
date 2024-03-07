
package com.mycompany.telephone;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        TelephoneApparat telephoneApparat = new TelephoneApparat();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите номер:");
            System.out.println("1-Добавить телефонный аппарат");
            System.out.println("2-Удалить телефонный аппарат по серийному номеру");
            System.out.println("3-Удалить все телефонные аппараты из списка");
            System.out.println("4-Вывести текущее содержимое списка");
            System.out.println("5-Выйти из программы");
            int x = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (x) {
                case 1:
                    telephoneApparat.addTelephone(scanner);
                    break;
                case 2:
                    telephoneApparat.removeTelephone(scanner);
                    break;
                case 3:
                    telephoneApparat.deletalltelephones();
                    System.out.println("Все телефоны удалены из списка");
                    break;
                case 4:
                    telephoneApparat.printTelephoneList();
                    break;
                case 5:
                    System.out.println("Конец");
                    return;
                default:
                    System.out.println("Неправильный номер.");
            }
        }
    }
}
