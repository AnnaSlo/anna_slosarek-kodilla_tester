package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    public void testFilterChemistGroupUsernames(){
        //given
        //UsersRepository.getUsersList();

        //when
        List<String> result = UsersManager.filterChemistGroupUsernames();

        //then
        assertEquals(2, result.size());
        assertEquals(List.of("Walter White", "Gale Boetticher"), result);
    }

    @Test
    public void testfilterUsersOlderThan(){
        //given
        //UsersRepository.getUsersList();

        //when
        List<String> result = UsersManager.filterUsersOlderThan(40);

        //then
        assertEquals(4,result.size());
        assertTrue(result.contains("Walter White"));
        assertTrue(result.contains("Gus Firing"));
        assertTrue(result.contains("Gale Boetticher"));
        assertTrue(result.contains("Mike Ehrmantraut"));
    }

    @Test
    public void testfilterUsersWhichHaveMorePostThan(){
        //given
        //UsersRepository.getUsersList();

        //when
        List<String> result = UsersManager.filterUsersWhichHaveMorePostThan(5);

        //then
        assertEquals(3,result.size());
        assertTrue(result.contains("Walter White"));
        assertTrue(result.contains("Jessie Pinkman"));
        assertTrue(result.contains("Tuco Salamanca"));
    }

}
