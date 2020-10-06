import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] str = sc.nextLine().split("\\|");
            String[] first = str[0].split(" ");
            String[] second = str[1].split(" ");
            int[] a = new int[first.length];
            int[] b = new int[second.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(first[i]);
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(second[i]);
            }
            int day = 0;
            if(a[0] - b[0] == 0) {
                if(a[1] - b[1] == 0) {
                    day = Math.abs(a[2] - b[2]) % 7 + a[3];
                    day = day > 7 ? day - 7 : day;
                    System.out.println(day);
                }else {
                    if((a[0] % 4 == 0 && a[0] % 100 != 0) || a[0] % 400 == 0) {
                        day = (Math.abs(days(a[1]) + a[1] > 2 ? a[2] + 1 : a[2]
                                - days(b[1]) - b[1] > 2 ? b[2] + 1 : b[2])) % 7 + a[3];
                        day = day > 7 ? day - 7 : day;
                        System.out.println(day);
                    }else {
                        day = (Math.abs(days(a[1]) + a[2] - days(b[1]) - b[2])) % 7 + a[3];
                        day = day > 7 ? day - 7 : day;
                        System.out.println(day);
                    }
                }
            }else {
                int k = findYears(a[0],b[0]);
                int aD = 0, bD = 0;
                if((b[0] % 4 == 0 && b[0] % 100 != 0) || b[0] % 400 == 0) {
                    bD = days(b[1]) + b[1] > 2 ? b[2] + 1 : b[2];
                }else {
                    bD = days(b[1]) + b[2];
                }
                if((a[0] % 4 == 0 && a[0] % 100 != 0) || a[0] % 400 == 0) {
                    aD = days(a[1]) + a[1] > 2 ? a[2] + 1 : a[2];
                }else {
                    aD = days(a[1]) + a[2];
                }
                if(a[0] > b[0]) {
                    day = (k + aD - bD) % 7 + a[3];
                    day = day > 7 ? day - 7 : day;
                    System.out.println(day);
                }else {
                    day = (k - aD + bD) % 7 + a[3];
                    day = day > 7 ? day - 7 : day;
                    System.out.println(day);
                }
            }
        }
    }

    private static int findYears(int a, int b) {
        int k = Math.min(a,b);
        int m = Math.max(a,b);
        int count = 0;
        if((k % 4 == 0 && k % 100 != 0) || k % 400 == 0) {
            while(k < m) {
                k += 4;
                if((k % 4 == 0 && k % 100 != 0) || k % 400 == 0) {
                    count++;
                }
            }
            return Math.abs(a - b) * 365 + count;
        }else {
            while (!((k % 4 == 0 && k % 100 != 0) || k % 400 == 0)) {
                k++;
            }
            count++;
            while(k < m) {
                k += 4;
                if((k % 4 == 0 && k % 100 != 0) || k % 400 == 0) {
                    count++;
                }
            }
            return Math.abs(a - b) * 365 + count;
        }
    }

    public static int days(int month) {
        if(month == 1) {
            return 0;
        } else if(month == 2) {
            return 31;
        } else if(month == 3) {
            return 31 + 28;
        } else if(month == 4) {
            return 31 * 2 + 28;
        } else if(month == 5) {
            return 31 * 2 + 28 + 30;
        } else if(month == 6) {
            return 31 * 3 + 28 + 30;
        } else if(month == 7) {
            return 31 * 3 + 28 + 30 * 2;
        } else if(month == 8) {
            return 31 * 4 + 28 + 30 * 2;
        } else if(month == 9) {
            return 31 * 5 + 28 + 30 * 2;
        } else if(month == 10) {
            return 31 * 5 + 28 + 30 * 3;
        } else if(month == 11) {
            return 31 * 6 + 28 + 30 * 3;
        } else {
            return 31 * 6 + 28 + 30 * 4;
        }
    }
        public static void main2(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                String[] str1 = sc.nextLine().split(",");
                String[] str2 = sc.nextLine().split(",");
                HashSet<Integer> set = new HashSet<Integer>();
                for(String s : str1) {
                    set.add(Integer.parseInt(s));
                }
                int[] arr = new int[str2.length];
                for (int i = 0; i < str2.length; i++) {
                    arr[i] = Integer.parseInt(str2[i]);
                }
                Arrays.sort(arr);
                int count = 0;
                while(!set.isEmpty()) {
                    for (int i = 0; i < arr.length; i++) {
                        if(set.contains(arr[i] + count)) {
                            set.remove(arr[i] + count);
                        }
                        if(set.contains(arr[i] - count)) {
                            set.remove(arr[i] - count);
                        }
                        if(set.isEmpty()) {
                            break;
                        }
                    }
                    count++;
                }
                System.out.println(count);
            }
        }
}