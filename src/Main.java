import Employee.Menu;
import Employee.FileManager;

import java.io.File;

class Main {
    public static void main(String[] args) {
        FileManager.loadEmployees();
        Menu.menu();
        FileManager.saveEmployees();
    }
}