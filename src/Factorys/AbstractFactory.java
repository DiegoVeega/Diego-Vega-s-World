/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Bestias.Bestia;
import Esqueletos.Esqueleto;
import Humanos.Humano;

/**
import Edificacion_Milicia.Milicia;
import Edificacion_Recolectora.Recursos;
import Edificacion_Vehiculo.Vehiculo;
*/
/**
 *
 * @author diego
 */
public interface AbstractFactory {
    /**
    //Recolectores
    Recursos getgenerar();
    Recursos getrecolectar();
    //Milicia
    Milicia gettacar();
    Milicia getdefender();
    //Vehiculos
    Vehiculo getconstruir();
    Vehiculo getatacar();
    */
    //BESTIA.
    Bestia getBestia();
    //ESQUELETO
    Esqueleto getEsqueleto();
    //HUMANO
    Humano getHumano();
}
