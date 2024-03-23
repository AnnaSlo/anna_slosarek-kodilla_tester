package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> usersOlderThan = filterUsersOlderThan(40);
        System.out.println(usersOlderThan);
        List<String> usersWithMorePostThan = filterUsersWhichHaveMorePostThan(5);
        System.out.println(usersWithMorePostThan);
    }

    public static List<String> filterChemistGroupUsernames(){
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

         return usernames;
    }

    public static List<String> filterUsersOlderThan(int age) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<String> filterUsersWhichHaveMorePostThan(int numberOfPost) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPost)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }


    public static String getUserName(User user) {
        return user.getUsername();
    }
}
