package creationalpatterns;
public class Main {
    public  String main()
    {
        Singleton singletonClass = Singleton.getInstance();
        return singletonClass.showMessage();
    }
}