package lesson13;

public class Main {
    public static void main(String[] args) {
        Private person = new Private();

        person.setName("Suel");
        person.setSurname("Garabagli");
        person.setAge(13);
        person.setHeight(1.54);
        person.setWeight(53.5);
        person.setGender("Male");

        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight());
        System.out.println("Weight: " + person.getWeight());
        System.out.println("Gender: " + person.getGender());
    }

}
