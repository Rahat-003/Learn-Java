package Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * https://medium.com/@pratik.941/serialization-and-deserialization-in-java-6dbd11fd31b3
 */

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}

public class SerializeExample2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Kabir", 101, 10000);

        try(FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(employee);
            System.out.println("Serialized data is saved in employee.ser " + employee);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
