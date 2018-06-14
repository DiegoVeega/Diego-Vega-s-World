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

    int alma = 1700, cristal = 1700, luz = 1700;
    int MAXalma = 10000, MAXcristal = 5000, MAXluz = 3000;
    int vida=2100;
    
    @Override
    public ArrayList<Integer> generarCB() {
        ArrayList<Integer> Centro = new ArrayList<>();
        Centro.add(alma);//0
        Centro.add(cristal);//1
        Centro.add(luz);//2
        Centro.add(MAXalma);//3
        Centro.add(MAXcristal);//4
        Centro.add(MAXluz);//5
        Centro.add(vida);//6
        System.out.println("\n\t\t\t\t\t\tRey, ahora tiene un centro de mando bestial.\n");
        return Centro;
    }

    @Override
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
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
    public void mostrarCB(ArrayList<Integer> Centro) {
        System.out.println("\n\t\t\t\t\t\t+-----------------------------------------------+");
        System.out.println("\n\t\t\t\t\t\tCentro de mando: "+Centro.get(6)+" HP");
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
        return 0;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        return null;
    }

    @Override
    public ArrayList<Tribu> M_entrenar(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Tribu> Tribu, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Tribu> Tribu, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BestiaMayor> M_entrenarE(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<BestiaMayor> BestiaMayor, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<BestiaMayor> BestiaMayor, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_B> V_construccion(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_B> VLigero_B, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_B> V_construccionP(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_B> VPesado_B, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
