class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans=new ArrayList<>();
        solve(0,num,target,ans,"",0L,0L);
        return ans;
    }

    void solve(int ind,String num,int target,List<String> ans,String path,long total,long prev){
    if (ind==num.length())
{        if(total==target){
            ans.add(path);
        }
        return;
        }

        for(int i=ind;i<num.length();i++){
             if (i > ind && num.charAt(ind) == '0') break;

            String part = num.substring(ind, i + 1);
            long curr = Long.parseLong(part);
            if(ind==0){
                solve(i+1,num,target,ans,part,curr,curr);
            }else{
                 solve(i + 1, num, target, ans,
                      path + "+" + part,
                      total + curr,
                      curr);
                solve(i + 1, num, target, ans,
                      path + "-" + part,
                      total - curr,
                      -curr);   
                solve(i + 1, num, target, ans,
                      path + "*" + part,
                      total - prev + (prev * curr),
                      prev * curr);
            }

        }
    }
}