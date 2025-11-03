package com.github.dutkercz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int cedula100 = 0,cedula50 = 0,cedula20 = 0, cedula10 = 0,cedula5 = 0,
                cedula2 = 0, cedula1 = 0, resto = 0;
        int valor = scan.nextInt();
        int total = valor;

        cedula100 = valor / 100;
        valor %= 100;
        cedula50 = valor / 50;
        valor %= 50;
        cedula20 = valor / 20;
        valor %= 20;
        cedula10 = valor / 10;
        valor %= 10;
        cedula5 = valor / 5;
        valor %= 5;
        cedula2 = valor / 2;
        valor %= 2;
        cedula1 = valor;

        System.out.println(total);
        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");

    }

}