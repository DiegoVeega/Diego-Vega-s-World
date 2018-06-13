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
public class Centro_E implements Esqueleto {
    
    int plata = 1700, oro = 1700, diamante = 1700;
    int MAXplata = 10000, MAXoro = 5000, MAXdiamante = 3000;
    int vida = 2500;

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
        System.out.println("\n\t\t\t\t\t\tRey, ahora tiene un centro de mando Esqueletico.\n");
        return Centro;
    }

    @Override
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                costo = 1650;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, Centro.get(0)+((int)0.1*Centro.get(0)));
                Centro.set(4, Centro.get(1)+((int)0.1*Centro.get(1)));
                Centro.set(5, Centro.get(2)+((int)0.1*Centro.get(2)));
                System.out.println("\t\tSe realizo la mejora");
                break;
            case 2:
                costo = 1895;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, Centro.get(0)+((int)0.3*Centro.get(0)));
                Centro.set(4, Centro.get(1)+((int)0.3*Centro.get(1)));
                Centro.set(5, Centro.get(2)+((int)0.3*Centro.get(2)));

                System.out.println("\t\tSe realizo la mejora");
                break;
            case 3:
                costo = 2274;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, Centro.get(0)+((int)0.5*Centro.get(0)));
                Centro.set(4, Centro.get(1)+((int)0.5*Centro.get(1)));
                Centro.set(5, Centro.get(2)+((int)0.5*Centro.get(2)));
                System.out.println("\t\tSe realizo la mejora");
                break;
        }
        return Centro;
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\n\t\t\t\t\t\tCentro de mando: " + Centro.get(6) + " HP");
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\t\t\t\t\t\t|  Cantidad de recursos  |" + "   Capacidad maxima   |");
        System.out.println("\t\t\t\t\t\t|                        |" + "    \t\t\t|");
        System.out.println("\t\t\t\t\t\t|  Alma: " + Centro.get(0) + "       \t" + "\t" + Centro.get(3) + "\t\t|");
        System.out.println("\t\t\t\t\t\t|  Cristal: " + Centro.get(1) + "    \t" + "\t" + Centro.get(4) + "\t\t|");
        System.out.println("\t\t\t\t\t\t|  Luz: " + Centro.get(2) + "      \t" + "\t" + Centro.get(5) + "\t\t|");
        System.out.println("\t\t\t\t\t\t|                        |" + "    \t\t\t|");
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
    public ArrayList<Horda> M_entrenar(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Horda> Horda, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Horda> Horda, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EsqueletoColosal> M_entrenarE(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_E> V_construccion(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_E> VLigero_E, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_E> V_construccionP(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_E> VPesado_E, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
