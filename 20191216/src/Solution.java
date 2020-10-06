public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        int part1 = 0;
        int part2 = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int average = sum/3;
        int j = 0;
        while (j < A.length && part1 != average) {
            if(A[j] == average && restOfArray(j,A)/2 == average) {
                j++;
                break;
            }
            part1 += A[j];
            j++;
        }
        if(j == A.length-1 && A[j] == average) {
            return false;
        }
        while (j < A.length && part2 != average) {
            if(A[j] == average && restOfArray(j,A) == average) {
                j++;
                break;
            }
            part2 += A[j];
            j++;
        }
        if(j == A.length-1 && A[j] == average) {
            return true;
        }
        if(restOfArray(j,A) != average) {
            return false;
        }
        return true;

    }
    public int restOfArray(int i,int[] A) {
        int sum = 0;
        for (int j = i; j < A.length; j++) {
            sum += A[j];
        }
        return sum;
    }
    //////////////////////////////////////////////////////////////////////
    public boolean canThreePartsEqualSum1(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum += A[i];//数组元素总和
        int average = sum / 3;//目标和
        int j = 0;
        int part1 = 0;//第一部分
        int part2 = 0;//第二部分
        int part3 = 0;//第三部分

        while (j < A.length && part1 != average) {
            //如果第一个元素就等于目标和 ，那么需要判断是否是我们需要的部分
            if (A[j] == average && restOfArray1(j, A) / 2 == average) {
                j++;
                break;
            }

            part1 += A[j];//求和
            j++;
        }
        if (j == A.length - 1)//防止下标溢出
            return false;
        while (j < A.length && part2 != average) {
            if (A[j] == average && restOfArray1(j, A) == average) {
                j++;
                break;
            }
            part2 += A[j];
            j++;
        }
        if (j == A.length - 1 && A[j] == average)//末尾元素等于目标和的情况
            return true;

        if (restOfArray1(j, A) != average)
            return false;

        return true;
    }

    public int restOfArray1(int i, int[] A) {//求剩余数组元素和
        int sum = 0;
        for (int j = i; j < A.length; j++)
            sum += A[j];
        return sum;
    }

}
