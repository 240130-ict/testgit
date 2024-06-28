import day4.Day4Problems;
import org.example.Solution1;
import org.example.Solution2;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TT {
    @Test
    public void pTest() {
        String a= "abc";
        int sum = 1+2;

        assertThat(a, is("abc"));

        assertThat(sum, is(3));
        Solution1 sol = new Solution1();
        String s = sol.solution("He11oWor1d","lloWorl",2);
        String s2 = sol.solution("Program29b8UYP","merS123",	7);
        assertThat(s2, is("ProgrammerS123"));

        Day4Problems sol2 = new Day4Problems();
        int r = sol2.solution_181937(98,2);
        assertThat(r, is(1));

    }


}
