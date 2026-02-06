/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacePayment;

/**
 *
 * @author huutr
 */
public class CashPayment implements Payment{

    @Override
    public double pay(double amount) {
       return amount + amount * TAX;
    }
}