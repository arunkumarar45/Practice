package oops;

public class Account {
    int accNo;
    static int totalAcc;
    Account(){
        totalAcc++;
        accNo=totalAcc;
    }
    static void showtotalacc(){
        System.out.println("Total :" +totalAcc);
    }
    public static void main(String[] args){
        new Account();
        new Account();
        Account.showtotalacc();
    }
}
