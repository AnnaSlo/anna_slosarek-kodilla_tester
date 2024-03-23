package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
       List<User> users = UsersRepository.getUsersList();

       System.out.println("Średnia liczba postów dla użytkowników 40 lat lub starszych: " + ForumStats.averageNumberOfPostsForUsers40OrOlder(users));

       System.out.println("Średnia liczba postów dla użytkowników młodszych niż 40 lat: " + ForumStats.averageNumberOfPostsForUsersYoungerThan40(users));
    }
    public static double averageNumberOfPostsForUsers40OrOlder(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double averageNumberOfPostsForUsersYoungerThan40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

}
