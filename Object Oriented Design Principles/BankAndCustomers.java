import java.util.*;

class Customer {
    String name;
    int balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String name;
    List<Customer> customers;

    Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.out.println(c.name + " opened an account at " + name);
    }
}

public class BankAndCustomers {
    public static void main(String[] args) {
        Bank b = new Bank("State Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        b.openAccount(c1);
        b.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}