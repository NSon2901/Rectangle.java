package person;

public class TestMain {
    public static void main(String[] args) {
        Person studen1 = new Person("jojo", "Pari");
        System.out.println(studen1.toString());
        Student student2 = new Student("nami", "pari", "CLC", 2021, 150000);
        System.out.println(student2);
    }
}
