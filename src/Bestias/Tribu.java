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
    private int ataque = 50;
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
    public ArrayList<Tribu> M_entrenar() {
        ArrayList<Tribu> Milicia = new ArrayList<>();
        Tribu tribu = new Tribu();
        entrenado = true;
        Milicia.add(tribu);
        System.out.println("\n\t\tSe esta entrenando a su tribu, Rey...");
        return Milicia;
    }

    @Override
    public void M_atacar(ArrayList<Tribu> Tribu) {
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

    @Override
    public void M_defender(ArrayList<Tribu> Tribu) {
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
    public ArrayList<BestiaMayor> M_entrenarE() {
        return null;
    }

    @Override
    public void M_atacarE(ArrayList<BestiaMayor> BestiaMayor) {
        
    }

    @Override
    public void M_defenderE(ArrayList<BestiaMayor> BestiaMayor) {
        
    }

    @Override
    public ArrayList<VLigero_B> V_construccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacar(ArrayList<VLigero_B> VLigero_B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_B> V_construccionP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_B> VPesado_B) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
