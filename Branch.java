package OOP.Polymorphism;

public class Branch extends ATM{

    public void loan(){
        System.out.println("You can get the loan up to 50K");

    }

    public void hire(){
        System.out.println("We can hire the Bank Teller");
    }

    public void withdraw(){
        System.out.println("You can withdraw the money up to 15K");
    }

    public void deposit(){
        System.out.println("You can deposit up to 100K");
    }


}
