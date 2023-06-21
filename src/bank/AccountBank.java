package bank;

public class AccountBank {

        private String user;
        public int accountNum;
        private String accountType;
        private Double balance;
        private Boolean stats;



        public String getUser() {
            return user;
        }
        public void setUser(String user) {
            this.user = user;
        }
        public int getAccountNum() {
            return accountNum;
        }
        public void setAccountNum(int accountNum) {
            this.accountNum = accountNum;
        }
        public String getAccountType() {
            return accountType;
        }
        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }
        public Double getBalance(){
            return balance;
        }
        public void setBalance(Double balance) {
            this.balance = balance;
        }
        public Boolean getStats() {
            return stats;
        }
        public void setStats(Boolean stats) {
            this.stats = stats;
        }



        public AccountBank() {
            balance = 0.00;
            stats = false;
        }
        public void openNewAccount() {
            if(accountType == "cc") {
                stats = true;
                balance = balance + 50.00;
                System.out.println("congratulations you won " + 50.00);
            }else if(accountType == "cp") {
                stats = true;
                balance = balance + 150.00;
                System.out.println("congratulations you won " + 150.00);
            }
            if(stats == true) {
                System.out.println("AccountOpen");
            }
        }
        public void closeAccount() {
            if(balance == -0.00) {
                stats = false;
                System.out.println("AccountClose");
            }else {
                System.out.println("the account cannot be closed because it has money in it " + balance);
            }
        }
        public void deposit(Double money) {
            if(stats == true) {
                balance = balance + money;
                System.out.println("value deposit: " + money);
            }else {
                System.out.println("the account has to be opened to deposit");
            }
        }
        public void withDraw(Double money) {
            if(stats == true) {
                if(balance >= money) {
                    balance = balance - money;
                    System.out.println("value withdraw: " + money);
                }else{
                    System.out.println("balance insufficient");
                }
            }else {
                System.out.println("the account has to be opened to withdraw");
            }
        }
        public void payTuition() {
            if(accountType == "cc") {
                balance = balance - 12.00;
                System.out.println("paid tuition");
            }else if(accountType == "cp") {
                balance = balance - 20.00;
                System.out.println("paid tuition");
            }
        }

    }
