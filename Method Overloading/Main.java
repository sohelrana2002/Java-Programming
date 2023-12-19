public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Sohel");
        p.setAge(65);
        System.out.println(p.toString());

        Employee e = new Employee();
        e.setName("Fahim");
        e.setAge(15);
        e.setId(62);
        System.out.println( e.toString());
    }
}
