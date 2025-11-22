package lesson23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("Team Fortress II");
        games.add("Roblox: Jujutsu Sheningans");
        games.add("Roblox: The Strongest Battlegrounds");
        games.add("Limbus Company");
        games.add("Call Of Duty: WW2");
        games.add("FC 26");
        games.add("Half Life III");

        System.out.println("--------------------");
        System.out.println(games);
        System.out.println("--------------------");

        games.set(5, "FC 26 Mobile (netu deneg)");

        System.out.println(games);
        System.out.println("--------------------");

        games.remove(6);

        System.out.println(games);
        System.err.println("Exception in thread \"main\" HalfLifeException: Не верно. Half Life III никогда не выйдет \uD83D\uDE2D\n" +
                "\tat GamingExpectations.checkReleaseDate(GamingExpectations.java:25)\n" +
                "\tat Main.main(Main.java:26)");
        System.out.println("--------------------");

        System.out.println("Любимая игра: (Площадка/Игра): " + games.get(1));
        System.out.println("--------------------");
    }
}
