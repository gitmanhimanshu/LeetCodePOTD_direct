class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
     int pre[]=new int[s.length()];
     int last[]=new int[s.length()];
     int total=0;
     int s1=0;
    
   for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c=='|'){
        pre[i]=s1;
     
    }
  else { pre[i]=s1;
    s1++;}
   }
   s1=0;
    for(int i=s.length()-1;i>=0;i--){
    char c=s.charAt(i);
    if(c=='|'){
        last[i]=s1;
       
    }
  else {  s1++;
   last[i]=s1;}
   
   }
   total=last[0];
   int prevslash[]=new int[s.length()];
   int nextslash[]=new int[s.length()];
   int ind=-1;
   for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c=='|'){
        ind=i;
    }
    prevslash[i]=ind;

   }
   ind=-1;
   for(int i=s.length()-1;i>=0;i--){
    char c=s.charAt(i);
    if(c=='|'){
        ind=i;
    }
   nextslash[i]=ind;
    
   }
  int ans[]=new int[queries.length];
  int i=0;
  for(int b[]:queries){
      int st=nextslash[b[0]];
      int e=prevslash[b[1]];
    //   System.out.println(st+" "+e);
     
  //    System.out.println(st+" "+e);
      if(st>=e||st==-1||e==-1){
        ans[i++]=0;
        
      }
     else {ans[i++]=total-(pre[st]+last[e]);}
  }
    return ans;
    }
}