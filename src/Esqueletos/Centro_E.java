/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueletos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Centro_E implements Esqueleto{
    
    int plata = 500, oro = 500, diamante = 500;
    int MAXplata = 10000, MAXoro = 5000, MAXdiamante = 3000;

    @Override
    public String M_entrenar() {
        return null;
    }

    @Override
    public String M_atacar() {
        return null;
    }

    @Override
    public String M_defender() {
        return null;
    }

    @Override
    public String E_generar() {
        return null;
    }

    @Override
    public String E_recolectar() {
        return null;
    }

    @Override
    public String V_construccion() {
        return null;
    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCE() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(plata);
        Centro.add(oro);
        Centro.add(diamante);
        Centro.add(MAXplata);
        Centro.add(MAXoro);
        Centro.add(MAXdiamante);
        System.out.println("\n\t\tRey, ahora tiene un centro de mando Esqueletico.");
        return Centro;
    }

    @Override
    public void mejorarCE(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                int r1 = (((int) 0.1) * (Centro.get(3)));//10% plata
                int r2 = (((int) 0.1) * (Centro.get(4)));//10% oro
                int r3 = (((int) 0.1) * (Centro.get(5)));//10% diamante
                costo = ((int) 0.25) * (Centro.get(3) + r1 + Centro.get(4) + r2 + Centro.get(5) + r3);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                } else {
                    System.out.println("No dispone de la cantidad de recursos necesaria: " + costo + " cada de recurso");
                }
                break;
            case 2:
                int r11 = (((int) 0.3) * (Centro.get(3)));//30% plata
                int r21 = (((int) 0.3) * (Centro.get(4)));//30% oro
                int r31 = (((int) 0.3) * (Centro.get(5)));//30% diamante
                costo = ((int) 0.25) * (Centro.get(3) + r11 + Centro.get(4) + r21 + Centro.get(5) + r31);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                } else {
                    System.out.println("No dispone de la cantidad de recursos necesaria: " + costo + " cada de recurso");
                }
                break;
            case 3:
                int r12 = (((int) 0.5) * (Centro.get(3)));//50% plata
                int r22= (((int) 0.5) * (Centro.get(4)));//50% oro
                int r32 = (((int) 0.5) * (Centro.get(5)));//50% diamante
                costo = ((int) 0.25) * (Centro.get(3) + r12 + Centro.get(4) + r22 + Centro.get(5) + r32);
                costo /= costo;
                if (Centro.get(0) >= costo && Centro.get(1) >= costo && Centro.get(2) >= costo) {
                    Centro.set(0, -costo);
                    Centro.set(1, -costo);
                    Centro.set(2, -costo);
                }
                else{
                    System.out.println("No dispone de la cantidad de recursos necesaria: "+costo+" cada de recurso");
                }
                break;
        }
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |"+"   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Alma: "+Centro.get(0)+"       \t"+"\t"+Centro.get(3)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Cristal: "+Centro.get(1)+"    \t"+"\t"+Centro.get(4)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Luz: "+Centro.get(2)+"      \t"+"\t"+Centro.get(5)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------------------------------+\n");
    }
    
}
