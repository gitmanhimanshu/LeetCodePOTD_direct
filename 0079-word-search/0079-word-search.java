class Solution {
    boolean ans=false;
    public boolean exist(char[][] board, String word) {

        int n=board.length;
        int m=board[0].length;
                boolean b[][]=new boolean[n][m];
     for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)&&b[i][j]==false){
                      if(1==word.length()){
                    ans=true;
                }
                    b[i][j]=true;
                     if(i>0){
                      find(board,b,word,i-1,j,1);  
                     }
                     if(j>0){
                        find(board,b,word,i,j-1,1);  
                       }
                       if(j<m-1){
                        find(board,b,word,i,j+1,1);  
                       }
                       if(i<n-1){
                        find(board,b,word,i+1,j,1);  
                       }
                }
                b[i][j]=false;
            }
        }
        System.out.println(ans);   
        return ans;
    }
        
 void find(char a[][],boolean b[][],String s,int i,int j,int ind){
            if(ans==true){
                return;
            }
            
            if(ind!=s.length()&&s.charAt(ind)==a[i][j]&&b[i][j]==false){
                if(ind+1==s.length()){
                    ans=true;
                }
                b[i][j]=true;
                if(i>0){
                 find(a,b,s,i-1,j,ind+1);  
                }
                if(j>0){
                   find(a,b,s,i,j-1,ind+1);  
                  }
                  if(j<a[0].length-1){
                   find(a,b,s,i,j+1,ind+1);  
                  }
                  if(i<a.length-1){
                   find(a,b,s,i+1,j,ind+1); 
            }
            b[i][j]=false;
    }
}
}