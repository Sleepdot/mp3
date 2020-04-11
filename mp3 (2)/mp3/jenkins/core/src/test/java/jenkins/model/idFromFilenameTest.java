package jenkins.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class idFromFilenameTest {

	@Test
	public void idFromFilenameTestcase1() {
		IdStrategy.CaseSensitive ic = new IdStrategy.CaseSensitive();
        String filename = "$0061bcd"; 
        String returnedFilename = ic.idFromFilename(filename);
        assertEquals(returnedFilename, "abcd");
	}
	
	@Test
	public void idFromFilenameTestcase2() {
		IdStrategy.CaseSensitive ic = new IdStrategy.CaseSensitive();
        String filename = "a1_-$"; 
        String returnedFilename = ic.idFromFilename(filename);
        assertEquals(returnedFilename, "a1_-");
	}
	
	@Test
	public void idFromFilenameTestcase3() {
		IdStrategy.CaseSensitive ic = new IdStrategy.CaseSensitive();
        String filename = "$0041$0062$0030$003D"; 
        String returnedFilename = ic.idFromFilename(filename);
        assertEquals(returnedFilename, "Ab0=");
	}

}
