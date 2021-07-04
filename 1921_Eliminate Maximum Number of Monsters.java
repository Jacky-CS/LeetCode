class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int time[] = new int[dist.length];
        for(int i=0;i<dist.length;i++){
            // time[i] = (int)Math.ceil(dist[i]/(float)speed[i]);
            time[i] =  (dist[i] + speed[i] - 1) / speed[i];
        }
        Arrays.sort(time);
        int i = 1;
        while(i<time.length){
            if(i>=time[i]) return i;
            i++;
        }
        return i;
    }
}
