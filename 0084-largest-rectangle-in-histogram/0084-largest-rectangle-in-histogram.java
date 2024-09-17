class Solution {
     int[] leftmax(int []heights){
    Stack<Integer> him=new Stack<>();
    int left[]=new  int [heights.length];
    for(int i=0;i<heights.length;i++){
      while(!him.isEmpty()  &&heights[him.peek()]>=heights[i]){
        him.pop();
      }
      if(him.isEmpty()){
        left[i]=-1;
      }else{
      left[i]=him.peek();
      }
      him.add(i);
    }
    return left;
     }
   int[] rightmax(int []heights){
    Stack<Integer> him=new Stack<>();
    int right[]=new  int [heights.length];
    for(int i=right.length-1;i>=0;i--){
      while(!him.isEmpty()  &&heights[(him.peek())]>=heights[i]){
        him.pop();
      }
      if(him.isEmpty()){
       right[i]=right.length;
      }else{
     right[i]=him.peek();
      }
      him.add(i);
    }
    return right;
  }
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int r[]=rightmax(heights);
        int []l=leftmax(heights);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(l));
        for(int i=0;i<heights.length;i++){
            int t=(r[i]-l[i]-1)*heights[i];
            ans=t>ans?t:ans;
        }
        return ans;
    }
}