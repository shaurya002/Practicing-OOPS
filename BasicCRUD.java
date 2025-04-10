import java.util.*;

public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<EmployeeDetails> empList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        boolean view = true;
        while(view){
            System.out.println("Select the Operation you want to Perform.");
            System.out.println("1. Add new Employee");
            System.out.println("2. Update Employee Details");
            System.out.println("3. Delete Employee Details");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            int choice = s.nextInt();
            switch(choice){
                case 1:
                    main.AddEmployee();
                    break;
                case 2:
                    main.UpdateEmpDetails();
                    break;
                case 3:
                    main.DeleteEmployee();
                    break;
                case 4:
                    main.DisplayEmpDetails();
                    break;
                case 5:
                    view = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.out.println("----------------------------------------------------------------------");
                    break;
            }
            
        }
    }

    public void AddEmployee() {
        s.nextLine();
        System.out.println("Enter the Employee Name: ");
        String name = s.nextLine();
        System.out.println("Enter the Employee dept: ");
        String dept = s.nextLine();
        System.out.println("Enter the Employee hrName: ");
        String hrName = s.nextLine();
        System.out.println("Enter the Employee sal: ");
        double sal = s.nextDouble();
        s.nextLine();
        System.out.println("Enter the Employee Id: ");
        int EmpId = s.nextInt();
        s.nextLine(); 

        EmployeeDetails obj = new EmployeeDetails(name, dept, hrName, sal, EmpId);
        empList.add(obj);

        System.out.println("Employee added successfully!");
        System.out.println("----------------------------------------------------------------------");
    }

    public void DisplayEmpDetails() {
        Iterator<EmployeeDetails> iterator = empList.iterator();
        while (iterator.hasNext()) {
            EmployeeDetails element = iterator.next();
            System.out.println("----------------------------");
            System.out.println("Employee ID: " + element.Eid + " | "+ "Name: " + element.EmpName + " | " + "Department: " + element.Dept + " | "+ "HR Name: " + element.HRName+ " | " + "Salary: " + element.Sal);
        }
        System.out.println("----------------------------------------------------------------------");
    }
    
    public void UpdateEmpDetails() {
        
        System.out.println("Enter the Emp Id: ");
        int id = s.nextInt();
        s.nextLine(); 

        EmployeeDetails emp = null;
        for (EmployeeDetails e : empList) {
            if (e.Eid == id) {
                emp = e;
                break;
            }
        }

        if (emp == null) {
            System.out.println("Employee not found!");
            System.out.println("----------------------------------------------------------------------");
            return;
        }

        System.out.println("Select the attribute you want to update:");
        System.out.println("1. Department");
        System.out.println("2. Salary");
        System.out.println("3. HR Name");
        int choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter new Department: ");
                emp.Dept = s.nextLine();
                break;
            case 2:
                System.out.println("Enter new Salary: ");
                emp.Sal = s.nextDouble();
                s.nextLine(); 
                break;
            case 3:
                System.out.println("Enter new HR Name: ");
                emp.HRName = s.nextLine();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        System.out.println("Employee details updated successfully!");
        System.out.println("----------------------------------------------------------------------");
    }
    
    public void DeleteEmployee() {
        
        System.out.println("Enter the Emp Id: ");
        int id = s.nextInt();
        s.nextLine(); 

        EmployeeDetails emp = null;
        for (EmployeeDetails e : empList) {
            if (e.Eid == id) {
                emp = e;
                break;
            }
        }

        if (emp == null) {
            System.out.println("Employee not found!");
            System.out.println("----------------------------------------------------------------------");
            return;
        }

        empList.remove(emp);

        System.out.println("Employee removed successfully!");
        System.out.println("----------------------------------------------------------------------");
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
