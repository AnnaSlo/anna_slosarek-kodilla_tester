package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void testAverageNumberOfPostsForUsers40OrOlder(){
        //given
        List<User> users = UsersRepository.getUsersList();
        //when
        double avg = ForumStats.averageNumberOfPostsForUsers40OrOlder(users);
        //then
        assertEquals(2.25, avg, 0.01);
    }

    @Test
    public void testAverageNumberOfPostsForUsersYoungerThan40(){
        //given
        List<User> users = UsersRepository.getUsersList();
        //when
        double avg = ForumStats.averageNumberOfPostsForUsersYoungerThan40(users);
        //then
        assertEquals(2382.0, avg, 0.01);
    }
    @Test
    public void testAverageForEmptyList() {
        List<User> users = Collections.emptyList();
        assertEquals(0.0, ForumStats.averageNumberOfPostsForUsers40OrOlder(users));
        assertEquals(0.0, ForumStats.averageNumberOfPostsForUsersYoungerThan40(users));
    }

    @Test
    public void testAverageWhenAllUsersYoungerThan40() {
        //given
        List<User> users = List.of(
                new User("Jessie Pinkman", 25, 10, "Sales"),
                new User("Tuco Salamanca", 34, 20, "Manager")
        );
        //then
        assertEquals(0.0, ForumStats.averageNumberOfPostsForUsers40OrOlder(users));
        assertEquals(15.0,ForumStats.averageNumberOfPostsForUsersYoungerThan40(users),0.01);
    }

    @Test
    public void testAverageWhenAllUsers40OrOlder() {
        //given
        List<User> users = List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Fring", 49, 3, "Board")
        );
        //then
        assertEquals(5.0, ForumStats.averageNumberOfPostsForUsers40OrOlder(users), 0.01);
        assertEquals(0.0, ForumStats.averageNumberOfPostsForUsersYoungerThan40(users));
    }

    @Test
   public void testAverageForMixedAgeUsers() {
        //given
        List<User> users = List.of(
                new User("Walter White", 50, 4, "Chemists"),
                new User("Jessie Pinkman", 25, 5, "Sales"),
                new User("Gus Fring", 49, 6, "Board"),
                new User("Tuco Salamanca", 34, 7, "Manager")
        );
        //then
        assertEquals(5.0, ForumStats.averageNumberOfPostsForUsers40OrOlder(users), 0.01);
        assertEquals(6.0, ForumStats.averageNumberOfPostsForUsersYoungerThan40(users), 0.01);
    }

}