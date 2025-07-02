abstract class Employee{
    String name;
    int id;
    double Salary;

    Employee(String name,int id,double Salary ) {
        this.name=name;
        this.id=id;
        this.Salary=Salary;
    }
    public abstract void displayDetails();
}

class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double Salary,int teamSize) {
        super(name,id,Salary);
        this.teamSize=teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println(name+" "+id+" "+Salary+" "+teamSize);
    }  
}

class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double Salary,String programmingLanguage) {
        super(name,id,Salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void displayDetails(){
        System.out.println(name+" "+id+" "+Salary+" "+programmingLanguage);
    }  
}

class Intern extends Employee{
    Intern(String name,int id,double Salary) {
        super(name,id,Salary);
    }
    @Override
    public void displayDetails(){
        System.out.println(name+" "+id+" "+Salary);
    }  
}   
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager =new Manager("ankit",101,50000,5);
        Developer developer=new Developer("amar",102,25000,"java");
        Intern intern=new Intern("anik",103,15000);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
