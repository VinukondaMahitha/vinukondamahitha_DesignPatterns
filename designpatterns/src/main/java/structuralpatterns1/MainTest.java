package structuralpatterns1;
import static org.junit.Assert.*;

import org.junit.Test; 
public class MainTest {

  @Test
  public void test() {
    Main m=new Main();
    assertEquals("Loading movie.mp4Displaying movie.mp4",m.main());
  }

}
