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
    
    int madera = 1700, piedra = 1700, hierro = 1700;
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
        System.out.println("\n\t\t\t\t\t\tRey, ahora tiene un centro de mando Humano.\n");
        return Centro;    
    }

    @Override
    public ArrayList<Integer> mejorarCH(int num, ArrayList<Integer> Centro) {
        int costo;
        switch (num) {
            case 1:
                costo = 1650;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, 11000);
                Centro.set(4, 5500);
                Centro.set(5, 3300);
                System.out.println("\t\t\t\t\t                                                  \n"
                        + "\t\t\t\t\t,--.  ,--.,--.,--.   ,--.,------.,--.        ,--. \n"
                        + "\t\t\t\t\t|  ,'.|  ||  | \\  `.'  / |  .---'|  |       /   | \n"
                        + "\t\t\t\t\t|  |' '  ||  |  \\     /  |  `--, |  |       `|  | \n"
                        + "\t\t\t\t\t|  | `   ||  |   \\   /   |  `---.|  '--.     |  | \n"
                        + "\t\t\t\t\t`--'  `--'`--'    `-'    `------'`-----'     `--' \n"
                        + "\t\t\t\t\t                                                  ");
                break;
            case 2:
                costo = 1895;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, 14300);
                Centro.set(4, 7150);
                Centro.set(5, 4290);
                System.out.println("\t\t\t\t\t                                                    \n"
                        + "\t\t\t\t\t,--.  ,--.,--.,--.   ,--.,------.,--.        ,---.  \n"
                        + "\t\t\t\t\t|  ,'.|  ||  | \\  `.'  / |  .---'|  |       '.-.  \\ \n"
                        + "\t\t\t\t\t|  |' '  ||  |  \\     /  |  `--, |  |        .-' .' \n"
                        + "\t\t\t\t\t|  | `   ||  |   \\   /   |  `---.|  '--.    /   '-. \n"
                        + "\t\t\t\t\t`--'  `--'`--'    `-'    `------'`-----'    '-----' \n"
                        + "\t\t\t\t\t                                                    ");
                break;
            case 3:
                costo = 2274;
                Centro.set(0, Centro.get(0)-costo);
                Centro.set(1, Centro.get(1)-costo);
                Centro.set(2, Centro.get(2)-costo);
                
                Centro.set(3, 21450);
                Centro.set(4, 10725);
                Centro.set(5, 6435);
                System.out.println("\t\t\t\t\t                                                    \n"
                        + "\t\t\t\t\t,--.  ,--.,--.,--.   ,--.,------.,--.       ,----.  \n"
                        + "\t\t\t\t\t|  ,'.|  ||  | \\  `.'  / |  .---'|  |       '.-.  | \n"
                        + "\t\t\t\t\t|  |' '  ||  |  \\     /  |  `--, |  |         .' <  \n"
                        + "\t\t\t\t\t|  | `   ||  |   \\   /   |  `---.|  '--.    /'-'  | \n"
                        + "\t\t\t\t\t`--'  `--'`--'    `-'    `------'`-----'    `----'  \n"
                        + "\t\t\t\t\t                                                   ");
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
    public ArrayList<Soldados> M_entrenar(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Soldados> Tribu, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Soldados> Tribu, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Especialista> M_entrenarE(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_H> V_construccion(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_H> VLigero_H, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_H> V_construccionP(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_H> VPesado_H, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
