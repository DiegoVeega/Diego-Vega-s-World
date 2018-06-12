/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface Humano {
    //METODOS MILICIA:
    ArrayList<Soldados> M_entrenar(ArrayList<Integer> Centro);
    void M_atacar(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro);
    void M_defender(ArrayList<Soldados> Soldado, ArrayList<Integer> Centro);
    
    ArrayList<Especialista> M_entrenarE(ArrayList<Integer> Centro);
    void M_atacarE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro);
    void M_defenderE(ArrayList<Especialista> Especialista, ArrayList<Integer> Centro);
    //METODOS EDIFICACION:
    int E_generar();
    ArrayList<Integer> E_recolectar(int a,ArrayList<Integer> Centro);
    //METODOS VEHICULO:
    ArrayList<VLigero_H> V_construccion(ArrayList<Integer> Centro);
    void V_atacar(ArrayList<VLigero_H> VLigero_H, ArrayList<Integer> Centro);
    
    ArrayList<VPesado_H> V_construccionP(ArrayList<Integer> Centro);
    void V_atacarP(ArrayList<VPesado_H> VPesado_H, ArrayList<Integer> Centro);
    //CENTRO DE MANDO
    ArrayList<Integer> generarCH();
    ArrayList<Integer> mejorarCH(int num,ArrayList<Integer> Centro);
    void mostrarCH(ArrayList<Integer> Centro);
}
