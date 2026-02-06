/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author huutr
 */
public class FullTimeEmployee extends Employee {
    // Thuộc tính
    public double basicSalary;
    // Hàm tạo

    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return this.basicSalary;
    }

    @Override
    public String toString() {
       return "id=" + id + ",name=" + name;
    }
}
