
    import java.util.LinkedHashSet;

    public class Bank {
        private LinkedHashSet<BankAccount> accounts;

        public Bank() {
            accounts = new LinkedHashSet<>();
        }

        public void addBankAccount(BankAccount account) {
            accounts.add(account);
        }

        public void displayBalances() {
            for (BankAccount account : accounts) {
                System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
            }
        }

        public static void main(String[] args) {
            Bank bank = new Bank();

            BankAccount account1 = new BankAccount("12345", 1000.0);
            BankAccount account2 = new BankAccount("67890", 2000.0);

            bank.addBankAccount(account1);
            bank.addBankAccount(account2);

            bank.displayBalances();
        }
    }


