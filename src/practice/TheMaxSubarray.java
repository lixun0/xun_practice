package practice;

public class TheMaxSubarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
                max=nums[i];
        }
        if(max<0)return max;
        int sum=0;
        max=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum<0)sum=0;
            if(sum>max)
                max=sum;
        }
        return max; 
    }
}
