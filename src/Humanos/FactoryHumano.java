package Humanos;

import Bestias.Bestia;
import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FactoryHumano implements AbstractFactory{

    @Override
    public Bestia getBestia(int tipo) {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto(int tipo) {
        return null;
    }

    @Override
    public Humano getHumano(int tipo) {
        int tecla;
        int ops;
        Scanner leer=new Scanner(System.in);
        switch(tipo){
            case 1:
                ops=5;
                while(ops!=4){
                System.out.println("\n\t\tQue tipo de recolector desea? ");
                System.out.println("\n\t\t1. Recolector de Madera.");
                System.out.println("\n\t\t2. Recolector de Piedra.");
                System.out.println("\n\t\t3. Recolector de Hierro.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Recolector_Madera();
                    case 2:
                        return new Recolector_Piedra();
                    case 3:
                        return new Recolector_Hierro();
                    case 4:
                        System.out.println("\n\t\tTermino accion en: Recolectores.");
                        break;
                    default:
                        System.out.println("Ingrese opcion valida, por favor.");
                        break;
                }
                }
                break;
            case 2:
                System.out.println("\n\t\tA que miembro de milicia desea? ");
                System.out.println("\n\t\t1. Soldados.");
                System.out.println("\n\t\t2. Especialista.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Soldados();
                    case 2:
                        return new Especialista();
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
                        return new VLigero_H();
                    case 2:
                        return new VPesado_H();
                }
                break;
        }
        return null;
    }
}
