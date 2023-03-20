package com.OpenBootcamp;

public class Exercise2 {
    public static void main(String[] args){
        int precio = 10;
        double imprimir = iVa(precio);
        System.out.println(imprimir);
    }

    private static double iVa(int precio){
        double iVaCalc = precio + 5.67;
        return iVaCalc;
    }
}
