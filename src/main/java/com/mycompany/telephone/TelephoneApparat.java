
package com.mycompany.telephone;
import java.util.ArrayList;
import java.util.Scanner;
public class TelephoneApparat {
    private ArrayList<Telephone> spisok_telephonov;
    
    public TelephoneApparat() {
        spisok_telephonov = new ArrayList<>();
        spisok();
    }

    private void spisok() {
        spisok_telephonov.add(new Telephone("Pixel 6", "AL690MLA", "black", true));
        spisok_telephonov.add(new Telephone("Pixel 6a", "290JIOFJW2U2", "white", true));
        spisok_telephonov.add(new Telephone("Pixel 7", "KJG53", "green", true));
        spisok_telephonov.add(new Telephone("Pixel 7a", "TWQ441", "green", true));
        spisok_telephonov.add(new Telephone("Pixel 8", "RTUSDDAA", "black", true));
    }
    public void addTelephone(Scanner scanner) {
        System.out.print("Модель:");
        String model = scanner.nextLine();
        System.out.print("Серийный номер:");
        String serialNumber = scanner.nextLine();
        if (containsSerialNumber(serialNumber)) {
            System.out.println("Телефон с таким серийным номером уже существует");
            return;
        }
        System.out.print("Цвет: ");
        String color = scanner.nextLine();
        System.out.print("Тип мобильный (да/нет): ");
        String mobileInput = scanner.nextLine();
        boolean mytelephone;
        if (mobileInput.equalsIgnoreCase("да")) {
            mytelephone = true;
        } else if (mobileInput.equalsIgnoreCase("нет")) {
            mytelephone = false;
        } else {
            System.out.println("Некорректный ввод. Тип должен быть 'мобильный' или 'немобильный'");
            return;
        }
        spisok_telephonov.add(new Telephone(model, serialNumber, color, mytelephone));
        System.out.println("Телефон успешно добавлен");
    }
    
    public void removeTelephone(Scanner scanner) {
        System.out.print("Введите серийный номер телефона для удаления: ");
        String serialNumber = scanner.nextLine();
        for (Telephone telephone : spisok_telephonov) {
            if (telephone.serialNumber.equals(serialNumber)) {
                spisok_telephonov.remove(telephone);
                System.out.println("Телефон с серийным номером"+serialNumber+"удален");
                return;
            }
        }
        System.out.println("Телефон с серийным номером"+serialNumber+" не найден");
    }
    public void deletalltelephones() {
        spisok_telephonov.clear();
    }
    public boolean containsSerialNumber(String serialNumber) {
        for (Telephone telephone : spisok_telephonov) {
            if (telephone.serialNumber.equals(serialNumber)) {
                return true;
            }
        }
        return false;
    }
    public void printTelephoneList() {
        System.out.println("Список телефонов:");
        if (spisok_telephonov.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (Telephone telephone : spisok_telephonov) {
            System.out.println(telephone);
        }
    }
}
