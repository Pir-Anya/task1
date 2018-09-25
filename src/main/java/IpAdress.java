import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class IpAdress
{
    private static final Integer m0 = 256*256*256;
    private static final Integer m1 = 256*256;
    private static final Integer m2 = 256;

    static public long Ip2Int( String ia )
    {
        String iab[] = ia.split("\\.");
        int i0 = Integer.parseInt(iab[0]); if (i0<0) i0+=256;
        int i1 = Integer.parseInt(iab[1]); if (i1<0) i1+=256;
        int i2 = Integer.parseInt(iab[2]); if (i2<0) i2+=256;
        int i3 = Integer.parseInt(iab[3]); if (i3<0) i3+=256;
        return (m0*i0)+(m1*i1)+(m2*i2)+i3;
    }

    static public String ipToStr( long ip )
    {
        long a = ip;
        long r0 = a / m0;
        a -= (r0*m0);
        long r1 = a / m1;
        a -= (r1*m1);
        long r2 = a / m2;
        a -= (r2*m2);
        long r3 = a;

        String ips = r0+"."+r1+"."+r2+"."+r3;
        return ips;
    }

    //Проверка на Ip адреса на валидность
    public static boolean validIP(String ip) {
        if (ip == null) return false;
        ip = ip.trim();
        if ((ip.length() < 6) & (ip.length() > 15)) return false;

        try {
            Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(ip);
            return matcher.matches();
        } catch (PatternSyntaxException ex) {
            return false;
        }
    }


}
