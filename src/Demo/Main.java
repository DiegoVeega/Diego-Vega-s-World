package Demo;

import java.util.Scanner;

/**
 *
 * @author Diego Vega <00148816@uca.edu.sv>
 */
public class Main {
    public static void main(String[] args){
        String Rey1,Rey2;
        int turno=1;
        int JUGADOR; //ESTA VARIABLE SERVIRA DE CONTROLADOR DEL JUGADOR QUE JUGO EL ULTIMO TURNO.
        Scanner texto=new Scanner(System.in);
        System.out.println("\t\t:'########::'####:'########::'######::::'#######:::::'##::::'##:'########::'######::::::'###::::'####::'######::\n" +
                           "\t\t::##.... ##:. ##:: ##.....::'##... ##::'##.... ##:::: ##:::: ##: ##.....::'##... ##::::'## ##::: ####:'##... ##:\n" +
                           "\t\t::##:::: ##:: ##:: ##::::::: ##:::..::: ##:::: ##:::: ##:::: ##: ##::::::: ##:::..::::'##:. ##::. ##:: ##:::..::\n" +
                           "\t\t::##:::: ##:: ##:: ######::: ##::'####: ##:::: ##:::: ##:::: ##: ######::: ##::'####:'##:::. ##:'##:::. ######::\n" +
                           "\t\t::##:::: ##:: ##:: ##...:::: ##::: ##:: ##:::: ##::::. ##:: ##:: ##...:::: ##::: ##:: #########:..:::::..... ##:\n" +
                           "\t\t::##:::: ##:: ##:: ##::::::: ##::: ##:: ##:::: ##:::::. ## ##::: ##::::::: ##::: ##:: ##.... ##:::::::'##::: ##:\n" +
                           "\t\t::########::'####: ########:. ######:::. #######:::::::. ###:::: ########:. ######::: ##:::: ##:::::::. ######::\n" +
                           "\t\t........:::....::........:::......:::::.......:::::::::...:::::........:::......::::..:::::..:::::::::......::::\n" +
                           "\t\t::::::::::::::::::::::::::'##:::::'##::'#######::'########::'##:::::::'########:::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::: ##:'##: ##:'##.... ##: ##.... ##: ##::::::: ##.... ##::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::: ##: ##: ##: ##:::: ##: ##:::: ##: ##::::::: ##:::: ##::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::: ##: ##: ##: ##:::: ##: ########:: ##::::::: ##:::: ##::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::: ##: ##: ##: ##:::: ##: ##.. ##::: ##::::::: ##:::: ##::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::: ##: ##: ##: ##:::: ##: ##::. ##:: ##::::::: ##:::: ##::::::::::::::::::::::::::::::::\n" +
                           "\t\t::::::::::::::::::::::::::. ###. ###::. #######:: ##:::. ##: ########: ########:::::::::::::::::::::::::::::::::\n" +
                           "\t\t:::::::::::::::::::::::::::...::...::::.......:::..:::::..::........::........::::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.print("\n\t\tBienvenidos reyes.\n\n\t\tPrimer Rey ingrese su nombre: ");
        Rey1=texto.nextLine();
        System.out.print("\t\tSegundo Rey ingrese su nombre: ");
        Rey2=texto.nextLine();
        int RUN=1;
        
        System.out.print("\n\t\tRey "+Rey1+" es su turno.");
        do{
            //OPCIONES
            if(turno==1){
                JUGADOR=1;
                System.out.print("\n\t\tRey "+Rey1+" es su turno.");
                RUN=texto.nextInt();
                turno=2;
            }
            else{
                JUGADOR=2;
                System.out.print("\n\t\tRey "+Rey2+" es su turno.");
                RUN=texto.nextInt();
                turno=1;
            }
        }while(RUN!=0);
        //AGREGAR VARIABLE "JUGADOR" Y HACER QUE DEFINA QUIEN HA GANADO LA PARTIDA.
        if(JUGADOR==1){
            System.out.println("\n");
            System.out.println("\t\t:::::::::::::::::::'##::::'##:'####::'######::'########::'#######::'########::'####::::'###:::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:. ##::'##... ##:... ##..::'##.... ##: ##.... ##:. ##::::'## ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:: ##:: ##:::..::::: ##:::: ##:::: ##: ##:::: ##:: ##:::'##:. ##:::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:: ##:: ##:::::::::: ##:::: ##:::: ##: ########::: ##::'##:::. ##::::::::::::::::::\n" +
                               "\t\t:::::::::::::::::::. ##:: ##::: ##:: ##:::::::::: ##:::: ##:::: ##: ##.. ##:::: ##:: #########::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::::. ## ##:::: ##:: ##::: ##:::: ##:::: ##:::: ##: ##::. ##::: ##:: ##.... ##::::::::::::::::::\n" +
                               "\t\t:::::::::::::::::::::. ###::::'####:. ######::::: ##::::. #######:: ##:::. ##:'####: ##:::: ##::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::::::...:::::....:::......::::::..::::::.......:::..:::::..::....::..:::::..:::::::::::::::::::\n" +
                               "\t\t::::::::::::::::'####:'##::: ##:'##::::'##:'####:'##::: ##:'########:'##::: ##:'########:'########::::::::::::::\n" +
                               "\t\t::::::::::::::::. ##:: ###:: ##: ###::'###:. ##:: ###:: ##: ##.....:: ###:: ##:... ##..:: ##.....:::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ####: ##: ####'####:: ##:: ####: ##: ##::::::: ####: ##:::: ##:::: ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ## ## ##: ## ### ##:: ##:: ## ## ##: ######::: ## ## ##:::: ##:::: ######::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ##. ####: ##. #: ##:: ##:: ##. ####: ##...:::: ##. ####:::: ##:::: ##...:::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ##:. ###: ##:.:: ##:: ##:: ##:. ###: ##::::::: ##:. ###:::: ##:::: ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::'####: ##::. ##: ##:::: ##:'####: ##::. ##: ########: ##::. ##:::: ##:::: ########::::::::::::::\n" +
                               "\t\t::::::::::::::::....::..::::..::..:::::..::....::..::::..::........::..::::..:::::..:::::........:::::::::::::::");
            System.out.println("\n\t\tEl Rey "+Rey1+" conquisto todo el territorio.");
        }
        else{
            System.out.println("\n");
            System.out.println("\t\t:::::::::::::::::::'##::::'##:'####::'######::'########::'#######::'########::'####::::'###:::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:. ##::'##... ##:... ##..::'##.... ##: ##.... ##:. ##::::'## ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:: ##:: ##:::..::::: ##:::: ##:::: ##: ##:::: ##:: ##:::'##:. ##:::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::: ##:::: ##:: ##:: ##:::::::::: ##:::: ##:::: ##: ########::: ##::'##:::. ##::::::::::::::::::\n" +
                               "\t\t:::::::::::::::::::. ##:: ##::: ##:: ##:::::::::: ##:::: ##:::: ##: ##.. ##:::: ##:: #########::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::::. ## ##:::: ##:: ##::: ##:::: ##:::: ##:::: ##: ##::. ##::: ##:: ##.... ##::::::::::::::::::\n" +
                               "\t\t:::::::::::::::::::::. ###::::'####:. ######::::: ##::::. #######:: ##:::. ##:'####: ##:::: ##::::::::::::::::::\n" +
                               "\t\t::::::::::::::::::::::...:::::....:::......::::::..::::::.......:::..:::::..::....::..:::::..:::::::::::::::::::\n" +
                               "\t\t::::::::::::::::'####:'##::: ##:'##::::'##:'####:'##::: ##:'########:'##::: ##:'########:'########::::::::::::::\n" +
                               "\t\t::::::::::::::::. ##:: ###:: ##: ###::'###:. ##:: ###:: ##: ##.....:: ###:: ##:... ##..:: ##.....:::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ####: ##: ####'####:: ##:: ####: ##: ##::::::: ####: ##:::: ##:::: ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ## ## ##: ## ### ##:: ##:: ## ## ##: ######::: ## ## ##:::: ##:::: ######::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ##. ####: ##. #: ##:: ##:: ##. ####: ##...:::: ##. ####:::: ##:::: ##...:::::::::::::::::\n" +
                               "\t\t::::::::::::::::: ##:: ##:. ###: ##:.:: ##:: ##:: ##:. ###: ##::::::: ##:. ###:::: ##:::: ##::::::::::::::::::::\n" +
                               "\t\t::::::::::::::::'####: ##::. ##: ##:::: ##:'####: ##::. ##: ########: ##::. ##:::: ##:::: ########::::::::::::::\n" +
                               "\t\t::::::::::::::::....::..::::..::..:::::..::....::..::::..::........::..::::..:::::..:::::........:::::::::::::::");
            System.out.println("\n\t\tEl Rey "+Rey2+" conquisto todo el territorio.");
        }
    }
}
