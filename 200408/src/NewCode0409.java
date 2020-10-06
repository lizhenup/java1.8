import java.text.DecimalFormat;
import java.util.*;

public class NewCode0409 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String old = sc.nextLine();
            String now = sc.nextLine();
            HashSet<Character> set = new HashSet<Character>();
            for(int i = 0; i < now.length(); i++) {
                set.add(now.toUpperCase().charAt(i));

            }
            HashSet<Character> ret = new HashSet<Character>();
            for(int i = 0; i < old.length(); i++) {
                if(!ret.contains(old.toUpperCase().charAt(i)) && !set.contains(old.toUpperCase().charAt(i))) {
                    ret.add(old.toUpperCase().charAt(i));
                    System.out.print(old.toUpperCase().charAt(i));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double x0 = sc.nextInt();
            double y0 = sc.nextInt();
            double z0 = sc.nextInt();
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double z1 = sc.nextInt();
            sc.nextLine();
            double R = Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2)+Math.pow(z0-z1,2));
            double V = 4/3.0*Math.acos(-1)*Math.pow(R,3);
            DecimalFormat format = new DecimalFormat("0.000");
            System.out.println(format.format(R)+" "+format.format(V));
        }
    }
}
