import org.junit.Test;

import java.util.ArrayList;
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
        List<String> mockList = mock(List.class);
        when(mockList.toString()).thenReturn("[da, ad, ab, dc]");
        assertEquals(mockList.toString(), swap.doSwap(list).toString());
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
        assertEquals(list.toString(), swap.doSwap(list).toString());
    }
}