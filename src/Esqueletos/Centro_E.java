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
    /**
    private int vida=2500;
    private int plata=500;
    private int oro=500;
    private int diamante=500;
    private int MAXplata=10000;
    private int MAXoro=5000;
    private int MAXdiamante=3000;
    
    public Centro_E() {
    }
    
    public Centro_E(int vida, int plata, int oro, int diamante, int MAXplata, int MAXoro, int MAXdiamante){
        this.vida=vida;
        this.plata=plata;
        this.oro=oro;
        this.diamante=diamante;
        this.MAXplata=MAXplata;
        this.MAXoro=MAXoro;
        this.MAXdiamante=MAXdiamante;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getDiamante() {
        return diamante;
    }

    public void setDiamante(int diamante) {
        this.diamante = diamante;
    }

    public int getMAXplata() {
        return MAXplata;
    }

    public void setMAXplata(int MAXplata) {
        this.MAXplata = MAXplata;
    }

    public int getMAXoro() {
        return MAXoro;
    }

    public void setMAXoro(int MAXoro) {
        this.MAXoro = MAXoro;
    }

    public int getMAXdiamante() {
        return MAXdiamante;
    }

    public void setMAXdiamante(int MAXdiamante) {
        this.MAXdiamante = MAXdiamante;
    }
    */
    int plata = 500, oro = 500, diamante = 500;
    int MAXplata = 10000, MAXoro = 5000, MAXdiamante = 3000;
    int vida=2500;

    @Override
    public ArrayList<Integer> generarCE() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(plata);//0
        Centro.add(oro);//1
        Centro.add(diamante);//2
        Centro.add(MAXplata);//3
        Centro.add(MAXoro);//4
        Centro.add(MAXdiamante);//5
        Centro.add(vida);//6
        System.out.println("\n\t\tRey, ahora tiene un centro de mando Esqueletico.");
        return Centro;
    }

    @Override
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
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
        return Centro;
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\n\t\t\t\t\t\tCentro de mando: "+Centro.get(6)+" HP");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |"+"   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Alma: "+Centro.get(0)+"       \t"+"\t"+Centro.get(3)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Cristal: "+Centro.get(1)+"    \t"+"\t"+Centro.get(4)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|  Luz: "+Centro.get(2)+"      \t"+"\t"+Centro.get(5)+"\t\t|");
        System.out.println("\t\t\t\t\t\t|                        |"+"    \t\t\t|");
        System.out.println("\t\t\t\t\t\t+-----------------------------------------------+\n");
    }

    @Override
    public ArrayList<Horda> M_entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Horda> Horda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Horda> Horda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EsqueletoColosal> M_entrenarE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public ArrayList<VLigero_E> V_construccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_E> VLigero_E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_E> V_construccionP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_E> VPesado_B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
