class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        ans=0
        for i in range (len(mat)):
            for j in range (len(mat[0])):
                if mat[i][j]==1:
                    if self.isSpecial(i,j,mat):
                        ans+=1
        return ans
    def isSpecial(self,r:int,c:int,mat:List[List[int]]) ->  bool:
        for i in range(len(mat)):
            if r==i:
                continue
            if mat[i][c]==1:
                return False
        
        for i in range(len(mat[0])):
            if c==i:
                continue
            if mat[r][i]==1:
                return False
        return True
        

        








# class Solution {
#     public int numSpecial(int[][] mat) {
#         int ans = 0;
#         for (int i = 0; i < mat.length; i++) {
#             for (int j = 0; j < mat[0].length; j++) {
#             if (mat[i][j]==1){
#                 if (isSpecial(i, j, mat)) {
#                     ans++;
#                 }
#             }
#             }
#         }
#         return ans;
#     }

#     boolean isSpecial(int r,int c,int mat[][]){
#     for(int i=0;i<mat[0].length;i++){
#             if(i==c){
#             continue;
#             }
#             if(mat[r][i]==1){
#             return false;
#             }
            
#             }
#     for(int i=0;i<mat.length;i++){
#             if(i==r){
#             continue;
#             }
#             if(mat[i][c]==1){
#             return false;
#             }
            
#             }
#             return true;
#     }

# }