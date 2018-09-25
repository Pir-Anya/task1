import org.junit.Test;

import static org.junit.Assert.*;

public class IpAdressTest {

    @Test
    public void ip2Int() {
        String ip = "127.0.0.1";
        long expect = IpAdress.Ip2Int(ip);
        long actual = 2130706433;
        assertEquals(actual,expect);
    }

    @Test
    public void ipToStr() {
        long ip = 2130706433;
        String expect = IpAdress.ipToStr(ip);
        String actual = "127.0.0.1";
        assertEquals(actual,expect);
    }

    @Test
    public void validIP() {
        String ip = "127.0.0.500";
        boolean expect = IpAdress.validIP(ip);
        boolean actual = false;
        assertEquals(actual,expect);
    }
}