import org.junit.*;

public class SumTest {
    @Test
    public void testSum()
    {
        Sum s = new Sum();
         int d = s.sum(10,20);
         Assert.assertEquals(30, d);
    }

    @Test
    public void testSumNegative()
    {
        Sum s = new Sum();
        int d = s.sum(10,20);
        Assert.assertNotEquals(40, d);
    }
    @Test
    public void testSumFailure()
    {
        Sum s = new Sum();
        int d = s.sum(10,20);
        Assert.assertNotEquals(30, d);
    }
}
