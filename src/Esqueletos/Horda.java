/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esqueletos;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class Horda implements Esqueleto{
    private int vida = 50;
    private String nombre = "Horda";
    private int ataque = 50;
    private boolean entrenado = false;
    
    public Horda(){
        
    }
    public Horda(int vida, String nombre,int ataque){
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
    public ArrayList<Integer> generarCE() {
        return null;
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        
    }

    @Override
    public ArrayList<Horda> M_entrenar(ArrayList<Integer> Centro) {
        
        Centro.set(0,Centro.get(0)-400);//plata
        Centro.set(1,Centro.get(1)-400);//oro
        
        ArrayList<Horda> Milicia = new ArrayList<>();
        Horda horda = new Horda();
        entrenado = true;
        Milicia.add(horda);
        System.out.println("\n\t\tSe esta entrenando a su horda, Rey...");
        return Milicia;
    }

    @Override
    public void M_atacar(ArrayList<Horda> Horda,ArrayList<Integer> Centro) {
        
        Centro.set(1,Centro.get(1)-200);//oro
        Centro.set(2,Centro.get(2)-200);//diamante
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Horda> Milicia = new ArrayList<>();
        Milicia = Horda;
        System.out.println("\n\t\tRey, estos son sus hordas: \n");
        for (Horda t : Milicia) {
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
    public void M_defender(ArrayList<Horda> Horda,ArrayList<Integer> Centro) {
        
        Centro.set(0,Centro.get(0)-100);//plata
        Centro.set(2,Centro.get(2)-100);//diamante
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<Horda> Milicia = new ArrayList<>();
        Milicia = Horda;
        System.out.println("\n\t\tRey, estos son sus hordas: \n");
        for (Horda t : Milicia) {
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
    public ArrayList<EsqueletoColosal> M_entrenarE(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal,ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal, ArrayList<Integer> Centro) {
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
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
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
