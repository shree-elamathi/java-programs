import java.util.Scanner;

public class hello {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String name = scan.nextLine();
        float score = scan.nextInt();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("Name: "+name);
        System.out.println("score: "+score/10 +"/10");
        System.out.println("Department "+dept);
    }
}
