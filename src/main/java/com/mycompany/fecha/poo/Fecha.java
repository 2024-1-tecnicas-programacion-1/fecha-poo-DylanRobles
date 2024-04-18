package com.mycompany.fecha.poo;

import java.util.HashMap;

public class Fecha {
    private int dia;
    private int mes;
    private int anno;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public String fechaCorta() {
        String fechaDia = dia + "";
        String fechaMes = mes + "";
        String fechaAnno = anno + "";
        fechaCorta = fechaDia + "/" + fechaMes + "/" + fechaAnno;
        return fechaCorta;
    }

    public boolean validarFecha() {

        if (mes > 12 || mes < 1) {
            return false;

        } else if (mes == 2) {
            if (anno % 4 == 0 && dia >= 1 && dia <= 29)
                return true;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dias >= 1
                && dia <= 31) {
            return true;

        } else if (dia > 30) {
            return true;

            return false;
        }

    }

    public String mesLetra() {

        HashMap<Integer, String> fechas = new HashMap<Integer, String>();
        fechas.put(1, "enero");
        fechas.put(2, "febrero");
        fechas.put(3, "marzo");
        fechas.put(4, "abril");
        fechas.put(5, "mayo");
        fechas.put(6, "junio");
        fechas.put(7, "julio");
        fechas.put(8, "agosto");
        fechas.put(9, "septiembre");
        fechas.put(10, "octubre");
        fechas.put(11, "noviembre");
        fechas.put(12, "diciembre");

        return fechas.get(mes);
    }

    public String fechaLarga() {

        String valor = dia + " de " + mesLetra() + " de " + anno;

        return valor;
    }

}
