package tasks;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static tasks.Tasks.sumNums;

public class RunTasks {

    public static void main(String[] args) {
        //Task 1.3
        /*Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
Напишите метод, который принимает строку (ключ) и целое число (значение)
и пытается добавить ее в коллекцию по логике:
Если такого ключа нет, то просто добавляет данные в коллекцию.
Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.
Пример: есть HashMap "str1" —> 2.
Если метод принимает "str2" —> 1, добавляем новое значение.
Если метод принимает "str1" —> 2, кидаем исключение.
Если метод принимает "str1" —> 5, обновляем коллекцию
(теперь по ключу "str1" будет храниться значение 5).*/
        Tasks str = new Tasks();
        str.addNumber("one", 1);
        str.addNumber("two", 2);
        str.addNumber("three", 3);
        str.addNumber("four", 4);
        System.out.println(str);
        System.out.println("=====================");
        //Task 2.1
    /* Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение,
     а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
    Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
     а число — сумма чисел списка. Выведите результат в консоль.
    Пример:
            "string1" —> [1, 6, 12]
            "string2" —> [200, 150, 350]
    Новая коллекция станет:
            "string1" —> 19
            "string2" —> 700*/
        Map<String, List<Integer>> str1 = new HashMap<>();
        str1.put("Номер 1", List.of(1, 6, 12));
        str1.put("Номер 2", List.of(200, 150, 350));
        str1.put("Номер 3", List.of(120, 400, 200));
        str1.put("Номер 4", List.of(50, 60, 80));
        str1.put("Номер 5", List.of(5, 10, 15));
        System.out.println(str1);
        System.out.println("=====================");
        Map<String, Integer> str2 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> value : str1.entrySet()) {
            str2.put(value.getKey(), sumNums(value.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : str2.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" : "+stringIntegerEntry.getValue());

        }
        //Task 2.2
/*Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
 Выведите в консоль всё содержимое коллекции в порядке добавления (в формате "ключ:значение").*/
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i <= 10; i++) {
            String s = "Ключ:";
            s =s+i;
            linkedHashMap.put(i,s);
        }
        System.out.println(linkedHashMap);

    }
}

