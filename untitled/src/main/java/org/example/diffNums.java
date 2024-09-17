package org.example;

public class diffNums {
    private int[] diff;//差分数组
    private int[] nums;//原数组

    //构造函数，初始化差分数组
    public void initDiffNums(@org.jetbrains.annotations.NotNull int[] nums) {
        this.nums = nums;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    //给区间[i,j]每个元素增加val
    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    //返回原数组
    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        diffNums diffNums = new diffNums();//创建对象
        diffNums.initDiffNums(nums);//初始化差分数组
        diffNums.increment(1, 3, 2);//给区间[1,3]每个元素增加2
        int[] result = diffNums.result();
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
