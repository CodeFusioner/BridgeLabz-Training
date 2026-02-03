package streamApi;

import java.time.LocalDate;
import java.util.List;
import static java.lang.System.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
    @Override
    public String toString() {
        return name + " expires on " + expiryDate;
    }
}

public class GymDemo {
    public static void main(String[] args) {
        List<GymMember> members = List.of(
                new GymMember("A", LocalDate.now().plusDays(10)),
                new GymMember("B", LocalDate.now().plusDays(40)),
                new GymMember("C", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        members.stream().filter(m -> !m.expiryDate.isBefore(today)
                && m.expiryDate.isBefore(next30Days)).forEach(out::println);
    }
}
