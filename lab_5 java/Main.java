/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author huutr
 */
public class Main {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Laptop> list = new ArrayList<>();

        // Bài 2: Nhập 5 laptop
        System.out.println("=== NHẬP 5 LAPTOP ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Laptop thứ " + (i + 1));
            Laptop lt = new Laptop();
            lt.input();
            list.add(lt);
        }

        // Xuất 5 laptop
        System.out.println("\n=== DANH SÁCH LAPTOP ===");
        for (Laptop lt : list) {
            lt.output();
        }

        // Bài 3: Xuất theo khoảng giá
        System.out.print("\nNhập giá min: ");
        double min = sc.nextDouble();
        System.out.print("Nhập giá max: ");
        double max = sc.nextDouble();

        System.out.println("Laptop trong khoảng giá:");
        for (Laptop lt : list) {
            if (lt.getPrice() >= min && lt.getPrice() <= max) {
                lt.output();
            }
        }

        sc.nextLine(); // clear buffer

        // Bài 4: Tìm theo id hoặc name
        System.out.print("\nNhập id hoặc name cần tìm: ");
        String key = sc.nextLine();

        for (Laptop lt : list) {
            if (lt.getId().equalsIgnoreCase(key) ||
                lt.getName().equalsIgnoreCase(key)) {
                lt.output();
            }
        }

        // Bài 5: Tìm theo id và cập nhật name
        System.out.print("\nNhập ID cần cập nhật tên: ");
        String idUpdate = sc.nextLine();

        for (Laptop lt : list) {
            if (lt.getId().equalsIgnoreCase(idUpdate)) {
                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                lt.setName(newName);
                System.out.println("Cập nhật thành công!");
            }
        }
        
//        // Bài 6: Sắp xếp theo name
    Collections.sort(list, (Laptop o1, Laptop o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP THEO NAME ===");
        for (Laptop lt : list) {
            lt.output();
        }
    }
}
