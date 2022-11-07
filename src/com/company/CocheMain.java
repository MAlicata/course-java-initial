package com.company;

public class CocheMain {

    public static void main(String[] args) {
        //Coche cocheObj = new Coche();
        /*
        * cuando la clase es abstracta, no sé puede instanciar objeto del tipo abstracto en el main.
        * */

        //Coche cocheObj2 = new Coche("rojo", "honda", "civid", 1430.5, 5.4);

        //cocheObj2.acelerar(50);

        //System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo de motor";
        cocheElectrico.fabricante = "Honda";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500.0, 4.09, "txt");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
