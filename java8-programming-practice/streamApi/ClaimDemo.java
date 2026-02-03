package streamApi;

import java.util.List;
import java.util.Map;

import static java.lang.System.*;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType(){
        return type;
    }
    public double getAmount(){
        return double;
    }
}

public class ClaimDemo {
    public static void main(String[] args) {
        List<Claim> claims = List.of(
                new Claim("Health", 20000),
                new Claim("Health", 15000),
                new Claim("Vehicle", 10000),
                new Claim("Vehicle", 12000),
                new Claim("Life", 50000)
        );
        Map<String, Double> avg=claims.stream()
                .collect(groupingBy(Claim::getType,averagingDouble(Claim::getAmount)));
        avg.forEach(
                (k,v)->System.out.println(k+"->"+v)
        );
    }
}
