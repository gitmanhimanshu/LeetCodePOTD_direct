class Solution {
    public int findTheWinner(int n, int k) {
    return find(n,k)+1;
    }
    int find(int n,int k){
    if (n == 1) {
            return 0;
        }

        int x = find(n - 1, k);
        return (x + k) % n;
    }
}