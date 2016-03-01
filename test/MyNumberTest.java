import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MyNumberTest {
    @Test
    public void testIsTwosSquareWillGiveTrueFor1() {
        MyNumber myNumber = new MyNumber(1L);
        assertTrue(myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor2() {
        MyNumber myNumber = new MyNumber(2L);
        assertTrue(myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor4() {
        MyNumber myNumber = new MyNumber(4L);
        assertTrue(myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor5() {
        MyNumber myNumber = new MyNumber(5L);
        assertTrue(!myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor256() {
        MyNumber myNumber = new MyNumber(256L);
        assertTrue(myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor89998766() {
        MyNumber myNumber = new MyNumber(89998766L);
        assertTrue(!myNumber.isTwosPower());
    }
    @Test
    public void testIsTwosSquareWillGiveTrueFor1152921504606847l() {
        MyNumber myNumber = new MyNumber(1152921504606847L);
        assertTrue(!myNumber.isTwosPower());
    }

}