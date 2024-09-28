class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        int tot = 0;
        for (int n : nums){
            tot +=n;
        }
        return (nums.length*(nums.length+1)/2)-tot;
    }

    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        int missNum = missingNumber(nums);
        System.out.println(missNum);
    }
}