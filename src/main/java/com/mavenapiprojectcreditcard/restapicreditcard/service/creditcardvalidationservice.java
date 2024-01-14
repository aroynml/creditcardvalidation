/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mavenapiprojectcreditcard.restapicreditcard.service;

/**
 *
 * @author roy
 */
public class creditcardvalidationservice {
    
    //valid is true if total ends in zero 
    public boolean isValid(String cardNumber){
        return ((getSingleDigit(sumEvenPlaceDouble(cardNumber)) + sumOddPlace(cardNumber)) % 10 == 0);
    }
    
    //if doubled number is greater than 9, add it's two digit together
    public int getSingleDigit(int number)
    {
        return (number < 9) ? number : (number /10 + number %10);
    }
    
    //sum every digit (odd)
    public int sumOddPlace(String cardNumber)
    {
        int total=0;
        for (int i = cardNumber.length() - 1; i>=0; i-=2){
            total += Integer.parseInt(cardNumber.charAt(i) + "");
        }
        return total;
    }
    
    //sum and double every second digit (even)
    public int sumEvenPlaceDouble(String cardNumber)
    {
        int total=0;
        for (int i = cardNumber.length() - 2; i>=0; i-=2){
            total += (Integer.parseInt(cardNumber.charAt(i) + "") * 2);
        }
        return total;
    }
}
