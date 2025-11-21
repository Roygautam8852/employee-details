import java.util.Scanner;
class Employee {
    int id;
    String name;
    String department;
    float salary;
 
    Employee(int id, String name,String department,float salary) {
        this.id = id;
        this.name = name;
	this.department=department;
	this.salary=salary;
    }

    
    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID    : " + id);
        System.out.println("Name           : " + name);
	System.out.println("Department     :"  + department);
	System.out.println("Salary         :"  + salary);
    }
}


class EmployeeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

	System.out.print("Enter Employee Department: ");
	String department=sc.nextLine();
	
	System.out.print("Enter Employee Salary: ");
	float salary=sc.nextFloat();
     
        Employee emp = new Employee(id, name,department,salary);

        
        emp.display();

        sc.close();
    }
}

