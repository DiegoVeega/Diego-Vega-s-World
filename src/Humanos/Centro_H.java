/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Centro_H implements Humano{
    
    int madera = 500, piedra = 500, hierro = 500;
    int MAXmadera = 10000, MAXpiedra = 5000, MAXhierro = 3000;
    
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
    public ArrayList<Integer> generarCH() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(madera);
        Centro.add(piedra);
        Centro.add(hierro);
        Centro.add(MAXmadera);
        Centro.add(MAXpiedra);
        Centro.add(MAXhierro);
        System.out.println("\n\t\tRey, ahora tiene un centro de mando Humano.");
        return Centro;    }

    @Override
    public void mejorarCH(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                int r1 = (((int) 0.1) * (Centro.get(3)));//10% madera
                int r2 = (((int) 0.1) * (Centro.get(4)));//10% piedra
                int r3 = (((int) 0.1) * (Centro.get(5)));//10% hierro
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
                int r11 = (((int) 0.3) * (Centro.get(3)));//30% madera
                int r21 = (((int) 0.3) * (Centro.get(4)));//30% piedra
                int r31 = (((int) 0.3) * (Centro.get(5)));//30% hierro
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
                int r12 = (((int) 0.5) * (Centro.get(3)));//50% madera
                int r22= (((int) 0.5) * (Centro.get(4)));//50% piedra
                int r32 = (((int) 0.5) * (Centro.get(5)));//50% hierro
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
    public void mostrarCH(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |"+"   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Madera: "+Centro.get(0)+"       \t"+"\t"+Centro.get(3)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Piedra: "+Centro.get(1)+"    \t"+"\t"+Centro.get(4)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Hierro: "+Centro.get(2)+"      \t"+"\t"+Centro.get(5)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------------------------------+\n");
    }
    
    
    
}
