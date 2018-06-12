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
public class VLigero_H implements Humano{

    private int vida = 50;
    private String nombre = "Moto";
    private int ataque = 25;
    private boolean construido = false;
    
    public VLigero_H(){
        
    }
    public VLigero_H(int vida, String nombre,int ataque){
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
    public void mostrarCH(ArrayList<Integer> Centro) {
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
    public void M_atacar(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defender(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Especialista> M_entrenarE(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_atacarE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void M_defenderE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VLigero_H> V_construccion(ArrayList<Integer> Centro) {
        
        Centro.set(2,Centro.get(2)-50);
        Centro.set(0,Centro.get(0)-50);
        
        ArrayList<VLigero_H> Vehiculo=new ArrayList<>();
        VLigero_H ligero =new VLigero_H();
        construido=true;
        Vehiculo.add(ligero);
        System.out.println("\n\t\tSe esta construyendo su vehiculo, Rey...");
        return Vehiculo;
    }

    @Override
    public void V_atacar(ArrayList<VLigero_H> VLigero_H, ArrayList<Integer> Centro) {
        
        Centro.set(2,Centro.get(2)-100);
        Centro.set(1,Centro.get(1)-100);
        
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<VLigero_H> Vehiculo = new ArrayList<>();
        Vehiculo = VLigero_H;
        System.out.println("\n\t\tRey, estos son sus Vehiculos ligeros: \n");
        for (VLigero_H t : Vehiculo) {
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
    public ArrayList<VPesado_H> V_construccionP(ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_H> VPesado_H, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
