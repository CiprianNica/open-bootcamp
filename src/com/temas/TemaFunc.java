package com.temas;

public class TemaFunc {
    public static void main(String[] args) {
        double precio = 35.60;
        System.out.println("Precio sin IVA: "+precio);
        //precioIva = addIva(precio);
        System.out.println("Precio con IVA: "+ addIva(precio));
    }
    static double addIva(double precio){
        return (precio*1.21);
    }
}
