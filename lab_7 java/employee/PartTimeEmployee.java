/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author huutr
 */
public class PartTimeEmployee extends Employee {
    public int workHours;
    public double salaryPerHour;

    public PartTimeEmployee(String id, String name, int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double getSalary() {
    return workHours * salaryPerHour;
    }

    @Override
    public String toString() {
    return "workHours=" + workHours + ",salaryPerHour=" + salaryPerHour;
    }
}
