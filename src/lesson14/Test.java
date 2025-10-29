package lesson14;

public class Test {
    public static void main(String[] args) {
        String name = "Suel";
        int len = name.length();
        System.out.println("length() ===========> " + len);

        String course = "Java";
        char firstChar = course.charAt(0);
        System.out.println("charAt(0) ==========> " + firstChar);

        String school = "Baku Code";
        String input = "baku code";
        boolean strictMatch = school.equals(input);
        System.out.println("equals() ===========> " + strictMatch);

        String teacher = "Zakir muellim";
        String reference = "zakir muellim";
        boolean caseInsensitiveMatch = teacher.equalsIgnoreCase(reference);
        System.out.println("equalsIgnoreCase() => " + caseInsensitiveMatch);

        String academy = "Developia";
        boolean startsWithDev = academy.startsWith("Dev");
        System.out.println("startsWith(Dev) ==> " + startsWithDev);

        String language = "Java";
        boolean endsWithA = language.endsWith("a");
        System.out.println("endsWith(a) ======> " + endsWithA);

        String info = "Suel учится в Baku Code";
        String part = info.substring(12);
        System.out.println("substring(12) ======> " + part);

        String wrongName = "Suelh";
        String correctName = wrongName.replace('h', ' ');
        System.out.println("replace('h', ' ') ===> " + correctName);

        String sentence = "Zakir muellim преподает Java";
        int javaIndex = sentence.indexOf("Java");
        System.out.println("indexOf ====> " + javaIndex);

        String s1 = "Welcome to Developia";
        String s2 = "Develop";
        boolean regionMatch = s1.regionMatches(11, s2, 0, 7);
        System.out.println("regionMatches() ====> " + regionMatch);

        String dirtyInput = "   Suel   ";
        String cleanedName = dirtyInput.trim();
        System.out.println("trim() =============> " + cleanedName);

        String word = "Java";
        String upper = word.toUpperCase();
        System.out.println("toUpperCase() ======> " + upper);

        String lower = upper.toLowerCase();
        System.out.println("toLowerCase() ======> " + lower);

        System.out.println("Original String (word) => " + word);
    }
}
