package streamBuzz;

import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreatorStatsUtil creatorStatsUtil = new CreatorStatsUtil();
        boolean running = true;
        while(running){

            System.out.println("1. Register user");
            System.out.println("2. GetTopPostCount");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");

            System.out.println("\nEnter your choice:");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter creator name: ");
                    String creatorName = sc.nextLine();

                    double [] weeklyLikes = new double[4];
                    for(int i=0;i<weeklyLikes.length;i++){
                        weeklyLikes[i] = sc.nextDouble();
                    }

                    CreatorStats creatorStats = new CreatorStats(creatorName, weeklyLikes);
                    creatorStatsUtil.registerCreator(creatorStats);
                    System.out.println("Creator registered successfully.");
                    break;

                case 2:
                    System.out.print("Enter like threshold: ");
                    double threshold = sc.nextDouble();
                    Map<String, Integer> map = creatorStatsUtil.getTopPostCounts(threshold);
                    if(map.isEmpty()){
                        System.out.println("No top-performing posts this week\n");
                    }else{
                        for(Map.Entry<String , Integer> entry : map.entrySet()){
                            System.out.println(entry.getKey() + " " + entry.getValue());
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Overall average weekly likes: " + creatorStatsUtil.calculateAverageLikes());
                    break;
                case 4:
                    System.out.println("Logging off — Keep Creating with StreamBuzz!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
