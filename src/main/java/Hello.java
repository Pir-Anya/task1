import java.util.Scanner;

public class Hello {

    public static void main(String[] args){

        Scanner input = null;
        String ip1 = null;
        while (IpAdress.validIP(ip1) == false) {
            System.out.println("Введите первый ip адрес:");
            input = new Scanner(System.in);
            ip1 = input.nextLine();
        }

        String ip2 = null;
        while (IpAdress.validIP(ip2) == false) {
            System.out.println("Введите второй ip адрес:");
            input = new Scanner(System.in);
            ip2 = input.nextLine();
        }

        Long ipa1 = IpAdress.Ip2Int(ip1);
        Long ipa2 = IpAdress.Ip2Int(ip2);
        Long int_ip1 = Math.min(ipa1,ipa2);
        Long int_ip2 = Math.max(ipa1,ipa2);


        System.out.println("Выводим диапазон адресов:");
        if ((int_ip2-int_ip1)<=1) System.out.println("диапазон пуст");
        for (Long i = int_ip1+1; i<int_ip2; i++){
            System.out.println(IpAdress.ipToStr(i));
        }

    }

}
