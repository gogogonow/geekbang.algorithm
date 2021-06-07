package week8;

/**
 * @author 61404
 */
public class Numberof1Bits191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if (((n>>i) & 1) == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
