import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometricSumTests {

    private double mygs(int n) {
        double ans = 0.0;
        for (int i=1; i <= n; ++i) {
            ans += 1.0/Math.pow(2, i);
        }
        return ans;
    }

    @Test
    public void testHarmonicSum() {
        for (int i=1; i < 1000; ++i) {
            assertEquals("Value for " + i, mygs(i), Methods.geometricSum(i), .01);
        }
    }
}
