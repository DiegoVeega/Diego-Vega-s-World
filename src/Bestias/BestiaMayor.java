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
public class BestiaMayor implements Bestia{
    
    private int vida = 100;
    private String nombre = "Bestia Mayor";
    private int ataque = 75;
    private boolean entrenado = false;
    
    public BestiaMayor(){
        
    }
    
    public BestiaMayor(int vida, String nombre,int ataque){
        this.vida = vida;
        this.nombre = nombre;
        this.ataque = ataque;
    }

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
    
    //METODOS MILICIA.
    @Override
    public void M_atacarE(ArrayList<BestiaMayor> BestiaMayor) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<BestiaMayor> Milicia = new ArrayList<>();
        Milicia = BestiaMayor;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (BestiaMayor t : Milicia) {
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
    public void M_defenderE(ArrayList<BestiaMayor> BestiaMayor) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<BestiaMayor> Milicia = new ArrayList<>();
        Milicia = BestiaMayor;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (BestiaMayor t : Milicia) {
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
    public ArrayList<BestiaMayor> M_entrenarE() {
        ArrayList<BestiaMayor> Milicia = new ArrayList<>();
        BestiaMayor bestia = new BestiaMayor();
        entrenado = true;
        Milicia.add(bestia);
        System.out.println("\n\t\tSe esta entrenando a su tribu, Rey...");
        return Milicia;
    }

    @Override
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //METODOS EDIFICACION.
    @Override
    public int E_generar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //METODOS VEHICULO.
    @Override
    public void V_construccion() {
        System.out.println("ESTOY CONSTRUYENDO");
    }

    @Override
    public String V_atacar() {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCB() {
        return null;
    }

     

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {
        
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
}
