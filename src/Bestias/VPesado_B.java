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
public class VPesado_B implements Bestia{
    
    private int vida = 150;
    private String nombre = "Tanque bestial";
    private int ataque = 100;
    private boolean construido = false;
    
    public VPesado_B(){
        
    }
    public VPesado_B(int vida, String nombre,int ataque){
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
    public ArrayList<Integer> generarCB() {
        return null;
    }

    @Override
    public void mostrarCB(ArrayList<Integer> Centro) {
        
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
    public ArrayList<Integer> mejorarCB(int num, ArrayList<Integer> Centro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<VPesado_B> V_construccionP(ArrayList<Integer> Centro) {
        
        Centro.set(2,Centro.get(2)-100);
        Centro.set(1,Centro.get(1)-100);
        
        ArrayList<VPesado_B> Vehiculo=new ArrayList<>();
        VPesado_B pesado =new VPesado_B();
        construido=true;
        Vehiculo.add(pesado);
        System.out.println("\n\t\tSe esta construyendo su vehiculo, Rey...");
        return Vehiculo;
    }

    @Override
    public void V_atacarP(ArrayList<VPesado_B> VPesado_B, ArrayList<Integer> Centro,ArrayList<Integer> Centros) {
        Scanner text=new Scanner(System.in);
        int op;
        ArrayList<VPesado_B> Vehiculo = new ArrayList<>();
        Vehiculo = VPesado_B;
        System.out.println("\n\t\tRey, estos son sus Vehiculos ligeros: \n");
        for (VPesado_B t : Vehiculo) {
            for (int i = 0; i < Vehiculo.size(); i++) {
                System.out.println("\t\t" + i + 1 + "Es una " + t.getNombre() + " con " + t.getVida() + " de vida y tiene " + t.getAtaque() + " de ataque.\n");
            }
        }
        System.out.print("\t\tQue vehiculo desea enviar? ");
        op=text.nextInt();
        System.out.println("Se enviara a: "+Vehiculo.get(op-1));
        Centros.set(6, Centros.get(6)-ataque);
        Vehiculo.remove(op-1);
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
    
}
