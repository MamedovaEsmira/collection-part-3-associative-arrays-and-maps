package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class RunPhoneBook {
    public static void main(String[] args) {
        //Первый вариант:
        Map<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("Иван", "+78952588458");
        telephoneBook.put("Татьяна", "+78982694825");
        telephoneBook.put("Николь", "+78592583645");
        telephoneBook.put("Роза", "+79882584563");
        telephoneBook.put("София", "+79995846528");
        System.out.println(telephoneBook);
        telephoneBook.remove("Роза");
        System.out.println(telephoneBook);
        System.out.println(telephoneBook.get("Иван"));

        printInfo();
        //Второй вариант:
         PhoneBook phoneBook=new PhoneBook();
        phoneBook.addContact("Наталья","+78565424555");
        phoneBook.addContact("Петр","+75896545745");
        phoneBook.addContact("Иван","+75887445858");
        phoneBook.addContact("Евгений","+75922458524");
        phoneBook.addContact("Алексей","+78954566988");
        phoneBook.addContact("Татьяна","+78966222584");
        phoneBook.addContact("Тимофей","+79885666641");
        phoneBook.addContact("Николай","+79888552222");
        phoneBook.addContact("Элина","+78965225456");
        phoneBook.addContact("Игорь","+78458852245");
        phoneBook.addContact("Мария","+78995244444");
        phoneBook.addContact("Ксения","+79855922256");
        phoneBook.addContact("Сергей","+73985555569");
        phoneBook.addContact("Григорий","+79580368455");
        phoneBook.addContact("Анна","+79385699657");
        phoneBook.addContact("Елена","+76948852224");
        phoneBook.addContact("Карина","+79853684588");
        phoneBook.addContact("Роман","+79992258541");
        phoneBook.addContact("Родион","+79988829942");
        phoneBook.addContact("Инесса","+79882585668");
        System.out.println(phoneBook);
        phoneBook.removeContact("Иван");
        phoneBook.removeContact("Родион");
        phoneBook.removeContact("Ксения");
        System.out.println(phoneBook);
    }
    public static void printInfo(){
        System.out.println("============================");
    }
}

