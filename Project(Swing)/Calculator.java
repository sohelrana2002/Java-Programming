public class Calculator{
    private double deposite=0.0;
    private double withdraw=0.0;
    private double currentAmount=0.0;

    public void setDepositeAmount(double deposite){
        this.deposite = deposite + this.deposite;
        currentAmount = currentAmount + deposite;

    }

    public void setWithdrawAmount(double withdraw){
        this.withdraw = this.withdraw + withdraw;
        currentAmount = currentAmount - withdraw;
    }

    public double getTotalDepositeAmount(){
        return deposite;
    }

    public double getTotalWithdrawAmount(){
        return withdraw;
    }
  
    public double getTotalCurrentAmount(){
        return currentAmount;
    }
}