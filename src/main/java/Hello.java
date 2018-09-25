import java.util.Scanner;

public class Hello {
    public static String hello(){
        return "hello";
    }

    public static void main(String[] args){
        System.out.println("Введите первый ip адрес:");
        Scanner input = new Scanner(System.in);
        String ip1 = input.nextLine();

        System.out.println("Введите второй ip адрес:");
        String ip2 = input.nextLine();


        System.out.println(ip1);
        System.out.println(ip2);
    }
        /*BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
        String numa = reader.readLine();
        int num1 = Integer.parseInt(numa);
        String numb = reader.readLine();
        int num2 = Integer.parseInt(numb);
        */

}
