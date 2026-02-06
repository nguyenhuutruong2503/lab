/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package employee;

/**
 *
 * @author huutr
 */
public abstract class Employee {
    protected String id;
    protected String name;

    // Hàm tạo
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng
    public abstract double getSalary();

    @Override
    public abstract String toString();
}

