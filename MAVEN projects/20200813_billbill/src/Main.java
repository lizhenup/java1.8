/**
 * @author ：lizhen
 * @date ：Created in 2020/8/13 19:01
 * @description：
 * @modified By：
 * @version: $
 */
import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.util.*;
public class Main {
    boolean ret = false;
    public boolean Game24Points (int[] arr) {
        // write code here
        Func(arr,0);
        return ret;

    }


    public void Swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private void Func(int[] arr, int start) {
        if(start == arr.length - 1) {
            Ret(arr);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            Swap(arr, i, start);
            Func(arr, start + 1);
            Swap(arr, i, start);

        }
    }

    private void Ret(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];
        if(a + b + c + d == 12) {
            ret = true;
            return;
        }
        if(a + b + c - d == 12) {
            ret = true;
            return;
        }
        if(a + b + c * d == 12) {
            ret = true;
            return;
        }
        if(a + b + c / d == 12) {
            ret = true;
            return;
        }
        if(a + b - c + d == 12) {
            ret = true;
            return;
        }
        if(a + b - c - d == 12) {
            ret = true;
            return;
        }
        if(a + b - c * d == 12) {
            ret = true;
            return;
        }
        if(a + b - c / d == 12) {
            ret = true;
            return;
        }
        if(a + b * c + d == 12) {
            ret = true;
            return;
        }
        if(a + b * c - d == 12) {
            ret = true;
            return;
        }
        if(a + b * c * d == 12) {
            ret = true;
            return;
        }
        if(a + b * c / d == 12) {
            ret = true;
            return;
        }
        if(a + b / c + d == 12) {
            ret = true;
            return;
        }
        if(a + b / c - d == 12) {
            ret = true;
            return;
        }
        if(a + b / c * d == 12) {
            ret = true;
            return;
        }
        if(a + b / c / d == 12) {
            ret = true;
            return;
        }
        if(a - b + c + d == 12) {
            ret = true;
            return;
        }
        if(a - b + c - d == 12) {
            ret = true;
            return;
        }
        if(a - b + c * d == 12) {
            ret = true;
            return;
        }
        if(a - b + c / d == 12) {
            ret = true;
            return;
        }
        if(a - b - c + d == 12) {
            ret = true;
            return;
        }
        if(a - b - c - d == 12) {
            ret = true;
            return;
        }
        if(a - b - c * d == 12) {
            ret = true;
            return;
        }
        if(a - b - c / d == 12) {
            ret = true;
            return;
        }
        if(a - b * c + d == 12) {
            ret = true;
            return;
        }
        if(a - b * c - d == 12) {
            ret = true;
            return;
        }
        if(a - b * c * d == 12) {
            ret = true;
            return;
        }
        if(a - b * c / d == 12) {
            ret = true;
            return;
        }
        if(a - b / c + d == 12) {
            ret = true;
            return;
        }
        if(a - b / c - d == 12) {
            ret = true;
            return;
        }
        if(a - b / c * d == 12) {
            ret = true;
            return;
        }
        if(a - b / c / d == 12) {
            ret = true;
            return;
        }
        if(a * b + c + d == 12) {
            ret = true;
            return;
        }
        if(a * b + c - d == 12) {
            ret = true;
            return;
        }
        if(a * b + c * d == 12) {
            ret = true;
            return;
        }
        if(a * b + c / d == 12) {
            ret = true;
            return;
        }
        if(a * b - c + d == 12) {
            ret = true;
            return;
        }
        if(a * b - c - d == 12) {
            ret = true;
            return;
        }
        if(a * b - c * d == 12) {
            ret = true;
            return;
        }
        if(a * b - c / d == 12) {
            ret = true;
            return;
        }
        if(a * b * c + d == 12) {
            ret = true;
            return;
        }
        if(a * b * c - d == 12) {
            ret = true;
            return;
        }
        if(a * b * c * d == 12) {
            ret = true;
            return;
        }
        if(a * b * c / d == 12) {
            ret = true;
            return;
        }
        if(a * b / c + d == 12) {
            ret = true;
            return;
        }
        if(a * b / c - d == 12) {
            ret = true;
            return;
        }
        if(a * b / c * d == 12) {
            ret = true;
            return;
        }
        if(a * b / c / d == 12) {
            ret = true;
            return;
        }
        if(a / b + c + d == 12) {
            ret = true;
            return;
        }
        if(a / b + c - d == 12) {
            ret = true;
            return;
        }
        if(a / b + c * d == 12) {
            ret = true;
            return;
        }
        if(a / b + c / d == 12) {
            ret = true;
            return;
        }
        if(a / b - c + d == 12) {
            ret = true;
            return;
        }
        if(a / b - c - d == 12) {
            ret = true;
            return;
        }
        if(a / b - c * d == 12) {
            ret = true;
            return;
        }
        if(a / b - c / d == 12) {
            ret = true;
            return;
        }
        if(a / b * c + d == 12) {
            ret = true;
            return;
        }
        if(a / b * c - d == 12) {
            ret = true;
            return;
        }
        if(a / b * c * d == 12) {
            ret = true;
            return;
        }
        if(a / b * c / d == 12) {
            ret = true;
            return;
        }
        if(a / b / c + d == 12) {
            ret = true;
            return;
        }
        if(a / b / c - d == 12) {
            ret = true;
            return;
        }
        if(a / b / c * d == 12) {
            ret = true;
            return;
        }
        if(a / b / c / d == 12) {
            ret = true;
            return;
        }

    }
    /*private void FuncR(char[] ch, int start, int[] arr) {
        if(start == ch.length - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[0]).append(ch[0]).append(arr[1]).append(ch[1])
                    .append(arr[2]).append(ch[2]).append(arr[3]);
            return;
        }
        for (int i = start; i < ch.length; i++) {
            SwapC(ch, i, start);
            FuncR(ch, start + 1, arr);
            SwapC(ch, i, start);

        }
    }

    private void SwapC(char[] ch, int i, int j) {
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }*/

    /*public int GetCoinCount (int N) {
        // write code here
        int money = 1024 - N;
        int count = 0;
        if(money >= 64) {
            count += money / 64;
            money %= 64;
        }
        if(money >= 16) {
            count += money / 16;
            money %= 16;
        }
        if(money >= 4) {
            count += money / 4;
            money %= 4;
        }
        return count + money;
    }*/
    /*public boolean IsValidExp (String s) {
        // write code here
        if(s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }else {
                char tmp = stack.peek();
                if((tmp == '(' && s.charAt(i) == ')')
                        || (tmp == '{' && s.charAt(i) == '}')
                        || (tmp == '[' && s.charAt(i) == ']')) {
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }*/



}
