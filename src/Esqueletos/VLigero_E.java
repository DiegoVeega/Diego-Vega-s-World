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
public class VLigero_E implements Esqueleto{
    
    private int vida = 50;
    private String nombre = "bici de huesos";
    private int ataque = 25;
    private boolean construido = false;
    
    public VLigero_E(){
        
    }
    
    public VLigero_E(int vida, String nombre,int ataque){
        this.vida=vida;
        this.nombre=nombre;
        this.ataque=ataque;
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

    public boolean isConstruido() {
        return construido;
    }

    public void setConstruido(boolean construido) {
        this.construido = construido;
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
        ArrayList<VLigero_E> Vehiculo=new ArrayList<>();
        VLigero_E ligero =new VLigero_E();
        construido=true;
        Vehiculo.add(ligero);
        System.out.println("\n\t\tSe esta construyendo su vehiculo, Rey...");
        return Vehiculo;
    }

    @Override
    public void V_atacar(ArrayList<VLigero_E> VLigero_E) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<VLigero_E> Vehiculo = new ArrayList<>();
        Vehiculo = VLigero_E;
        System.out.println("\n\t\tRey, estos son sus Vehiculos ligeros: \n");
        for (VLigero_E t : Vehiculo) {
            for (int i = 0; i < Vehiculo.size(); i++) {
                System.out.println("\t\t" + i + 1 + "Es una " + t.getNombre() + " con " + t.getVida() + " de vida y tiene " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tQue vehiculo desea enviar? ");
        op=text.nextInt();
        System.out.println("Se enviara a: "+Vehiculo.get(op-1));
        Vehiculo.remove(op-1);
    }

    @Override
    public ArrayList<VPesado_E> V_construccionP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_E> VPesado_E) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Integer> mejorarCE(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
