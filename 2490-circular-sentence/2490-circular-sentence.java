class Solution {
    public boolean isCircularSentence(String sentence) {
    //     String a[]=sentence.split(" ");
    //   if(a[a.length-1].charAt(a[a.length-1].length()-1)!=a[0].charAt(0)){
    //     return false;
    //   }
    //     for(int i=0;i<a.length-1;i++){
    //         if(a[i].charAt(a[i].length()-1)!=a[i+1].charAt(0)){
    //             return false;
    //         }
    //     }
    //     return true;
    for(int i=0;i<sentence.length();i++){
        if(sentence.charAt(i)==' '){
            if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                return false;
            }
        }
       
    }
     return sentence.charAt(0)==sentence.charAt(sentence.length()-1);
    }
}