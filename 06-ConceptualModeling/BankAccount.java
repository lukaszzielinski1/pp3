public class BankAccount {
    private int balance;
    private String accountId;
    private String name;
    private String lastName;

    public BankAccount(int balance, String accountId, String name, String lastName){
        this.balance = balance;
        this.accountId = accountId;
        this.name = name;
        this.lastName = lastName;
    }


    public String getAccountId() {
        return accountId;
    }
    public int getBalance() {
        return balance;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return name;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void depositMoney(int amount){
        balance += amount;
    }

    public void withdrawMoney(int amount){
        if(this.balance>=amount){
            if(amount>500){
                System.out.println("Amount over the limit.");
            }else{
                this.balance -= amount;
            }
        }else{
            System.out.println("Insufficient funds.");
        }
    }

    public String displayBalance(){
        return "Account balance: " + getBalance() + " PLN";
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000,"235234646","Tomasz","Problem");
        b.depositMoney(500);
        System.out.println(b.displayBalance());
        b.depositMoney(200);
        System.out.println(b.displayBalance());
        b.withdrawMoney(300);
        System.out.println(b.displayBalance());
        }
}
