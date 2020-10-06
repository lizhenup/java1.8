import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    /*public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            while (size-- > 0) {
                Node tmp = queue.poll();
                list.add(tmp.val);
                for (Node ch : tmp.children) {
                    queue.offer(ch);
                }
            }
            if (!list.isEmpty()) {
                ret.add(list);
            }

        }
        return ret;
    }*/
    public static void main2(String[] args) {
        int[][] num = {{2,1,1},{1,1,0},{0,1,1}};
        //System.out.println(orangesRotting(num));
    }

    /*Queue<Point> queue = new LinkedList<>();
    public  int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Point(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Point point = queue.poll();
                BFS(grid, point.x, point.y);
            }
            if(!queue.isEmpty()) {
                num++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return num;
    }

    private  void BFS(int[][] grid, int i, int j) {
        if(i > 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 2;
            queue.offer(new Point(i - 1, j));
        }
        if(i < grid.length - 1 && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 2;
            queue.offer(new Point(i + 1, j));
        }
        if(j > 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 2;
            queue.offer(new Point(i, j - 1));
        }
        if(j < grid[0].length - 1 && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 2;
            queue.offer(new Point(i, j + 1));
        }
    }*/
    /*public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>();
        for (String w : wordList) {
            wordSet.add(w);
        }
        HashSet<String> found = new HashSet<>();
        found.add(beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int num = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String word = queue.poll();
                for (int i = 0; i < word.length(); i++) {
                    StringBuilder tmpWord = new StringBuilder(word);
                    for (char ch = 'a'; ch <= 'z' ; ch++) {
                        tmpWord.setCharAt(i, ch);
                        String changeWord = new String(tmpWord);
                        if(!wordSet.contains(changeWord) || found.contains(changeWord)) {
                            continue;
                        }
                        if(changeWord.equals(endWord)) {
                            return num + 1;
                        }
                        found.add(changeWord);
                        queue.offer(changeWord);
                    }
                }
            }
            num++;
        }
        return 0;
    }*/
/*    public static void main(String[] args) {
        String start = "AAAACCCC";
        String end = "CCCCCCCC";
        String[] bank = {"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"};
        System.out.println(minMutation(start, end, bank));
    }
    public static int minMutation(String start, String end, String[] bank) {
        HashSet<String> setBank = new HashSet<>();
        for (String ba : bank) {
            setBank.add(ba);
        }
        HashSet<String> setChange = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        setChange.add(start);
        int num = 0;
        char[] DNA = {'A', 'C', 'G', 'T'};
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String str = queue.poll();
                for (int i = 0; i < str.length(); i++) {

                    for (int j = 0; j < DNA.length; j++) {
                        StringBuilder sb = new StringBuilder(str);
                        sb.setCharAt(i, DNA[j]);
                        String s = new String(sb);
                        if(!setBank.contains(s) || setChange.contains(s)) {
                            continue;
                        }
                        if(s.equals(end)) {
                            return num + 1;
                        }
                        setChange.add(s);
                        queue.add(s);
                    }
                }
            }
            num++;
        }
        return -1;
    }*/
    public int openLock(String[] deadends, String target) {
        HashSet<String> setDead = new HashSet<>();
        for (String d : deadends) {
            setDead.add(d);
        }
        if(setDead.contains("0000")) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        HashSet<String> found = new HashSet<>();
        queue.offer("0000");
        found.add("0000");
        int num = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String str = queue.poll();
                if(str.equals(target)) {
                    return num;
                }
                for (int i = 0; i < 4; i++) {
                    char ch1 = str.charAt(i);
                    if(ch1 == '9') {
                        ch1 = '0';
                    }else {
                        ++ch1;
                    }
                    char ch2 = str.charAt(i);
                    if(ch2 == '0') {
                        ch2 = '9';
                    }else {
                        --ch2;
                    }
                    StringBuilder sb1 = new StringBuilder(str);
                    StringBuilder sb2 = new StringBuilder(str);
                    sb1.setCharAt(i, ch1);
                    sb2.setCharAt(i, ch2);
                    String s1 = new String(sb1);
                    String s2 = new String(sb2);
                    if(!setDead.contains(s1) && !found.contains(s1)) {
                        queue.offer(s1);
                        found.add(s1);
                    }
                    if(!setDead.contains(s2) && !found.contains(s2)) {
                        queue.offer(s2);
                        found.add(s2);
                    }
                }
            }
            num++;
        }
        return -1;
    }
    String[] map = {"", "", "abc", "def", "ghi", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        backTrace(digits, ret, sb, 0);
        return ret;
    }
    public void backTrace(String digits, List<String> ret, StringBuilder sb, int num) {
        if(num == digits.length()) {
            if(sb.length() != 0) {
                ret.add(new String(sb));
            }
            return;
        }
        int index = digits.charAt(num) - '0';
        String cur = map[index];
        for(int i = 0; i < cur.length(); i++) {
            backTrace(digits, ret, sb.append(cur.charAt(i)), num + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

}
/*class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}*/

