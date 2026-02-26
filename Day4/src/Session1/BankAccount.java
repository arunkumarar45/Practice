package Session1;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private int pin;
    private boolean locked;
    private int wrongAttempt;
    BankAccount(int accountNumber,double initialbalance,int pin){
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.balance=initialbalance;
        this.wrongAttempt=0;
        this.locked=false;

    }
    public void deposit(double amount){
        if(!locked && amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
        else{
            System.out.println("Deposit failed");
        }
    }
    public void withdraw(double amount,int enteredpin){
        if(locked){
            System.out.println("Account is locked");
        }
        if(enteredpin!=pin){
            wrongAttempt++;
            System.out.println("Wrong pin");
            if(wrongAttempt>=3){
                locked=true;
                System.out.println("Account locked");
            }
            return;

        }
        wrongAttempt=0;
        if(amount>0 && amount<=25000 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawl amount:"+amount);
        }
        else{
            System.out.println("Amount withdraw failed");
        }
    }
    public double getBalance(int enteredPin){
        if(!locked && enteredPin==pin){
            return balance;
        }
        System.out.println("Access  denied");
        return -1;
    }
    public boolean isAccountLocked() {
        return locked;
    }
    public static void main(String[] args){
        BankAccount account=new BankAccount(1234556,5000.00,1747);
        account.deposit(5.00);
        account.withdraw(2000.0,1747);
        System.out.println("Balance: "+account.getBalance(1747));

    }
}
