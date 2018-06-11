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
public class EsqueletoColosal implements Esqueleto{
    
    private int vida = 100;
    private String nombre = "Esqueleto Colosal";
    private int ataque = 75;
    private boolean entrenado = false;
    
    public EsqueletoColosal(){
        
    }
    public EsqueletoColosal(int vida, String nombre,int ataque){
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
        return 0;
    }

    @Override
    public ArrayList<Integer> E_recolectar(int a, ArrayList<Integer> Centro) {
        return null;
    }

    @Override
    public ArrayList<Integer> generarCE() {
        return null;
    }

    @Override
    public void mostrarCE(ArrayList<Integer> Centro) {
        
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
        ArrayList<EsqueletoColosal> Milicia = new ArrayList<>();
        EsqueletoColosal ecol = new EsqueletoColosal();
        entrenado = true;
        Milicia.add(ecol);
        System.out.println("\n\t\tSe esta entrenando a su horda, Rey...");
        return Milicia;
    }

    @Override
    public void M_atacarE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<EsqueletoColosal> Milicia = new ArrayList<>();
        Milicia = EsqueletoColosal;
        System.out.println("\n\t\tRey, estos son sus Especialistas: \n");
        for (EsqueletoColosal t : Milicia) {
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
    public void M_defenderE(ArrayList<EsqueletoColosal> EsqueletoColosal) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<EsqueletoColosal> Milicia = new ArrayList<>();
        Milicia = EsqueletoColosal;
        System.out.println("\n\t\tRey, estos son sus Especialistas: \n");
        for (EsqueletoColosal t : Milicia) {
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

    @Override
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
