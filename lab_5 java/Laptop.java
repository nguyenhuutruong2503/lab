/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author huutr
 */
public class Laptop implements Comparator {
    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    // Constructor không tham số
    public Laptop() {
    }

    // Constructor có tham số
    public Laptop(String id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Hàm nhập
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập loại: ");
        type = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    // Hàm xuất
    public void output() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Type: " + type +
                " | Price: " + price +
                " | Quantity: " + quantity);
    }
    public int compare(Laptop o1, Laptop o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 1;// (o1.getName().compareToIgnoreCase(o2.getName());
    }
}
