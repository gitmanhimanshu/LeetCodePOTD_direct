class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double pr[] = new double[classes.length];
        for (int i = 0; i < pr.length; i++) {
            pr[i] = (double) classes[i][0] / classes[i][1];
        }
        double count[] = new double[classes.length];
        while (extraStudents>0) {
extraStudents--;
            for (int i = 0; i < pr.length; i++) {
                count[i] = (double) (((double)classes[i][0] + 1) / (classes[i][1] + 1));
            }
            int bestInd=0;
            double diff=0;
            for(int i=0;i<pr.length;i++){
                double d=count[i]-pr[i];
                if(d>diff){
                    bestInd=i;
                    diff=d;
                }
            }
            pr[bestInd]=count[bestInd];
            classes[bestInd][0]++;
             classes[bestInd][1]++;
        }
        double ans=0.0;

        for(int i=0;i<pr.length;i++){
                ans+=pr[i];
        }
        return ans/pr.length;
    }
}