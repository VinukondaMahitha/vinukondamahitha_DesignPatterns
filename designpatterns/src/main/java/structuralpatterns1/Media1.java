package structuralpatterns1;
public class Media1 implements Media {
    private String fileName;
    private String s="";

    public Media1(String fileName){
       this.fileName = fileName;
       s=loadFromDisk(fileName);
    }
    public  String printName() {
       return s+"Displaying " + fileName;
    }

    private String loadFromDisk(String fileName){
       return "Loading " + fileName;
    }
}