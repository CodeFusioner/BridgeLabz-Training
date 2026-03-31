package streamBuzz;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class CreatorStatsUtil {

    public static List<CreatorStats> engagementBoard;

    public void registerCreator(CreatorStats record){
        engagementBoard.add(record);
    }
    public Map<String, Integer> getTopPostCounts(double likeThreshold){
        Map<String , Integer> map = new LinkedHashMap<>();
        for(CreatorStats creatorStats : engagementBoard){
            int count = 0;
            for(double likes : creatorStats.getWeeklyLikes()){
                if(likes >= likeThreshold){
                    count++;
                }
            }
            if(count > 0){
                map.put(creatorStats.getCreatorName(), count);
            }
        }
        return map;
    }

    public double calculateAverageLikes(){
        double sum = 0;
        int count = 0;
        for(CreatorStats stats : engagementBoard){
            for(double likes : stats.getWeeklyLikes()){
                sum += likes;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

}
