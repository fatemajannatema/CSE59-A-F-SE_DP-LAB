abstract class TeamMember {
    protected String name;
    
    public TeamMember(String name) {
        
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

interface BonusEligible {
    
    void calculateBonus();
}

class Employee extends TeamMember implements BonusEligible {
    
    public Employee(String name) {
        
        super(name);
    }
    
    @Override
    
    public void calculateBonus() {
        
        System.out.println("Calculating standard employee bonus...");
    }
}

class Constractor extends TeamMember {
    
    public Constractor(String name) {
        
        super(name);
    }
    
    public void submitInvoice() {
        
        System.out.println("Submitting constractor invoice...");
    }
}
public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John");
        employee.calculateBonus();
    }
}
