package Esqueletos;

import Bestias.Bestia;
import Factorys.AbstractFactory;
import Humanos.Humano;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FactoryEsqueleto implements AbstractFactory{

    @Override
    public Bestia getBestia(int tipo) {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto(int tipo) {
        int tecla;
        Scanner leer=new Scanner(System.in);
        switch(tipo){
            case 1:
                System.out.println("\n\t\tQue tipo de recolector desea? ");
                System.out.println("\n\t\t1. Recolector de Plata.");
                System.out.println("\n\t\t2. Recolector de Oro.");
                System.out.println("\n\t\t3. Recolector de Diamante.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Recolector_Plata_E();
                    case 2:
                        return new Recolector_Oro_E();
                    case 3:
                        return new Recolector_Diamante_E();
                }
                break;
            case 2:
                System.out.println("\n\t\tA que miembro de milicia desea? ");
                System.out.println("\n\t\t1. horda Esqueletica.");
                System.out.println("\n\t\t2. Esqueleto Colosal.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Horda();
                    case 2:
                        return new EsqueletoColosal();
                }
                break;
            case 3:
                System.out.println("\n\t\tQue tipo de Vehiculo desea? ");
                System.out.println("\n\t\t1. Vehiculo ligero.");
                System.out.println("\n\t\t2. Vehiculo Pesado.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new VLigero_E();
                    case 2:
                        return new VPesado_E();
                }
                break;
        }
        return null;
    }

    @Override
    public Humano getHumano(int tipo) {
        return null;
    }
    
}
