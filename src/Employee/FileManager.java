package Employee;
import java.io.*;

public class FileManager extends CRUD {

    private static final String FILE_NAME = "employees.txt";

    public static void saveEmployees() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Employee employee : employees) {
                writer.write(employee.getId() + "," + employee.getName() + "," + employee.getSurname() + "," + employee.getIDNP() + ","
                        + employee.getDepartment() + "," + employee.getFunction() + "," + employee.getSalary() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void loadEmployees() {
        File file = new File(FILE_NAME);

        if (file.exists()) {
            try (FileReader fileReader = new FileReader(FILE_NAME);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String surname = parts[2];
                    String IDNP = parts[3];
                    String department = parts[4];
                    String function = parts[5];
                    double salary = Double.parseDouble(parts[6]);
                    employees.add(new Employee(id, name, surname, IDNP, department, function, salary));
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error loading data: " + e.getMessage());
            }
        }
    }
}
