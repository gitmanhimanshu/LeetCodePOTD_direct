class Twitter {

    Map<Integer, PriorityQueue<Tweet>> him;
    int time = 0;
    Map<Integer, Set<Integer>> fol;

    class Tweet implements Comparable<Tweet> {
        int tweetId;
        int time;

        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }

        public int compareTo(Tweet that) {
            return that.time - this.time;
        }
    }

    public Twitter() {
        him = new HashMap<>();
        fol = new HashMap<>();
        
    }

    public void postTweet(int userId, int tweetId) {
        if(him.containsKey(userId)){
            him.get(userId).add(new Tweet(tweetId,time++));
            return;
        }
        him.put(userId,new PriorityQueue<>());

        him.get(userId).add(new Tweet(tweetId,time++));

    }

  public List<Integer> getNewsFeed(int userId) {
    PriorityQueue<Tweet> pq = new PriorityQueue<>(); // max heap by time
    List<Integer> ans = new ArrayList<>();

    // add user's own tweets
    if (him.containsKey(userId)) {
        pq.addAll(him.get(userId));
    }

    // add followees tweets
    if (fol.containsKey(userId)) {
        for (int followee : fol.get(userId)) {
            if (him.containsKey(followee)) {
                pq.addAll(him.get(followee));
            }
        }
    }

    // take top 10 recent
    int i = 0;
    while (i < 10 && !pq.isEmpty()) {
        ans.add(pq.poll().tweetId);
        i++;
    }
    return ans;
}

    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId){
            return;
        }
        if(fol.get(followerId)==null){
            fol.put(followerId,new HashSet<>());
        }
        fol.get(followerId).add(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {
        if(followerId==followeeId){
            return;
        }
        if(fol.get(followerId)==null){
            return;
        }
        fol.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */