import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private ArrayList<Person> subordinates = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public List<Person> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {

    public Employee(String name) {
        super(name);
    }
    
}

class Manager extends Person {

    public Manager(String name) {
        super(name);
    }

}

class CEO extends Person {

    public CEO(String name) {
        super(name);
    }

}

class UnfactoredHierarchyExample {
    public static void main(String[] args) {
        CEO john = new CEO("John (CEO)");
        
        Manager mike = new Manager("Mike (Manager 1)");
        Manager lisa = new Manager("Lisa (Manager 2)");
        
        Employee alice = new Employee("Alice (Employee 1)");
        Employee bob = new Employee("Bob (Employee 2)");
        Employee eve = new Employee("Eve (Employee 3)");
        
        john.addSubordinate(mike);
        john.addSubordinate(lisa);
        
        mike.addSubordinate(alice);
        mike.addSubordinate(bob);
        
        lisa.addSubordinate(eve);
        
        // Traversing the hierarchy
        traverseHierarchy(john, 0);
    }
    
    public static void traverseHierarchy(Employee employee, int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("  "); // Two spaces per level
        }
        
        System.out.println(indentation + employee.getName());
        
        for (Employee subordinate : employee.getSubordinates()) {
            traverseHierarchy(subordinate, level + 1);
        }
    }
}
