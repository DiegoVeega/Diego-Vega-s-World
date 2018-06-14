/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Tribu implements Bestia {

    private int vida = 50;
    private String nombre = "Tribu";
    private int ataque = 70;
    private boolean entrenado = false;

    public Tribu() {

    }

    public Tribu(int vida, String nombre,int ataque) {
        this.vida = vida;
        this.nombre = nombre;
        this.ataque = ataque;
    }
    //////////////////////////////////////////////////////////////////

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }

    //////////////////////////////////////////////////////////////////
    //METODOS MILICIA.
    @Override
    public ArrayList<Tribu> M_entrenar(ArrayList<Integer> Centro) {
        Centro.set(0,Centro.get(0)-400);
        Centro.set(1,Centro.get(1)-400);
        
        ArrayList<Tribu> Milicia = new ArrayList<>();
        Tribu tribu = new Tribu();
        entrenado = true;
        Milicia.add(tribu);
        System.out.println("\n\t\tSe esta entrenando a su tribu, Rey...");
        return Milicia;
    }

    @Override
    public void M_atacar(ArrayList<Tribu> Tribu,ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        
        Centro.set(1,Centro.get(1)-200);
        Centro.set(2,Centro.get(2)-200);
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Tribu> Milicia = new ArrayList<>();
        Milicia = Tribu;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (Tribu t : Milicia) {
            for (int i = 0; i < Milicia.size(); i++) {
                System.out.println("\t\t" + (i =i+ 1) + ". Soy una " + t.getNombre() + " con " + t.getVida() + " de vida y tengo " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tA quien desea enviar? ");
        op=text.nextInt();
        System.out.println("\t\tSe enviara a: "+Milicia.get(op-1));
        Centros.set(6, Centros.get(6)-ataque);
        Milicia.remove(op-1);
    }
    
    @Override
    public void M_defender(ArrayList<Tribu> Tribu, ArrayList<Integer> Centro) {
        
        Centro.set(0,Centro.get(0)-100);
        Centro.set(2,Centro.get(2)-100);
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Tribu> Milicia = new ArrayList<>();
        Milicia = Tribu;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (Tribu t : Milicia) {
            for (int i = 0; i < Milicia.size(); i++) {
                System.out.println("\t\t" + i + 1 + "Soy una " + t.getNombre() + " con " + t.getVida() + " de vida y tengo " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tA quien desea enviar? ");
        op=text.nextInt();
        System.out.println("Se enviara a: "+Milicia.get(op-1));
        Milicia.remove(op-1);
    }

    //METODOS EDIFICACION.
    @Override
    public int E_generar() {
        return 0;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        return null;
    }

    //METODOS VEHICULO.
    

    @Override
    public ArrayList<Integer> generarCB() {
        return null;
    }

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {

    }

    @Override
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
        return null;
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
