import java.util.*;

public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<EmployeeDetails> empList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.AddEmployee();
        main.AddEmployee();
        main.DisplayEmpDetails();
    }

    public void AddEmployee() {
        System.out.println("Enter the Employee Name: ");
        String name = s.nextLine();
        System.out.println("Enter the Employee dept: ");
        String dept = s.nextLine();
        System.out.println("Enter the Employee hrName: ");
        String hrName = s.nextLine();
        System.out.println("Enter the Employee sal: ");
        double sal = s.nextDouble();
        System.out.println("Enter the Employee Id: ");
        int EmpId = s.nextInt();
        s.nextLine(); 

        EmployeeDetails obj = new EmployeeDetails(name, dept, hrName, sal, EmpId);
        empList.add(obj);

        System.out.println("Employee added successfully!");
    }

    public void DisplayEmpDetails() {
        Iterator<EmployeeDetails> iterator = empList.iterator();
        while (iterator.hasNext()) {
            EmployeeDetails element = iterator.next();
            System.out.println("----------------------------");
            System.out.println("Name: " + element.EmpName);
            System.out.println("Department: " + element.Dept);
            System.out.println("HR Name: " + element.HRName);
            System.out.println("Salary: " + element.Sal);
            System.out.println("Employee ID: " + element.Eid);
            System.out.println("----------------------------");
        }
    }
}

class EmployeeDetails {
    String EmpName, Dept, HRName;
    double Sal;
    int Eid;

    EmployeeDetails(String name, String dept, String hrName, double sal, int EmpId) {
        this.EmpName = name;
        this.Dept = dept;
        this.HRName = hrName;
        this.Sal = sal;
        this.Eid = EmpId;
    }
}
