/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacePayment;

import java.util.ArrayList;

/**
 *
 * @author huutr
 */
public class Main {
    public static void main(String[] args) {
    // Tạo danh sách CashPayment
    ArrayList<CashPayment> list = new ArrayList<>();
    // Thêm 5 CashPayment
    list.add(new CashPayment());
    list.add(new CashPayment());
    list.add(new CashPayment());
    list.add(new CashPayment());
    list.add(new CashPayment());
    // Giả sử số tiền ban đầu chưa thuế
    double amount = 100000;
    // Duyệt ds và gọi pay
    for (int i = 0;i < list.size(); i++) {
        double total = list.get(i).pay(amount);
        System.out.println("CastPayment" +  (i + 1) + ": " + total);
    }
    }
}