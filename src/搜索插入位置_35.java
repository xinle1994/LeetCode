public class 搜索插入位置_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6}; int target = 2;
        int i = searchInsert(nums, target);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        if (target <= nums[0]){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left < right){
            mid = left + (right-left+1)/2;
            if (nums[mid] > target){
                right = mid-1;
            }else {
                left = mid;
            }
        }
        if (nums[left] != target){
            return  left+1;
        }
        return left;
    }
}
