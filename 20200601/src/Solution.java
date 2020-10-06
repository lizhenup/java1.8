import sun.reflect.generics.tree.Tree;

import java.util.*;
/*public class Solution {
    public int[] solve (int n, String[] s, int m, String[] t) {
        // write code here
        HashMap<Character,List<String>> map = new HashMap<>();
        for (String str : s) {
            map.putIfAbsent(str.charAt(0), new ArrayList<>());
            map.get(str.charAt(0)).add(str);
        }
        int[] ret = new int[m];
        int k = 0;
        for (String st : t) {
            int cur = 0;
            if(map.containsKey(st.charAt(0))) {
                for (String tmp : map.get(st.charAt(0))) {
                    if(st.length() == 1) {
                        cur++;
                        break;
                    }
                    if(st.length() != tmp.length()) {
                        boolean flg = true;
                        boolean flg2 = false;
                        for (int i = 0; i < st.length(); i++) {
                            if(i % 2 == 0 && st.charAt(i) != tmp.charAt(i)) {
                                flg = false;
                            }
                            if(i % 2 != 0 && st.charAt(i) != tmp.charAt(i)) {
                                flg2 = true;
                            }
                        }
                        if(flg && flg2) {
                            cur++;
                        }
                    }else {
                        boolean flg = true;
                        for (int i = 0; i < st.length(); i++) {
                            if(i % 2 == 0 && st.charAt(i) != tmp.charAt(i)) {
                                flg = false;
                            }
                        }
                        if(flg && !st.equals(tmp)) {
                            cur++;
                        }
                    }
                }
            }
            ret[k++] = cur;
        }
        return ret;
    }
}*/
/*class TrieNode {
    TrieNode[] nodes;
    boolean isWord;
    int cnt = 0;
    TrieNode() {
        nodes = new TrieNode[26];
    }
    public static void insert(TrieNode node, String s) {
        for (int i = 0; i < s.length(); ++i) {
            ++node.cnt;
            int c = s.charAt(i) - 'a';
            if (node.nodes[c] == null) {
                node.nodes[c] = new TrieNode();
            }
            node = node.nodes[c];
        }
        node.isWord = true;
        ++node.cnt;
    }
}
public class Solution {
    public static void main(String[] args) {
        String[] s = {"ascdfc","ascfesz","axscdfc","cdsxza","cxzasdfv"};
        String[] t = {"a","b","c","asc","aaca","cds"};
        //3 0 2 2 2 1
        System.out.println(Arrays.toString(solve(s.length,s,t.length,t)));
    }
    public static int[] solve (int n, String[] s, int m, String[] t) {
        TrieNode root = new TrieNode();
        for (String item : s) {
            TrieNode.insert(root, item);
        }
        int[] ans = new int[m];
        int i = 0;
        Map<String, Integer> hash = new HashMap<>();
        for (String item : t) {
            if (hash.containsKey(item)) {
                ans[i++] = hash.get(item);
                continue;
            }
            int[] num = new int[1];  //0
            dfs(root, item, 0, num, true);
            ans[i++] = num[0];
            hash.put(item, num[0]);
        }
        return ans;
    }
    private static void dfs(TrieNode node, String s, int idx, int[] num, boolean boo) {
        //boo == true means all even positions are equal
        if (idx == s.length()) {
            if (idx == 1 || !boo) {
                num[0] += node.cnt;
            }
            return;
        }
        int c = s.charAt(idx) - 'a';
        ++idx;
        if ((idx & 1 ) == 1 && node.nodes[c] != null) {
            dfs(node.nodes[c], s, idx, num, boo);
        } else if ((idx & 1) == 0) {
            for (int i = 0; i < 26; ++i) {
                if (node.nodes[i] != null) {
                    if (i != c) {  //at least one char in even position is diff
                        dfs(node.nodes[i], s, idx, num, false);
                        continue;
                    }
                    dfs(node.nodes[i], s, idx, num, boo);
                }
            }
        }
    }
}*/
class TreeNode {
    TreeNode[] nodes;
    boolean isWord;
    int cnt = 0;
    TreeNode() {
        nodes = new TreeNode[26];
    }
    public static void insert(TreeNode node,String s) {
        for (int i = 0; i < s.length(); i++) {
            ++node.cnt;
            int c = s.charAt(i) - 'a';
            if(node.nodes[c] == null) {
                node.nodes[c] = new TreeNode();
            }
            node = node.nodes[c];
            ++node.cnt;
        }
    }
}
public class Solution {
    public int[] solve (int n, String[] s, int m, String[] t) {
        TreeNode root = new TreeNode();
        for(String str : t) {
            TreeNode.insert(root,str);
        }
        int[] ret = new int[m];
        int i = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for (String s1 : s) {
            if(map.containsKey(s1)) {
                ret[i++] = map.get(s1);
                continue;
            }
            int[] num = new int[1];
            findNum(root,num,s1,0,true);
            ret[i++] = num[0];
            map.put(s1,ret[i]);
        }
        return ret;
    }

    private void findNum(TreeNode root,int[] num, String s1, int index, boolean flg) {
        if(index == s1.length()) {
            if(s1.length() == 1 || !flg) {
                num[0] += root.cnt;
            }
            return;
        }
        int c = s1.charAt(index) - 'a';
        index++;
        if((index & 1) == 1 && root.nodes[c] != null) {
            findNum(root.nodes[c],num,s1,index,flg);
        }else if((index & 1) == 0) {
            for (int i = 0; i < 26; i++) {
                if(root.nodes[i] != null) {
                    if(i != c) {
                        findNum(root.nodes[i],num,s1,index,false);
                        continue;
                    }
                    findNum(root.nodes[i],num,s1,index,flg);
                }
            }
        }
    }
}
