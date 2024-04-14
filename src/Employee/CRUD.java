package Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD {
    public static List<Employee> employees = new ArrayList<>();

    public static void createEmployee() {
        Scanner cin = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\tAdd Employee");

        try {
            System.out.println("\tName: ");
            String name = cin.nextLine();

            System.out.println("\tSurname: ");
            String surname = cin.nextLine();

            System.out.println("\tIDNP: ");
            String IDNP = cin.nextLine();

            System.out.println("\tDepartment: ");
            String department = cin.nextLine();

            System.out.println("\tFunction: ");
            String function = cin.nextLine();

            System.out.println("\tSalary: ");
            double salary = cin.nextDouble();

            int id = employees.isEmpty() ? 1 : employees.getLast().getId() + 1;

            Employee aux = new Employee(id, name, surname, IDNP, department, function, salary);
            employees.add(aux);
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        cin.nextLine();
        System.out.println("\n\tPress Enter to continue...");
        cin.nextLine();
    }

    public static void readEmployees() {
        Scanner cin = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\tEmployees");
        System.out.println("\t1. See all employees");
        System.out.println("\t2. Search by ID");
        System.out.println("\t3. Menu");
        System.out.println("\tChoose from 1 to 3: ");

        try {
            int key = 0;
            key = cin.nextInt();
            cin.nextLine();

            switch(key) {
                case 1: {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("\t\tEmployees");

                    for (Employee employee : employees) {
                        System.out.println(employee.getId() + ". " + employee.getName() + " " + employee.getSurname() + " | IDNP: " + employee.getIDNP() + " | Department: "
                                + employee.getDepartment() + " | Function: " + employee.getFunction() + " | Salary: " + employee.getSalary());
                    }

                    break;
                }

                case 2: {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("\t\tEmployees");
                    System.out. println("\tEnter employee ID: ");

                    int id = cin.nextInt();
                    cin.nextLine();

                    for (Employee employee : employees) {
                        if (employee.getId() == id) {
                            System.out.println(employee.getId() + ". " + employee.getName() + " " + employee.getSurname() + " | IDNP: " + employee.getIDNP() + " | Department: "
                                    + employee.getDepartment() + " | Function: " + employee.getFunction() + " | Salary: " + employee.getSalary());
                            break;
                        }
                    }

                    break;
                }

                case 3: {
                    return;
                }

                default: {
                    System.out.println("\tYour option doesn't exist!");
                    System.out.println("\tChoose from 1 to 3");
                }
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("\n\tPress Enter to continue...");
        cin.nextLine();
    }

    public static void updateEmployee() {
        Scanner cin = new Scanner(System.in);

        boolean employeeFound = false;

        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\tEdit Employee");
        System.out.println("\tEnter employee ID: ");

        try {
            int id = cin.nextInt();

            for (Employee employee : employees) {
                if (id == employee.getId()) {
                    employeeFound = true;

                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("\t\tEdit Employee");
                    System.out.println(employee.getId() + ". " + employee.getName() + " " + employee.getSurname() + " | IDNP: " + employee.getIDNP() + " | Department: "
                            + employee.getDepartment() + " | Function: " + employee.getFunction() + " | Salary: " + employee.getSalary());
                    System.out.println("\t1. Edit name");
                    System.out.println("\t2. Edit surname");
                    System.out.println("\t3. Edit IDNP");
                    System.out.println("\t4. Edit department");
                    System.out.println("\t5. Edit function");
                    System.out.println("\t6. Edit salary");
                    System.out.println("\t7. Menu");
                    System.out.println("\tChoose from 1 to 7: ");

                    int key = cin.nextInt();
                    cin.nextLine();

                    switch(key) {
                        case 1: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual name: " + employee.getName());
                            System.out.println("\tEnter new name: ");

                            String name = cin.nextLine();
                            employee.setName(name);

                            break;
                        }

                        case 2: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual surname: " + employee.getSurname());
                            System.out.println("\tEnter new surname: ");

                            String surname = cin.nextLine();
                            employee.setSurname(surname);

                            break;
                        }

                        case 3: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual IDNP: " + employee.getIDNP());
                            System.out.println("\tEnter new IDNP: ");

                            String IDNP = cin.nextLine();
                            employee.setIDNP(IDNP);

                            break;
                        }

                        case 4: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual department: " + employee.getDepartment());
                            System.out.println("\tEnter new department: ");

                            String department = cin.nextLine();
                            employee.setDepartment(department);

                            break;
                        }

                        case 5: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual function: " + employee.getFunction());
                            System.out.println("\tEnter new function: ");

                            String function = cin.nextLine();
                            employee.setFunction(function);

                            break;
                        }

                        case 6: {
                            System.out.println("\n\n\n\n\n\n");
                            System.out.println("\t\tEdit Employee");
                            System.out.println("\tActual salary: " + employee.getSalary());
                            System.out.println("\tEnter new salary: ");

                            double salary = cin.nextDouble();
                            employee.setSalary(salary);

                            cin.nextLine();

                            break;
                        }

                        case 7: {
                            return;
                        }

                        default: {
                            System.out.println("\tYour option doesn't exist!");
                            System.out.println("\tChoose from 1 to 7");
                        }
                    }

                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        if (!employeeFound) {
            System.out.println("\tEmployee not found | Invalid ID");
            cin.nextLine();
        }

        System.out.println("\n\tPress Enter to continue...");
        cin.nextLine();
    }

    public static void deleteEmployee() {
        Scanner cin = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\tDelete Employee");
        System.out.println("\tEnter employee ID: ");

        try {
            int initialSize = employees.size();
            int id = cin.nextInt();
            employees.removeIf(employee -> id == employee.getId());
            int removedSize = employees.size();

            if (initialSize > removedSize) {    //Se verifica daca s-a eliminat angajatul
                System.out.println("\tEmployee successfully removed ");
            }
            else {
                System.out.println("\tEmployee not found | Invalid ID");
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        cin.nextLine();
        System.out.println("\n\tPress Enter to continue...");
        cin.nextLine();
    }
}
