package lesson24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        cities.add("Казань");
        cities.add("Сочи");
        cities.add("Новосибирск");
        cities.add("Екатеринбург");

        System.out.println("--- ДЗ 1: Удаление ---");
        System.out.println("Исходный список: " + cities);
        cities.remove(2);
        System.out.println("Обновленный список: " + cities);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("--- ДЗ 2: Замена ---");
        System.out.println("Исходный список: " + numbers);
        numbers.set(1, 100);
        System.out.println("Обновленный список: " + numbers);

        List<String> names = new ArrayList<>();
        names.add("Суэль");
        names.add("Мага");
        names.add("Джасур");
        names.add("Мага");
        names.add("Суэльь");

        String searchName = "Джасур";

        System.out.println("--- ДЗ 3: Поиск ---");
        System.out.println("Список имен: " + names);
        int firstIndex = names.indexOf(searchName);
        int lastIndex = names.lastIndexOf(searchName);

        System.out.println("Имя для поиска: " + searchName);
        System.out.println("Индекс первого вхождения: " + firstIndex);
        System.out.println("Индекс последнего вхождения: " + lastIndex);
    }
}
