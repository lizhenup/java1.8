/**
 * @author ：lizhen
 * @date ：Created in 2020/8/27 12:59
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr[0]; i++) {
                list.add(arr[0]);
            }
            int k = 1;
            if(list.size() == 1) {
                for (int i = 0; i < arr[1]; i++) {
                    list.add(arr[i]);
                }
                k++;
            }
            while (list.size() < n) {
                int tmp = list.get(k);
                for (int i = 0; i < tmp; i++) {
                    list.add(arr[k % m]);
                }
                k++;
            }
            System.out.println(list.size());
            for (int i = 0; i < list.size() - 2; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(list.get(list.size() - 2));
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            String str1 = str[0];
            String str2 = str[1];
            if(str2.length() == 0) {
                System.out.println(0);
            }else if(str2.length() > str1.length()) {
                System.out.println(-1);
            }else {
                Queue<Character> queue = new LinkedList<>();
                for (int i = 0; i < str2.length(); i++) {
                    queue.offer(str2.charAt(i));
                }
                Queue<Character> tmp = queue;
                int ret = -1;
                for (int i = 0; i < str1.length(); i++) {
                    if(str1.charAt(i) == tmp.peek()) {
                        tmp.poll();
                        if(tmp.isEmpty()) {
                            ret = i - queue.size();
                            break;
                        }
                    }else {
                        if(tmp.size() != queue.size()) {
                            tmp = queue;
                            --i;
                        }

                    }
                }
                System.out.println(ret);
            }
        }
    }*/

    //-2 1 -3 4 -1 2 1 -5 4
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    list.add(str.charAt(i) - 48);
                }
            }
            int ret = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                ret = Math.max(list.get(i),ret + list.get(i));
            }
            System.out.println(ret);
        }
    }*/
    /*public int func(int[] arr) {
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ret = Math.max(arr[i],ret + arr[i]);
        }
        return  ret;
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int first = sc.nextInt();
            int two = sc.nextInt();
            int life = sc.nextInt();
            int year = sc.nextInt();
            int sum = func1(first,two,life,year) + func2(first,two,life,year)
                    + func3(first,two,life,year) + func4(first,two,life,year);
        }
    }

    private static int func4(int first, int two, int life, int year) {
    }

    private static int func3(int first, int two, int life, int year) {
    }

    private static int func2(int first, int two, int life, int year) {
        if(life <= 1) {

        }
    }

    private static int func1(int first, int two, int life, int year) {
        if(year < first) {
            return 1;
        }
        return func1(first,two,life - 1,year) + func3(first,two,life - 1,year);
    }

    /*private static void findNum(int first, int two, int life, int time, int year) {
        if(time == year) {
            return;
        }
        if(time + first <= year) {
            ret++;
            findNum(first,two,life,time + first,year);
        }
        if(time + first + two <= year) {
            ret++;
            findNum(first,two,life,time + first + two,year);
        }

    }*/
    public static void main(String[] args) {
        People people1 = new People();
        people1.setAge(1800);
        people1.setName("张大炮");
        People people2 = null;
        //people1.setAge(18);
        try {
             people2 = people1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("people1 和people2 的引用一样吗?");
        System.out.println(people1 == people2);
        System.out.println("people1 和people2 的对象一样吗?");
        System.out.println(people1.equals(people2));
        System.out.println("people1中的数组和people2中的数组的引用一样吗?");
        System.out.println(people1.arr == people2.arr);
        System.out.println("people1中的数组和people2中的数组的对象一样吗?");
        System.out.println(people1.arr.equals(people2.arr));
        System.out.println("修改people2的名字为张小跑");
        people2.setName("张小跑");
        System.out.println("people1 name :" + people1.getName());
        System.out.println("people2 name :" + people2.getName());
        people2.arr[0] = 2;
        System.out.println("修改people2中数组0号元素为2");
        System.out.println("people1 arr :" + Arrays.toString(people1.arr));
        System.out.println("people2 arr :" + Arrays.toString(people2.arr));
        System.out.println("people1中的数组和people2中的数组的引用一样吗?");
        System.out.println(people1.arr == people2.arr);
        System.out.println("people1中的数组和people2中的数组的对象一样吗?");
        System.out.println(people1.arr.equals(people2.arr));
    }
}
class People{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("恰饭");
    }
    int[] arr = {1, 2, 3, 4, 5, 6};
    public People( ) {

    }
    public People(int a) {
        System.out.println(a);
    }
    public People clone() throws CloneNotSupportedException {
        People people;
        people = (People) super.clone();
        people.arr =  Arrays.copyOf(people.arr,people.arr.length);
        return people;
    }
}

