/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Especialista implements Humano{
    
    private int vida = 200;
    private String nombre = "Bestia Mayor";
    private int ataque = 100;
    private boolean entrenado = false;
    
    public Especialista(){
        
    }
    
    public Especialista(int vida, String nombre,int ataque){
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
    public void mostrarCH(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> generarCH() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> mejorarCH(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Soldados> M_entrenar(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacar(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Especialista> M_entrenarE(ArrayList<Integer> Centro) {
        Centro.set(0,Centro.get(0)-600);
        Centro.set(1,Centro.get(1)-600);
        
        ArrayList<Especialista> Milicia = new ArrayList<>();
        Especialista especial = new Especialista();
        entrenado = true;
        Milicia.add(especial);
        System.out.println("\n\t\tSe esta entrenando a su tribu, Rey...");
        return Milicia;
    }

    @Override
    public void M_atacarE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        Centro.set(1,Centro.get(1)-300);
        Centro.set(2,Centro.get(2)-300);
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Especialista> Milicia = new ArrayList<>();
        Milicia = Especialista;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (Especialista t : Milicia) {
            for (int i = 0; i < Milicia.size(); i++) {
                System.out.println("\t\t" + i + 1 + "Somos " + t.getNombre() + " con " + t.getVida() + " de vida y tengo " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tA quien desea enviar? ");
        op=text.nextInt();
        System.out.println("Se enviara a: "+Milicia.get(op-1));
        Centros.set(6, Centros.get(6)-ataque);
        Milicia.remove(op-1);
    }

    @Override
    public void M_defenderE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro) {
        Centro.set(0,Centro.get(0)-200);
        Centro.set(2,Centro.get(2)-200);
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Especialista> Milicia = new ArrayList<>();
        Milicia = Especialista;
        System.out.println("\n\t\tRey, estos son sus tribus: \n");
        for (Especialista t : Milicia) {
            for (int i = 0; i < Milicia.size(); i++) {
                System.out.println("\t\t" + i + 1 + "Somos " + t.getNombre() + " con " + t.getVida() + " de vida y tengo " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tA quien desea enviar? ");
        op=text.nextInt();
        System.out.println("Se enviara a: "+Milicia.get(op-1));
        Milicia.remove(op-1);
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
