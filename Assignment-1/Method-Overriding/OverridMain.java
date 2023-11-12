public class OverridMain {
    public static void main(String[] args) {
        Overriding a = new A();
        Overriding b = new B();

        a.setName("Sohel");
        a.setId(57);

        System.out.println(a.getName());
        System.out.println(a.getId());

        b.setName("fahim");
        b.setId(63);

        System.out.println(b.getName());
        System.out.println(b.getId());

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
