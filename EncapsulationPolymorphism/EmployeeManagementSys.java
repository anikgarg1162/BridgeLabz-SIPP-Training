// Interface
interface IDepartment{
    public void assignDepartment(String department);
    public String getDepartmentDetails();
}
// abstract class 
abstract class Employee1 implements IDepartment{
    int employeeId;
    String name;
    double baseSalary;
    String department;

    Employee1(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    // abstract method
    public abstract double calculateSalary();

    //concrete method
    public void displayDetails(){
        System.out.println("employeeId :"+employeeId);
        System.out.println("name :"+name);
        System.out.println("BaseSalary :"+baseSalary);
        System.out.println("TOTAL SALARY :" +calculateSalary());
        System.out.println("department :" + department );
        System.out.println("-------------------------");
    };

    // getter
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getDepartmentDetails(){
        return department;
    }

    // setter
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
    public void assignDepartment(String department){
        this.department=department;
    }

}

// subclass - fulltime employee
class FullTimeEmployee extends Employee1{
    
    double bonus;
    public FullTimeEmployee(int employeeId,String name, double baseSalary,double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus=bonus;

    }
    @Override

    public  double calculateSalary(){
        return getBaseSalary()+bonus;
    }
}


class PartTimeEmployee extends Employee1{

    int workHour;
    double hourlyPay;
    public PartTimeEmployee(int employeeId,String name,double baseSalary,int workHour,double hourlyPay){
        super(employeeId, name, baseSalary);
        this.workHour=workHour;
        this.hourlyPay=hourlyPay;

    }
    @Override
    public double  calculateSalary(){
        return workHour*hourlyPay;
    }

}
public class EmployeeManagementSys {
    public static void main(String[] args) {
        Employee1 emp1= new FullTimeEmployee(101, "anik", 25000, 5000);
        emp1.assignDepartment("HR");
        Employee1 emp2= new PartTimeEmployee(102, "amar",1000, 15, 1000);
        emp2.assignDepartment("SDE");
        Employee1[] em={emp1,emp2};
        for(Employee1 m:em){
            m.displayDetails();
           
        }
    }
}
