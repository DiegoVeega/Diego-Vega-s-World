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
    int vida=2500;
    
    @Override
    public ArrayList<Integer> generarCH() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(madera);//0
        Centro.add(piedra);//1
        Centro.add(hierro);//2
        Centro.add(MAXmadera);//3
        Centro.add(MAXpiedra);//4
        Centro.add(MAXhierro);//5
        Centro.add(vida);//6
        System.out.println("\n\t\tRey, ahora tiene un centro de mando Humano.");
        return Centro;    
    }

    @Override
    public ArrayList<Integer> mejorarCH(int num, ArrayList<Integer> Centro) {
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
        return Centro;
    }

    @Override
    public void mostrarCH(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\n\t\t\t\t\t\tCentro de mando: "+Centro.get(6)+" HP");
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |"+"   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Madera: "+Centro.get(0)+"       \t"+"\t"+Centro.get(3)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Piedra: "+Centro.get(1)+"    \t"+"\t"+Centro.get(4)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Hierro: "+Centro.get(2)+"      \t"+"\t"+Centro.get(5)+"\t\t|");
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
    public ArrayList<Soldados> M_entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Soldados> Tribu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Soldados> Tribu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Especialista> M_entrenarE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<Especialista> Especialista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<Especialista> Especialista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_H> V_construccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_H> VLigero_H) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_H> V_construccionP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_H> VPesado_H) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
