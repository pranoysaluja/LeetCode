class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        int size=arr.size();
        double med=0;
        if(size%2==0)
        {
            int a=((size/2)-1);
            int b=((size/2));
            int m1=(int)arr.get(a);
            int m2=(int)arr.get(b);
            med=(double)(m1+m2)/2;
            return med;
        }
        else
        {
            int a=(size/2);
            int m1=(int)arr.get(a);
            med=(double)m1;
            return med;
        }
    }
}
