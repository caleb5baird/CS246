package cBaird;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TweetLoader {
    private Twitter twitter;

    public TweetLoader() {
        configureKeys();
    }

    private void configureKeys() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("NqvVTCbn2FMUVG7dAh6sk3U3u")
                .setOAuthConsumerSecret("tmKuOp4xKMjD3NozsX37rQa9Ruer17Fpy1UlJA5fAlgjKSSlVb")
                .setOAuthAccessToken("994430087243051008-pq7S1JKHS7Ka1Z7xFW96GmxRZgeUIcz")
                .setOAuthAccessTokenSecret("xE8bOGQW3Kvt3VCc4jjYOAhvloSZUlixJJRo7RHXkTWkT")
                .setJSONStoreEnabled(true);


        TwitterFactory tf = new TwitterFactory(cb.build());
        this.twitter = tf.getInstance();
    }

    public Map<String, BYUITweet> retreiveTweetsWithHashTag(String hashtag) {
        HashMap<String, BYUITweet> map = new HashMap<>();
//        Query query = new Query(hashtag);
//        try {
//            QueryResult qr = twitter.search(query);
//            Query q = qr.nextQuery();
//            while (q != null){
//                //TODO
//                map.put(q.get)
//                q = qr.nextQuery();
//            }
//        } catch(TwitterException te) {
//
//        }
        try {
            Query query = new Query(hashtag);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
        return map;
    }
}
