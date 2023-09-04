package past6.application;

import past6.entities.Account;
import past6.entities.BusinessAccount;
import past6.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
    }
}
