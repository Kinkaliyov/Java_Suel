package lesson26;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("США");
        countries.add("Канада");
        countries.add("Мексика");
        countries.add("Бразилия");
        countries.add("Аргентина");
        countries.add("Чили");
        countries.add("Перу");

        countries.add("США");
        countries.add("Канада");

        System.out.println("--- ДЗ 1: HashSet (Дубликаты не добавлены, порядок хаотичный) ---");
        System.out.println(countries);


        Set<String> names = new LinkedHashSet<>();
        names.add("Суэль");
        names.add("Джясур");
        names.add("Мага");
        names.add("Саид");

        System.out.println("--- ДЗ 2: LinkedHashSet (Сохраняет порядок добавления) ---");
        System.out.println("Порядок добавления: " + names);

        names.remove("Джясур");

        System.out.println("После удаления джасура: " + names);


        Set<Integer> grades = new TreeSet<>();
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(5);
        grades.add(2);
        grades.add(5);
        grades.add(1);
        grades.add(4);
        grades.add(5);
        grades.add(5);

        System.out.println("--- ДЗ 3: TreeSet (Отсортированный набор оценок) ---");
        System.out.println(grades);


        NavigableSet<Integer> scores = new TreeSet<>(Arrays.asList(10, 35, 50, 50, 75, 90));

        System.out.println("\n--- ДЗ 4: NavigableSet ---");
        System.out.println("Набор: " + scores);

        System.out.println("Первое значение: " + scores.first());
        System.out.println("Последнее значение: " + scores.last());

        System.out.println("Значение <= 50 (floor): " + scores.floor(50));

        System.out.println("Значение > 50 (higher): " + scores.higher(50));


/*        --- ДЗ 1: HashSet (Дубликаты не добавлены, порядок хаотичный) ---
[Мексика, Канада, Перу, США, Аргентина, Чили, Бразилия]
        --- ДЗ 2: LinkedHashSet (Сохраняет порядок добавления) ---
                Порядок добавления: [Суэль, Джясур, Мага, Саид]
        После удаления джасура: [Суэль, Мага, Саид]
        --- ДЗ 3: TreeSet (Отсортированный набор оценок) ---
[1, 2, 3, 4, 5]

        --- ДЗ 4: NavigableSet ---
                Набор: [10, 35, 50, 75, 90]
        Первое значение: 10
        Последнее значение: 90
        Значение <= 50 (floor): 50
        Значение > 50 (higher): 75*/
    }
    }

