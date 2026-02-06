/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.Cylinder;

/**
 *
 * @author huutr
 */
public class CylinderService {

    public double tinhTongTheTich(ArrayList<Cylinder> list) {
        double tong = 0;
        for (Cylinder c : list) {
            tong += c.getVolume();
        }
        return tong;
    }

    public Cylinder timTheTichLonNhat(ArrayList<Cylinder> list) {
        Cylinder max = list.get(0);
        for (Cylinder c : list) {
            if (c.getVolume() > max.getVolume()) {
                max = c;
            }
        }
        return max;
    }
}
