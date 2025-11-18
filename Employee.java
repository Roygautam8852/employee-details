import java.util.Scanner;
class Employee {
    int id;
    String name;
 
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID    : " + id);
        System.out.println("Name           : " + name);
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

     
        Employee emp = new Employee(id, name);

        
        emp.display();

        sc.close();
    }
}

