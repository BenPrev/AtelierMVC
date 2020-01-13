import ateliermvc.model.Model;
import org.junit.Assert;
import org.junit.Test;

public class testModel {
    @Test
    public void testGetMessage() {
        Model model=new Model();
        String m=model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello World !");
    }
}
