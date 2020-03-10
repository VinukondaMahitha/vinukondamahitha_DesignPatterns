package creationalpatterns;
public class Singleton {
    
    private static Singleton instance = new Singleton();
   
    public Singleton() {}
    
    public static Singleton getInstance() {
        return instance;
    }
    
    public String showMessage() {
        return "I'm a singleton object!" ;   
    }
}
