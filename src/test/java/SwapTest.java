import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class SwapTest {
    /**
     * checks that simple string swaps works as it suppose
     */
    @Test
    public void doSwapTest() {
        Swap swap = new Swap();
        List<String> list = new ArrayList<>();
        list.add("dc");
        list.add("ab");
        list.add("ad");
        list.add("da");
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "da", "ad", "ab", "dc");
        assertEquals(expectedList, swap.doSwap(list));
    }
    /**
     * checks ьуерщв цщкл with an empty list
     */
    @Test(expected = IllegalArgumentException.class)
    public void doSwapEmptyTest() {
        Swap swap = new Swap();
        List<String> list = new ArrayList<>();
        swap.doSwap(list);
    }

    /**
     * checks list without strings for swap
     */
    @Test
    public void noSwapTest() {
        Swap swap = new Swap();
        List<String> list = new ArrayList<>();
        list.add("ac");
        list.add("Bb");
        list.add("cd");
        list.add("da");
        assertEquals(list, swap.doSwap(list));
    }
    @Test
    public void nwapTest() {
        Swap swap = new Swap();
        List<String> list = new ArrayList<>();
        list.add("ac");
        list.add("ab");
        list.add("aE");
        list.add("aN");
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "ab", "ac", "aE", "aN");
        assertEquals(expectedList, swap.doSwap(list));
    }
}