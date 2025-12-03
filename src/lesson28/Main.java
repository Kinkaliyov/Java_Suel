package lesson28;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> personAges = new HashMap<>();
        personAges.put("Суэль", 25);
        personAges.put("Мага", 30);
        personAges.put("Джасур", 22);
        personAges.put("Ренат", 35);
        personAges.put("Закир Мяльм", 28);
        personAges.put("Мага2", 40);
        personAges.put("Шамиль", 33);

        personAges.put("Мага", 31);

        System.out.println("--- ДЗ 1: HashMap ---");
        for (Map.Entry<String, Integer> entry : personAges.entrySet()) {
            System.out.print(entry.getKey() + " -> " + entry.getValue() + " ");
        }
        System.out.println();


        Map<Integer, String> lessons = new LinkedHashMap<>();
        lessons.put(1, "Введение");
        lessons.put(3, "Коллекции");
        lessons.put(2, "ООП");
        lessons.put(4, "Исключения");

        System.out.println("--- ДЗ 2: LinkedHashMap ---");
        System.out.println(lessons);


        Map<Double, String> gameRatings = new TreeMap<>();
        gameRatings.put(9.5, "The Witcher 3");
        gameRatings.put(8.8, "Cyberpunk 2077");
        gameRatings.put(10.0, "Elden Ring");
        gameRatings.put(9.5, "God of War");
        gameRatings.put(8.5, "Horizon Zero Dawn");
        gameRatings.put(9.0, "Red Dead Redemption 2");
        gameRatings.put(7.9, "Death Stranding");
        gameRatings.put(9.8, "Baldur's Gate 3");

        System.out.println("--- ДЗ 3: TreeMap ---");
        for (Map.Entry<Double, String> entry : gameRatings.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        System.out.println();


        Map<String, Integer> mathScores = new HashMap<>();
        mathScores.put("Суэль", 5);
        mathScores.put("Мага", 4);
        mathScores.put("Ренат", 5);

        Map<String, Integer> englishScores = new HashMap<>();
        englishScores.put("Джасур", 5);
        englishScores.put("Суэль", 4);
        englishScores.put("Ренат", 3);

        Set<String> commonNames = new HashSet<>(mathScores.keySet());
        commonNames.retainAll(englishScores.keySet());

        System.out.println("--- ДЗ 4: Общие имена ---");
        System.out.println(commonNames);


        NavigableMap<Integer, String> navigable = new TreeMap<>();
        navigable.put(10, "Десять");
        navigable.put(20, "Двадцать");
        navigable.put(30, "Тридцать");
        navigable.put(40, "Сорок");
        navigable.put(50, "Пятьдесят");

        System.out.println("--- ДЗ 5: NavigableMap (Вроде не проходили пригодилось покапаться) ---");

        System.out.println("Меньше 25: " + navigable.headMap(25, false).keySet());

        System.out.println("Больше 25: " + navigable.tailMap(25, false).keySet());

        System.out.println("floor(30): " + navigable.floorKey(30));

        System.out.println("ceiling(30): " + navigable.ceilingKey(30));
    }
}