/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Centro_B implements Bestia {

    int alma = 500, cristal = 500, luz = 500;
    int MAXalma = 10000, MAXcristal = 5000, MAXluz = 3000;

    @Override
    public void V_construccion() {

    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCB() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(alma);
        Centro.add(cristal);
        Centro.add(luz);
        Centro.add(MAXalma);
        Centro.add(MAXcristal);
        Centro.add(MAXluz);
        System.out.println("\n\t\tRey, ahora tiene un centro de mando bestial.");
        return Centro;
    }

    @Override
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                int r1 = (((int) 0.1) * (Centro.get(3)));//10% alma
                int r2 = (((int) 0.1) * (Centro.get(4)));//10% cristal
                int r3 = (((int) 0.1) * (Centro.get(5)));//10% luz
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
                int r11 = (((int) 0.3) * (Centro.get(3)));//30% alma
                int r21 = (((int) 0.3) * (Centro.get(4)));//30% cristal
                int r31 = (((int) 0.3) * (Centro.get(5)));//30% luz
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
                int r12 = (((int) 0.5) * (Centro.get(3)));//50% alma
                int r22= (((int) 0.5) * (Centro.get(4)));//50% cristal
                int r32 = (((int) 0.5) * (Centro.get(5)));//50% luz
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
        return Centro;
    }

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |"+"   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Alma: "+Centro.get(0)+"       \t"+"\t"+Centro.get(3)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Cristal: "+Centro.get(1)+"    \t"+"\t"+Centro.get(4)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Luz: "+Centro.get(2)+"      \t"+"\t"+Centro.get(5)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------------------------------+\n");
    }

    @Override
    public int E_generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tribu> M_entrenar() {
        return null;
    }

    @Override
    public void M_atacar(ArrayList<Tribu> Tribu) {
        
    }

    @Override
    public void M_defender(ArrayList<Tribu> Tribu) {
        
    }

    @Override
    public ArrayList<BestiaMayor> M_entrenarE() {
        return null;
    }

    @Override
    public void M_atacarE(ArrayList<BestiaMayor> BestiaMayor) {
        
    }

    @Override
    public void M_defenderE(ArrayList<BestiaMayor> BestiaMayor) {
        
    }

}
