package Demo;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Menu {
    private static Menu instance;
    
    private Menu(){
    }
    
    public static Menu getInstance(){
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    
    public void Opciones(){
        int op=5;
        int ops;
        Scanner text=new Scanner(System.in);
        while(op!=4){
            
            System.out.println("1. Crear recolectores.");
            System.out.println("2. Formar milicia.");
            System.out.println("3. Construir vehiculos de ataque.");
            System.out.println("4. Terminar turno.");
            System.out.print("Tu seleccion: ");
            op=text.nextInt();
            switch(op){
                case 1:
                    ops=5;
                    while(ops!=4){
                        System.out.println("1. Recolector de Oro.");
                        System.out.println("2. Recolector de Plata.");
                        System.out.println("3. Recolector de Diamante.");
                        System.out.println("4. Terminar turno.");
                        System.out.print("Tu seleccion: ");
                        ops=text.nextInt();
                        switch(ops){
                            case 1:
                                //RECOLECTOR
                                break;
                            case 2:
                                //RECOLECTOR
                                break;
                            case 3:
                                //RECOLECTOR
                                break;
                            default:
                                System.out.println("Ingrese opcion valida, por favor.");
                                break;
                        }
                    }
                    break;
                case 2:
                    ops=4;
                    while(ops!=3){
                        System.out.println("1. Obtener escuadron.");
                        System.out.println("2. Obtener Especialista.");
                        System.out.println("3. Terminar turno.");
                        System.out.print("Tu seleccion: ");
                        ops=text.nextInt();
                        switch(ops){
                            case 1:
                                //RECOLECTOR
                                break;
                            case 2:
                                //RECOLECTOR
                                break;
                            default:
                                System.out.println("Ingrese opcion valida, por favor.");
                                break;
                        }
                    }
                    break;
                case 3:
                    ops=4;
                    while(ops!=3){
                        System.out.println("1. Vehiculo pesado.");
                        System.out.println("2. Vehiculo ligero.");
                        System.out.println("3. Terminar turno.");
                        System.out.print("Tu seleccion: ");
                        ops=text.nextInt();
                        switch(ops){
                            case 1:
                                //RECOLECTOR
                                break;
                            case 2:
                                //RECOLECTOR
                                break;
                            default:
                                System.out.println("Ingrese opcion valida, por favor.");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Ingrese opcion valida, por favor.");
                    break;
            }
            
        }
    }
}
