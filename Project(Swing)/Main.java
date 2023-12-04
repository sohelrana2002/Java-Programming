import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {  
    public static void main(String[] args) { 

        Calculator cal = new Calculator(); 
        JFrame f=new JFrame("My Bank Account");//creating instance of JFrame
        Font font =new Font("Arial", Font.BOLD, 20); // Font Style and size

        //Label
        JLabel l1,l2, l3, l4,l5,l6,l7,l8;
        l6=new JLabel("Total Deposite Amount");  
        l6.setBounds(50,35, 150,30);  
        l1=new JLabel("00.00 BDT.");
        l1.setFont(font);  //Set font style
        l1.setBounds(52,52, 130,30);  
        l1.setForeground(Color.orange);
        l7=new JLabel("Current Amount");  
        l7.setBounds(230,35, 100,30);  
        l2=new JLabel("00.00 BDT.");
        l2.setFont(font);  
        l2.setBounds(232,52, 130,30);  
        l2.setForeground(Color.blue);
        l8=new JLabel("Total Withdraw Amount");  
        l8.setBounds(380,35, 150,30);  
        l3=new JLabel("00.00 BDT.");
        l3.setFont(font); 
        l3.setBounds(382,52, 130,30);  
        l3.setForeground(Color.red);
        f.add(l1); f.add(l2);  
        f.add(l3); f.add(l6);
        f.add(l7); f.add(l8); 

        //Text Field
        JTextField t1,t2;  
        t1=new JTextField();
        l4=new JLabel("Enter Deposite Amount");  
        l4.setBounds(50,165, 200,30);  
        l4.setForeground(Color.black);
        f.add(l4); 
        t1.setBounds(50,200, 200,30);  //x axis, y axis, width, height 
        t2=new JTextField(); 
        l5=new JLabel("Enter Withdraw Amount");  
        l5.setBounds(300,165, 200,30);  
        l5.setForeground(Color.black);
        f.add(l5); 
        t2.setBounds(300,200, 200,30); //x axis, y axis, width, height 
        f.add(t1); f.add(t2);

        //Button
        JButton button1, button2;
        button1=new JButton("Deposite");//creating instance of JButton  
        button1.setBounds(50,250,100, 40);//x axis, y axis, width, height  
        button2=new JButton("Withdraw");//creating instance of JButton  
        button2.setBounds(300,250,100, 40);//x axis, y axis, width, height  

        //Listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double value1 = Double.parseDouble(t1.getText());
                cal.setDepositeAmount(value1);
                // JOptionPane.showMessageDialog(null, "The value is: " + value);
                l1.setText( String.valueOf(cal.getTotalDepositeAmount()) + " BDT");
                l2.setText( String.valueOf(cal.getTotalCurrentAmount()) + " BDT");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value2 = Double.parseDouble(t2.getText());
                if(cal.getTotalCurrentAmount() >= value2){
                    cal.setWithdrawAmount(value2);
                    l3.setText( String.valueOf(cal.getTotalWithdrawAmount()) + " BDT");
                    l2.setText( String.valueOf(cal.getTotalCurrentAmount()) + " BDT");
                }else{
                    JOptionPane.showMessageDialog(null, "Insufficient Balance!");
                }
            }
        });

        f.add(button1);//adding button in JFrame  
        f.add(button2);//adding button in JFrame  

        f.getContentPane().setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible 
    }  
}  
