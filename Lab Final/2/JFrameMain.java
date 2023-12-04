public class JFrameMain {

    public static void main(String[] args) {
        JFrame j = new JFrame();
       System.out.println(j.toString());
       JFrame j2 = new JFrame("Its title");
       System.out.println(j2.toString());
       
       j.setTitle("This is title from method");
       j.setSize(5, 10);
       j.setVisible(true);
       System.out.println(j.toString());

    }
}