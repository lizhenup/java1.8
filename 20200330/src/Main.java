import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] gpa = new int[n];
            int[] score = new int[n];
            int cur = 0;
            for(int i = 0; i < gpa.length; i++) {
                gpa[i] = sc.nextInt();
                cur += gpa[i];
            }
            for(int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt();
            }
            double tmp = 0;
            for(int i = 0; i < score.length; i++) {
                if(score[i] >= 90 && score[i] <= 100) {
                    tmp += gpa[i] * 4;
                }else if(score[i] >= 85 && score[i] <= 89) {
                    tmp += gpa[i] * 3.7;
                }else if(score[i] >= 82 && score[i] <= 84) {
                    tmp += gpa[i] * 3.3;
                }else if(score[i] >= 78 && score[i] <= 81) {
                    tmp += gpa[i] * 3;
                }else if(score[i] >= 75 && score[i] <= 77) {
                    tmp += gpa[i] * 2.7;
                }else if(score[i] >= 72 && score[i] <= 74) {
                    tmp += gpa[i] * 2.3;
                }else if(score[i] >= 68 && score[i] <= 71) {
                    tmp += gpa[i] * 2;
                }else if(score[i] >= 64 && score[i] <= 67) {
                    tmp += gpa[i] * 1.5;
                }else if(score[i] >= 60 && score[i] <= 63) {
                    tmp += gpa[i] * 1;
                }
            }
            double GPA = tmp / cur;
            System.out.println(String.format("%.2f",GPA));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double money = sc.nextDouble();
            System.out.print("人民币");
            Stack<String> stack = new Stack<String>();
            while (money != 0 && money > 1) {
                func((int)money % 10);
            }

        }
    }

    public static void func(int num) {
        if(num == 1) {
            System.out.print("壹");
        }else if(num == 2) {
            System.out.print("贰");
        }else if(num == 3) {
            System.out.print("叁");
        }else if(num == 4) {
            System.out.print("肆");
        }else if(num == 5) {
            System.out.print("伍");
        }else if(num == 6) {
            System.out.print("陆");
        }else if(num == 7) {
            System.out.print("柒");
        }else if(num == 8) {
            System.out.print("捌");
        }else if(num == 9) {
            System.out.print("玖");
        }
    }
}