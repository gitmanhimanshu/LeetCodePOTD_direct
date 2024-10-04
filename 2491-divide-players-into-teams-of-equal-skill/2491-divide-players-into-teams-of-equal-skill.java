class Solution {
    public long dividePlayers(int[] skill) {
       long ans=0;
       Arrays.sort(skill);
       
       int i=0;
       int j=skill.length-1;
       int s=skill[0]+skill[skill.length-1];
       while(i<j){
        if(skill[i]+skill[j]!=s){
            return -1;
        }
        ans+=(skill[i]*skill[j]);
i++;
j--;
       }
       return ans;
    }
}