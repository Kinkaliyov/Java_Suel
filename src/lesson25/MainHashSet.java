package lesson25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println("-------------------");
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(7);

        System.out.println("Исходный hashSet: " + hashSet);
        System.out.println("-------------------");

        Set<String> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("Java");
        LinkedHashSet.add("Python");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("Java");
        System.out.println("Исходный LinkedHashSet: " + LinkedHashSet);
        System.out.println("-------------------");

        Set<Integer> TreeSet = new TreeSet<>();
        TreeSet.add(20);
        TreeSet.add(1);
        TreeSet.add(50);
        TreeSet.add(3);
        TreeSet.add(3);
        System.out.println("Исходный TreeSet: " + TreeSet);
        System.out.println("-------------------");

        Set<Integer> TreeSetNull = new TreeSet<>();
        TreeSetNull.add(null);
        TreeSetNull.add(null);
        System.out.println("Исходный TreeSetNull: " + TreeSetNull);
        System.out.println("-------------------");

// РЕЗУЛЬТАТ: Вывод такой учитель это как лист но с дополнительными функциями фильтрации!
//        -------------------
//         Исходный hashSet: [5, 7, 10]
//        -------------------
//         Исходный LinkedHashSet: [Java, Python, C++]
//        -------------------
//         Исходный TreeSet: [1, 3, 20, 50]
//        -------------------
//                Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
//        at java.base/java.util.TreeMap.compare(TreeMap.java:1605)
//        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:810)
//        at java.base/java.util.TreeMap.put(TreeMap.java:819)
//        at java.base/java.util.TreeMap.put(TreeMap.java:568)
//        at java.base/java.util.TreeSet.add(TreeSet.java:261)
//        at lesson25.MainHashSet.main(MainHashSet.java:38)
//
//        Process finished with exit code 1



    }
}
