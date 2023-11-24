public class Main {
    public static void main(String[] args) {
        Phone p;

        p = new Xiaomi();
        p.PhoneName();
        p.setRam();
        p.setRom();

        p = new SamSung();
        p.PhoneName();
        p.setRam();
        p.setRom();

    }
}
