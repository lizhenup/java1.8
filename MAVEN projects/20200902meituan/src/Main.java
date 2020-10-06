/**
 * @author ：lizhen
 * @date ：Created in 2020/9/2 15:23
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int day = sc.nextInt();
            int num = sc.nextInt();
            if(day == 1) {
                System.out.println(num);
            }else {
                int start = 1;
                int end = num;
                int mid = 0;
                while(start <= end) {
                    mid = (start + end + 1) / 2;
                    int k = 0;
                    int tmp = mid;
                    for(int i = 0; i < day; i++) {
                        k += tmp;
                        tmp = (tmp + 1) / 2;
                    }
                    if(tmp == num) {
                        end = mid;
                        break;
                    }else if (tmp > num) {
                        end = mid - 1;
                    }else {
                        start = mid + 1;
                    }
                }
                System.out.println(end);
            }
        }
    }
}
