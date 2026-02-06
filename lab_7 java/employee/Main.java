/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.util.ArrayList;

/**
 *
 * @author huutr
 */
public class Main {
    public static void main(String[] args) {
        // Tạo danh sách Employee
    ArrayList<Employee> list = new ArrayList<>();    
        // Thêm 1 FullTimeEmployee
    Employee e1 = new FullTimeEmployee ("SD0001","Nguyễn Hữu Trường",19900000);
        // Thêm 1 PartTimeEmployee
    Employee e2 = new PartTimeEmployee ("SD0002","Nguyễn Văn Tèo",1000,100000); 
    // Đưa vào ArrayList
    list.add(e1);
    list.add(e2);
    // Duyệt danh sách và in thông tin + lương
    for (Employee e : list) {
        System.out.println(e.toString());
        System.out.println("Salary" + e.getSalary());
        System.out.println("-----------------");
    }
    }
}
