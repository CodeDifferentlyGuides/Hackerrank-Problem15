import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest(){
        String input = "{}()
                        ({()})
                        {}(
                        []";
                        
        String expected = "true
                           true
                           false
                           true";
        
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
