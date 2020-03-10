package structuralpattern2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BridgePatternTest {

	@Test
	public void test() {
		BridgePattern B=new BridgePattern();
		assertEquals("Drawing Circle[ color: red, radius: 10, x: 100, 100]",B.test1());
	}
	@Test
	public void test1() {
		BridgePattern B1=new BridgePattern();
		assertEquals("Drawing Circle[ color: green, radius: 10, x: 100, 100]",B1.test2());
	}

}