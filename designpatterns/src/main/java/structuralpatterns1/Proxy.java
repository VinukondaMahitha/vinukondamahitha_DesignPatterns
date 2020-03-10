package structuralpatterns1;
	public class Proxy implements Media {

		 private Media1 mediaFileImpl;
		   private String fileName;

		   public Proxy(String fileName){
		      this.fileName = fileName;
		   }

		   public String printName() {
		      if(mediaFileImpl == null){
		         mediaFileImpl = new Media1(fileName);
		      }
		      return mediaFileImpl.printName();
		   }
		}