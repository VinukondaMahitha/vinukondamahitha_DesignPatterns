package structuralpatterns1;
public class Main {
    public String main() {
      Media mediaFile = new Proxy("movie.mp4");

      return mediaFile.printName();  
      //mediaFile.printName();   
    }
}