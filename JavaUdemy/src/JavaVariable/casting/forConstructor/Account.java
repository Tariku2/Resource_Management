package JavaVariable.casting.forConstructor;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    public Account(){
        System.out.println("No arg constructor is executed");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of"+depositAmount+ "made"+this.balance);
    }
    public void withdraw(double withdrawalAmount){
        if(this.balance-withdrawalAmount>0){
            System.out.println("Only"+this.balance+ "is available. and No withdrawal processed");
        }
        else {
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of"+withdrawalAmount+"is processed .Remaining balance");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
