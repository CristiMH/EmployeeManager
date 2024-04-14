package Employee;
import java.util.Scanner;

public class Menu {

    public static  void menu() {
        Scanner cin = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n\n\n\n\n");
            System.out.println("\t\t Menu");
            System.out.println("\t1. See Employees");
            System.out.println("\t2. Add Employee");
            System.out.println("\t3. Edit Employee");
            System.out.println("\t4. Delete Employee");
            System.out.println("\t5. Exit Application");
            System.out.println("\tChoose from 1 to 5: ");

            int key = 0;

            key = cin.nextInt();

            switch(key) {
                case 1: {
                    CRUD.readEmployees();
                    break;
                }

                case 2: {
                    CRUD.createEmployee();
                    break;
                }

                case 3: {
                    CRUD.updateEmployee();
                    break;
                }

                case 4: {
                    CRUD.deleteEmployee();
                    break;
                }

                case 5: {
                    return;
                }

                default: {
                    System.out.println("\tYour choice doesn't exist!");
                    System.out.println("\tChoose from 1 to 5");
                }
            }
        }
    }

}
