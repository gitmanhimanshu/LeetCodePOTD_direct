class Solution {
    public String largestNumber(int[] nums) {
Integer n[]=new Integer[nums.length];
int k=0;
for(int i:nums){
n[k++]=i;
}
       Arrays.sort(n,(a,b)->{
String s1=a+""+b;
String s2=b+""+a;
return s2.compareTo(s1);
       }); 
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<n.length;i++){
        ans.append(n[i]);
       }
       if(n[0]==0){
        return "0";
       }
       return ans.toString();
    }
}