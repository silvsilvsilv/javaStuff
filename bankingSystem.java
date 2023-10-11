public class bankingSystem
{
    public static class BankingSystem
    {
        private String accountNumber;
        private double balance;
        private String accountHolder;

        public BankingSystem(String number, double bal, String nameOfHolder)
        {
            this.accountNumber = number;
            this.balance = bal;
            this.accountHolder = nameOfHolder;
        }

        public String getAccountNumber()
        {
            return accountNumber;
        }
        
        public double getBalance()
        {
            return balance;
        }

        public String getAccountHolder()
        {
            return accountHolder;
        }

        public void setAccountNumber(String number)
        {
            this.accountNumber = number;
        }

        public void setBalance(double bal)
        {
            this.balance = bal;
        }

        public void setAccountHolder(String nameOfHolder)
        {
            this.accountHolder = nameOfHolder;
        }

        public void deposit(double bal)
        {
            System.out.println("Successfully Deposited " + bal);
            this.balance += bal;
        }

        public void withdraw(double bal)
        {
            if(bal > this.balance)
            {
                System.out.println("Cannot withdraw more than current balance! Try Again");
            }
            else
            {
                System.out.println("Successfully withdrawed "+ bal);
                this.balance -= bal;
            }
        }

        ////tod:o add instruction no.6 implement a toString() method

        @Override
        public String toString()
        {
            return "Php " + this.balance + "0";
        }

        public void getAccountDetails()
        {
            System.out.println("===========================");
            System.out.println("Account details for "+ this.accountHolder +"\nAccount holder: " + this.accountHolder + "\nAccount number: " + this.accountNumber + "\nAccount balance: " + toString());
        }

    }
    public static void main(String[] args)
    {
        BankingSystem bank1 = new BankingSystem("123", 1000, "John");
        BankingSystem bank2 = new BankingSystem("456", 500, "Silva");
        BankingSystem bank3 = new BankingSystem("789", 90, "Hatdog");

        bank1.getAccountDetails();

        bank2.getAccountDetails();

        bank3.getAccountDetails();
    }
}