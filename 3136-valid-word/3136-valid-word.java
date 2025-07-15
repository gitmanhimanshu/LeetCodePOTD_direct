class Solution {
    public boolean isValid(String word) {
        int v=0;
        int c=0;
        if(word.length()<3){
            return false;
        }

        for(char i:word.toCharArray()){
            if(!(i>='A'&&i<='Z')&&!(i>='a'&&i<='z')&&!(i>='0'&&i<='9')){
                return false;
            }
           else if(i=='a'||i=='e'||i=='o'||i=='u'||i=='i'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                v++;
            }
            else if((i>='a'&&i<='z')||(i>='A'&&i<='Z')){
                c++;
            }
        }
        System.out.println(c+" "+v);
        return c>=1&&v>=1;
    }
}