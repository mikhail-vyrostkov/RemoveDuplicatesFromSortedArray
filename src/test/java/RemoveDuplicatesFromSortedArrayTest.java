import junit.framework.TestCase;

public class RemoveDuplicatesFromSortedArrayTest extends TestCase {

    public void testProfit1(){
        int[] strs = {1,1,2};
        int actual = Main.Solution.removeDuplicates(strs);
        int expected = 2;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        int[] strs = {0,0,1,1,1,2,2,3,3,4};
        int actual = Main.Solution.removeDuplicates(strs);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
