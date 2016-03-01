import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KeyTest {
    @Test
    public void testIsKeyGiveTrueIfGiveIsFound()  {
        Key<String> key = new Key<>("hello");
        assertTrue(key.isKey("hello"));
    }
    @Test
    public void testGetCollisionGiveFalseInitiallyForEachKey()  {
        Key<String> key = new Key<>("hello");
        assertTrue(!key.getCollision());
    }
    @Test
    public void testGetProbedIndexGiveMinus23IfKeyDoeNotGetCollied()  {
        Key<String> key = new Key<>("hello");
        assertEquals(-23,key.getProbedIndex());
    }
    @Test
    public void testSetProbedIndexSetTheProbedIndexAndCollisionFieldOfKey()  {
        Key<String> key = new Key<>("hello");
        key.setProbedIndex(2);
        assertEquals(2,key.getProbedIndex());
        assertTrue(key.getCollision());
    }
}