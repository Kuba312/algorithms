package job;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(2000D, "Patryk", 25, Job.JAVA_DEVELOPER));
        users.add(new User(3000D, "Mateusz", 26, Job.SCALA_DEVELOPER));
        users.add(new User(6000D, "Janusz", 26, Job.GROOVY_DEVELOPER));
        users.add(new User(4000D, "Maciek", 26, Job.JAVA_DEVELOPER));
        users.add(new User(4500D, "Amadeusz", 26, Job.JAVA_DEVELOPER));
        users.add(new User(5000D, "Adrian", 26, Job.KOTLIN_DEVELOPER));
        users.add(new User(12000D, "Michał", 26, Job.SCALA_DEVELOPER));

        //   streamMethod(users);

        forAndIfMethod(users);
    }

    private static void forAndIfMethod(List<User> users) {
        Map<Job, List<User>> workers = new HashMap<>();
        for (User user : users) {
            List<User> current = workers.get(user.getTypeOfJob());
            if (null == current) {
                current = new ArrayList<User>();
                workers.put(user.getTypeOfJob(), current);
            }
            current.add(user);
        }
        System.out.println("METHOD FOR AND IF:");
        workers.forEach((key, value) ->
        {
            System.out.println("TypeOfJobs: " + key + ", Users: " + value);
        });
    }

    private static void streamMethod(List<User> users) {
        EnumMap<Job, List<User>> collect = users.stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        User::getTypeOfJob, () -> new EnumMap<Job, List<User>>(Job.class),
                                        Collectors.toList()));

        System.out.println("STREAM METHOD:");
        collect.forEach((key, value) -> {
            System.out.println("TypeOfJobs: " + key + ", Users: " + value);
        });
    }
}


