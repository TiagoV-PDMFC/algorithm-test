import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestClass3 {

    private AlgorithmTestSecond alt;

    @Before
    public void getAlgorithmTest(){
        this.alt = new AlgorithmTestSecond();
    }

    @Test
    public void testFullTreeEven(){
        Node n = TestTreeFactory.getTree(1);
        assertEquals(40, this.alt.calculateTree(n, true));
    }

    @Test
    public void testSecondNodeEven(){
        Node n = TestTreeFactory.getTree(2);
        assertEquals(10, this.alt.calculateTree(n, true));
    }

    @Test
    public void testThirdNodeEven(){
        Node n = TestTreeFactory.getTree(3);
        assertEquals(12, this.alt.calculateTree(n, true));
    }

    @Test
    public void testFullTreeOdd(){
        Node n = TestTreeFactory.getTree(1);
        assertEquals(28, this.alt.calculateTree(n, false));
    }

    @Test
    public void testSecondNodeOdd(){
        Node n = TestTreeFactory.getTree(2);
        assertEquals(18, this.alt.calculateTree(n, false));
    }

    @Test
    public void testThirdNodeOdd(){
        Node n = TestTreeFactory.getTree(3);
        assertEquals(21, this.alt.calculateTree(n, false));
    }
}
