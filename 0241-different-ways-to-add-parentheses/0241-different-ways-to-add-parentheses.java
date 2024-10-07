class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> him=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'){
                List<Integer> l=diffWaysToCompute(expression.substring(0,i));
                 List<Integer> r=diffWaysToCompute(expression.substring(i+1));
                for(Integer j:l){
                    for(Integer k:r){
                        if(expression.charAt(i)=='+'){
                            him.add(j+k);
                        }
                        if(expression.charAt(i)=='-'){
                            him.add(j-k);
                        }
                         if(expression.charAt(i)=='*'){
                            him.add(j*k);
                        }
                    }
                }
            }
        }
        if(him.isEmpty()){
            him.add(Integer.parseInt(expression));
        }
        return him;
    }
}