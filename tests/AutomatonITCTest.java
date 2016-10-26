import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ianldgs on 26/10/16.
 */
public class AutomatonITCTest {

    AutomatonITC a = new AutomatonITC();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void testValidStrings() {
        assertTrue(a.recognize("1010"));
    }

    @Test
    public void testInvalidStrings() {
        assertFalse(a.recognize("1100"));
    }
}