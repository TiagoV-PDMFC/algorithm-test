import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass2 {

    private AlgorithmTest alt;

    @Before
    public void getAlgorithmTest(){
        this.alt = new AlgorithmTest();
    }

    @Test
    public void testFullTree(){
        Node n = TestTreeFactory.getTree(1);
        assertEquals(40, this.alt.calculateTree(n));
    }

    @Test
    public void testSecondNode(){
        Node n = TestTreeFactory.getTree(2);
        assertEquals(10, this.alt.calculateTree(n));
    }

    @Test
    public void testThirdNode(){
        Node n = TestTreeFactory.getTree(3);
        assertEquals(12, this.alt.calculateTree(n));
    }
}
