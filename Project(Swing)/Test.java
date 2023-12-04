public class Test{
    public static void main(String[] args){
        Calculator c =new Calculator();

        double depAm= 200;

        c.setDepositeAmount(depAm);
        c.setDepositeAmount(500);
        c.setDepositeAmount(500);
        System.out.println("Total Deposite Amount: "+c.getTotalDepositeAmount());
        c.setDepositeAmount(500);//1700
        System.out.println("Total Deposite Amount: "+c.getTotalDepositeAmount());
        System.out.println("Current Amount: "+c.getTotalCurrentAmount());

        c.setWithdrawAmount(300);//1400
        System.out.println("Total withdraw Amount: "+c.getTotalWithdrawAmount());
        System.out.println("Current Amount: "+c.getTotalCurrentAmount());

        c.setDepositeAmount(500);//1900
        System.out.println("Total Deposite Amount: "+c.getTotalDepositeAmount());
        System.out.println("Current Amount: "+c.getTotalCurrentAmount());
        

    }
}