package OOP.Polymorphism;

public class Client {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.deposit();
        bank.loan();
        bank.openBranch();

        Branch branch = new Branch();
        branch.hire();
        branch.deposit();
        branch.displayBalance();  // Upcasting. We don't need to write it explicity.
                                   // Java will cast the value implicitly


        ATM atm = new Bank();
        atm.displayBalance();
        ((Branch)atm).hire();   // down casting atm to Branch


        ATM atm1 = new ATM();
       // Branch branch1 = (Bank)atm1;
        // Once we try to cast directly from ATM to Bank
        // it will give the classCastException since it has directly
        //relation with bank
       // branch1.loan();


        Bank bank1 = new Bank();
        Branch branch1 = bank1;
        branch1.loan();

        ATM atm2 = new Branch();
        atm2.displayBalance();
        ((Branch)atm2).loan();


    }


}
