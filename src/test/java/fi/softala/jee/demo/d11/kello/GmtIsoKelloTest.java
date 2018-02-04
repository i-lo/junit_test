package fi.softala.jee.demo.d11.kello;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GmtIsoKelloTest {
	
private GmtIsoKello kello;
	
	@Before
	public void createKello() {
		KelloLahde mockLahde = new MockKelloLahde();
		this.kello = new GmtIsoKello(mockLahde);
	}

	@Test
	public void testGetAika() {
		String actual  = this.kello.getAika();
		System.out.println(actual);
		String expected = "13:22:22"; //GMT 
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetPvm() {
		String actual  = this.kello.getPvm();
		String expected = "1970.01.02";
		assertEquals(expected, actual);
	}

}
