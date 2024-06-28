package day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Day4ProblemsTest {
    @Test
    void solution_181937() {
        Day4Problems d4 = new Day4Problems();
        int r = d4.solution_181937(98,2);
        assertEquals(1,r);
        assertThat(r,is(1));

    }
    @Test
    void solution_181925() {
        Day4Problems d4 = new Day4Problems();
        int[] i = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String r = d4.solution_181925(i);
        assertEquals("wsdawsdassw",r);
        assertThat(r,is("wsdawsdassw"));

    }

    @Test
    void solution_181924() {
        Day4Problems d4 = new Day4Problems();
        int[] a = {0,1,2,3,4};
        int[][] q = {{0, 3},{1, 2},{1, 4}};
        int[] b = {3, 4, 1, 0, 2};
        int[] r = d4.solution_181924(a,q);

    }

    @Test
    void solution_181923() {
        Day4Problems d4 = new Day4Problems();
        int[] a = {0,1,2,4,3};
        int[][] q = {{0,4,2},{0,3,2},{0,2,2}};
        int[] r = d4.solution_181923(a,q);

        int[] e = {3,4,1};
        assertEquals(e,r);
        assertThat(r,is(e));
    }
}