import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] arr = {0,1,4,11,12,21,22,29};
        //System.out.println(work(8,arr));

    }
    /*public  int work (int n, int[] a) {
        // write code here
        int count = n;
        for(int i = 1; i < n; i++) {
            int len = a[i] - a[i - 1];
            if(len == 1 || isPrime(len)) {

            }else if(isPrime(len - 1)) {
                count++;
            }else {
                int[] cou = new int[1];
                findCount(len,cou);
                count += cou[0];
            }
        }
        return count;
    }

    private  void findCount(int len, int[] cou) {
        ArrayList<Integer> primes = findPrimes(len);
        int max = Integer.MIN_VALUE;
        for (int p : primes) {
            max = max > p ? max : p;
            if(isPrime(len - p)) {
                cou[0]++;
                return;
            }
        }
        cou[0]++;
        findCount(len - max,cou);
    }

    private  ArrayList<Integer> findPrimes(int tmp) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= tmp; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private  boolean isPrime(int i) {
        if(i == 2 || i == 3) {
            return true;
        }else {
            int cur = (int)Math.sqrt(i);
            for (int j = 2; j <= cur; j++) {
                if(i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }*/
    public  int work (int n, int[] a) {
        // write code here
        int count = n;
        for(int i = 1; i < n; i++) {
            int len = a[i] - a[i - 1];
            if(len == 1 || isPrime(len)) {

            }else if(len % 2 == 0 || isPrime(len - 2)) {
                count ++;
            }else {
                count += 2;
            }
        }
        return count;
    }
    private  boolean isPrime(int i) {
        if (i == 2 || i == 3) {
            return true;
        } else {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
