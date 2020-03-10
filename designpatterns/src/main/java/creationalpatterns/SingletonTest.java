package creationalpatterns;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testShowMessage() 
	{
		Main m=new Main();
		assertEquals("I'm a singleton object!",m.main());
		Singleton s=new Singleton();
		assertEquals("I'm a singleton object!",s.showMessage());
	}

}
