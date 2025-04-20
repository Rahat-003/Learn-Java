package Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample2 {
    public static void main(String[] args) {
        Employee employee = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn)) {

            employee = (Employee) in.readObject();
            System.out.println("Deserialized Employee: " + employee);
            System.out.println("Name: " + employee.getName());
            System.out.println("Id: " + employee.getId());
            System.out.println("Salary: " + employee.getSalary());


        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
