import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 1;
        long b = 1;
        int n = scanner.nextInt();
        if(n == 1 || n == 2) {
            System.out.println(1);
        }else {
            long c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }*/
    public static void main1(String[] args) {
        int[] arr = {-12,1,-18,6,-3,-2,7,-15,1,2,2};
        //System.out.println(FindGreatestSumOfSubArray(arr));
        String s = "leetcode";
        HashSet dict = new HashSet();
        dict.add("leet");
        dict.add("code");
        //System.out.println(wordBreak(s, dict));
    }
    /*public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] canBreak = new boolean[s.length() + 1];
        // 初始化F(0) = true
        canBreak[0] = true;
        for(int i = 1; i <= s.length(); ++i){
            for(int j = i - 1; j >= 0; --j){
            // F(i): true{j <i && F(j) && substr[j+1,i]能在词典中找到} OR false
            // 第j+1个字符的索引为j
                if(canBreak[j] && dict.contains(s.substring(j,i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }*/
    /*public int uniquePaths (int m, int n) {
        // write code here
        int[][] ret = new int [m] [n];
        for (int i = 0; i < n; i++) {
            ret[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            ret[i][0] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ret[i][j] = ret[i - 1][j] + ret[i][j - 1];
            }
        }
        return ret[m - 1][n - 1];
    }*/
    /*public static void main(String[] args) {
        String str = "aabcaa";
        System.out.println(minCut(str));
    }*/
    /*public static int minCut(String s) {
        int len = s.length();
        if(len == 0)
            return 0;
        int[] minCut = new int[len + 1];
        // F(i)初始化
        // F(0）= -1，必要项，如果没有这一项，对于重叠字符串“aaaaa”会产生错误的结果
        for(int i = 0; i <= len; ++i){
            minCut[i] = i - 1;
        }
        for(int i = 1; i <= len; ++i){
            for(int j = 0; j < i; ++j){
                // F(i) = min{F(i), 1 + F(j)}, where j<i && j+1到i是回文串
                // 从最长串判断，如果从第j+1到i为回文字符串
                // 则再加一次分割，从1到j，j+1到i的字符就全部分成了回文字符串
                if(isPal(s, j, i - 1)){
                    minCut[i] = Math.min(minCut[i], minCut[j] + 1);
                }
            }
        }
        return minCut[len];
    }
    public static boolean isPal(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            ++start;
            --end;
        }
        return true;
    }*/

    /*public static boolean[][] getMat(String s){
        int len = s.length();
        boolean[][] Mat = new boolean[len][len];
        for(int i = len - 1; i >= 0; --i){
            for(int j = i; j < len; ++j){
                if(j == i)
                // 单字符为回文字符串
                    Mat[i][j] = true;
                else if(j == i + 1){
                // 相邻字符如果相同，则为回文字符串
                    if(s.charAt(i) == s.charAt(j))
                        Mat[i][j] = true;
                    else
                        Mat[i][j] = false;
                } else{
                        // F(i,j) = {s[i]==s[j] && F(i+1,j-1)
                        // j > i+1
                        Mat[i][j] = (s.charAt(i) == s.charAt(j)) && Mat[i + 1][j - 1];
                }
            }
        }
        return Mat;
    }
    public static int minCut(String s) {
        int len = s.length();
        if(len == 0)
            return 0;
        boolean[][] Mat = getMat(s);
        int[] minCut = new int[len + 1];
            // F(i)初始化
            // F(0）= -1，必要项，如果没有这一项，对于重叠字符串“aaaaa”会产生错误的结果
        for(int i = 0; i <= len; ++i){
            minCut[i] = i - 1;
        }
        for(int i = 1; i <= len; ++i){
            for(int j = 0; j < i; ++j){
                    // F(i) = min{F(i), 1 + F(j)}, where j<i && j+1到i是回文串
                    // 从最长串判断，如果从第j+1到i为回文字符串
                    // 则再加一次分割，从1到j，j+1到i的字符就全部分成了回文字符串
                if(Mat[j][i - 1]){
                    minCut[i] = Math.min(minCut[i], minCut[j] + 1);
                }
            }
        }
        return minCut[len];
    }*/
    public static void main2(String[] args) {
        /*String word1 = "abcd";
        String word2 = "accde";

        System.out.println(minDistance(word1, word2));*/
        String S = "b";
        String T = "a";
        System.out.println(numDistinct(S, T));
    }
    /*public static int minDistance(String word1, String word2) {
        // word与空串之间的编辑距离为word的长度
        if(word1.isEmpty() || word2.isEmpty())
            return Math.max(word1.length(), word2.length());
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] minDis = new int[len1 + 1][len2 + 1];
        // F(i,j)初始化
        for(int i = 0; i <= len1; ++i){
            minDis[i][0] = i;
        }
        for(int i = 0; i <= len2; ++i){
            minDis[0][i] = i;
        }
        for(int i = 1; i <= len1; ++i){
            for(int j = 1; j <= len2; ++j){
                // F(i,j) = min { F(i-1,j）+1, F(i,j-1) +1, F(i-1,j-1) +(w1[i]==w2[j]?0:1) }
                minDis[i][j] = 1 + Math.min(minDis[i - 1][j], minDis[i][j - 1]);
                // 判断word1的第i个字符是否与word2的第j个字符相等
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                // 字符相等，F(i-1,j-1)编辑距离不变
                    minDis[i][j] = Math.min(minDis[i][j],minDis[i - 1][j - 1]);
                } else{
                    // 字符不相等，F(i-1,j-1)编辑距离 + 1
                    minDis[i][j] = Math.min(minDis[i][j],minDis[i - 1][j - 1] + 1);
                }
            }
        }
        return minDis[len1][len2];
    }*/
    public static int numDistinct (String S, String T) {
        // write code here
        /*if(S.length() == 0 || T.length() == 0) {
            return 0;
        }
        if(S.length() == 1 && T.length() == 1 && !S.equals(T)) {
            return 0;
        }*/
        int sLen = S.length(), tLen = T.length();
        int[][] ret = new int[S.length() + 1][T.length() + 1];
        for(int i = 0; i < ret.length; i++) {
            ret[i][0] = 1;
        }
        for(int i = 1; i < ret[0].length; i++) {
            ret[0][i] = 0;
        }

        for(int i = 1; i < ret.length; i++) {
            for(int j = 1; j < ret[0].length; j++) {
                if(S.charAt(i - 1) == T.charAt(j - 1)) {
                    ret[i][j] = ret[i - 1][j] + ret[i - 1][j - 1];
                }else {
                    ret[i][j] = ret[i - 1][j];
                }
            }
        }
        return ret[ret.length - 1][ret[0].length - 1];
    }
    /*public int numDistinct(String S, String T) {
        int sLen = S.length();
        int tLen = T.length();
        int[][] numDis = new int[sLen + 1][tLen + 1];
        numDis[0][0] = 1;
        // F(i,j)，初始化第一行剩余列的所有值为0
        for(int i = 1; i <= tLen; ++i){
            numDis[0][i] = 0;
        }
        //F(i, 0) = 1
        for(int i = 1; i <= sLen; ++i){
            numDis[i][0] = 1;
        }
        for(int i = 1; i <= sLen; ++i) {
            for (int j = 1; j <= tLen; ++j) {
                // S的第i个字符与T的第j个字符相同
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    numDis[i][j] = numDis[i - 1][j] + numDis[i - 1][j - 1];
                } else {
                    // S的第i个字符与T的第j个字符不相同
                    // 从S的前i-1个字符中找子串，使子串与T的前j个字符相同
                    numDis[i][j] = numDis[i - 1][j];
                }
            }
        }
        return numDis[sLen][tLen];
    }*/
    /*public int getImportance(List<Employee> employees, int id) {
        if(employees.isEmpty()) {
            return 0;
        }
        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return DFS(map, id);
    }

    private int DFS(HashMap<Integer,Employee> map, int id) {
        Employee em = map.get(id);
        int sum = em.importance;
        for (int e : em.subordinates) {
            sum += DFS(map,e);
        }
        return sum;
    }*/
    /*public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        floodFillDFS(image, sr, sc, oldColor, newColor);
        return image;
    }
    public void floodFillDFS(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if(sr - 1 >= 0 && oldColor == image[sr - 1][sc] && newColor != oldColor) {
            image[sr - 1][sc] = newColor;
            floodFillDFS(image, sr - 1, sc, oldColor, newColor);
        }
        if(sr + 1 < image.length && oldColor == image[sr + 1][sc] && newColor != oldColor) {
            image[sr + 1][sc] = newColor;
            floodFillDFS(image, sr + 1, sc, oldColor, newColor);
        }
        if(sc - 1 >= 0 && oldColor == image[sr][sc - 1] && newColor != oldColor) {
            image[sr][sc - 1] = newColor;
            floodFillDFS(image, sr, sc - 1, oldColor, newColor);
        }
        if(sc + 1 < image[0].length && oldColor == image[sr][sc + 1] && newColor != oldColor) {
            image[sr][sc + 1] = newColor;
            floodFillDFS(image, sr, sc + 1, oldColor, newColor);
        }
    }*/
    int area;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;
                    area = 1;
                    DFS(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private void DFS(int[][] grid, int i, int j) {
        if(i > 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 0;
            area++;
            DFS(grid, i - 1, j);
        }
        if(i < grid.length - 1 && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 0;
            area++;
            DFS(grid, i + 1, j);
        }
        if(j > 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 0;
            area++;
            DFS(grid, i, j - 1);
        }
        if(j < grid[0].length - 1 && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 0;
            area++;
            DFS(grid, i, j + 1);
        }
    }
    /*public static int numIslands(char[][] grid) {
        int num = 0;
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    num++;
                    grid[i][j] = 0;
                    DFS(grid, i, j);
                }
            }
        }
        return num;
    }

    private static void DFS(char[][] grid, int i, int j) {
        if(i > 0 && grid[i - 1][j] == 1) {
            grid[i - 1][j] = 0;
            DFS(grid, i - 1, j);
        }
        if(i < grid.length - 1 && grid[i + 1][j] == 1) {
            grid[i + 1][j] = 0;
            DFS(grid, i + 1, j);
        }
        if(j > 0 && grid[i][j - 1] == 1) {
            grid[i][j - 1] = 0;
            DFS(grid, i - 1, j);
        }
        if(j < grid[0].length - 1 && grid[i][j + 1] == 1) {
            grid[i][j + 1] = 0;
            DFS(grid, i, j + 1);
        }
    }*/

}
/*class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}*/
