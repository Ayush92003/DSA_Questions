class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0,j=minutes-1,unsatisfied=0,satisfied=0,max=0;
        int a=i,b=j,n=customers.length;
        // for 1st window
        for(int x=0;x<=j;x++) if(grumpy[x]==1) unsatisfied+=customers[x];
        max=Math.max(max,unsatisfied);
        j++;
        i++;
        while(j<n){
            if(j!=n) unsatisfied+=(customers[j]*grumpy[j]);
            if(i!=n) unsatisfied-=(customers[i-1]*grumpy[i-1]);
            if(max<unsatisfied){
                max=unsatisfied;
                a=i;
                b=j;
            }
            i++;
            j++;
        }
        for(int x=a;x<=b;x++){
            grumpy[x]=0;
        }
        for(int x=0;x<n;x++) if(grumpy[x]==0) satisfied+=customers[x];
        return satisfied;
    }
}
