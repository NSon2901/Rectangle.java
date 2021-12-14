package inheritance.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("ha", "HCM city");
        Student student = new Student("Ho", "DaNang", "CLC", 3, 10000.5);
        Staff staff = new Staff("Chi", "HaNoi", "Sakuragahara", 700);
        System.out.println(person.toString());
        System.out.println(student);
        System.out.println(staff);
    }
}
