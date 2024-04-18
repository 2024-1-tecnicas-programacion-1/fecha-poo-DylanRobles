package com.mycompany.fecha.poo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
    Fecha datos = new Fecha( a,  b,  c);
    System.out.println(datos.fechaLarga());
    }



}
