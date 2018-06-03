package Demo;

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
    
    
}
