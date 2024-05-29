public class BankCustomer {
    private int acno;
    private String atype;
    private double amt;
    
    // Constructor with no parameters
    public BankCustomer() {
        this.acno = 0;
        this.atype = "";
        this.amt = 0.0;
    }
    
    // Constructor with acno and atype parameters
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;
    }
    
    // Constructor with acno, atype, and amt parameters
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }
    
    // Getters and setters
    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
    // Method to display customer information
    public void displayInfo() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }
}
public class Main {
    public static void main(String[] args) {
        // Using different constructors to create BankCustomer objects
        BankCustomer customer1 = new BankCustomer();
        BankCustomer customer2 = new BankCustomer(12345, "Savings");
        BankCustomer customer3 = new BankCustomer(67890, "Checking", 1000.0);
        
        // Displaying customer information
        customer1.displayInfo();
        customer2.displayInfo();
        customer3.displayInfo();
    }
}
