class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[j])
                a[++j]=a[i];
        }
        return j+1;
    }
}
