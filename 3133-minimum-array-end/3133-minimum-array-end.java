class Solution {

    public long minEnd(int n, int x) {
        String s = binary_decimalch(x); 
        int i = s.length() - 1;
        char[] a = new char[64];
        int j = a.length - 1;

       
        while (i >= 0) {
            a[j--] = s.charAt(i--);
        }
        while (j >= 0) {
            a[j--] = '0'; }

       
        String b = binary_decimalch(n - 1);
        j = b.length() - 1;
        i = a.length - 1;

      
        while (i >= 0 && j >= 0) {
            if (a[i] == '0') {
                a[i] = b.charAt(j);
                j--;
            }
            i--;
        }

        
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        
        long ans = 0;
        j = 0;
        for (i = a.length - 1; i >= 0; i--) {
            ans += (a[i] - '0') * ((long) Math.pow(2, j));
            j++;
        }
        System.out.println(ans);
        return ans;
    }

    
    String binary_decimalch(int n) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.append(n % 2);
            n = n / 2;
        }
        return ans.reverse().toString();
    }
}

