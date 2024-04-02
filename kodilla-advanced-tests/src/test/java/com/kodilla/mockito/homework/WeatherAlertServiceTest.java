package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class WeatherAlertServiceTest {


    NotificationService notificationService = Mockito.mock(NotificationService.class);
      @Test
    public void shouldAddSubscriber(){
        //given
        Client client = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        //when
        weatherAlertService.addSubscriber(location, client);
        //then
        assertEquals(1,weatherAlertService.getNotification().size());
        assertEquals(List.of(client), weatherAlertService.getNotification().get(location));
    }

    @Test
    public void shouldRemoveSubscriber(){
        // given
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        weatherAlertService.addSubscriber(location, client);
        weatherAlertService.addSubscriber(location, client2);
        //when
        weatherAlertService.removeSubscriber(location,client2);
        //then
        assertEquals(1,weatherAlertService.getNotification().size());
        assertEquals(List.of(client), weatherAlertService.getNotification().get(location));
        }

    @Test
    public void shouldremoveSubscriberFromAllLocations(){
        //given
        Client client = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        weatherAlertService.addSubscriber(location, client);
        weatherAlertService.addSubscriber(location2, client);
        //when
        weatherAlertService.removeSubscriberFromAllLocations(client);
        //then
        assertEquals(0, weatherAlertService.getNotification().get(location).size());
        assertEquals(0, weatherAlertService.getNotification().get(location2).size());

    }

    @Test
    public void shouldSendNotification(){
        //given
        Client client = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        weatherAlertService.addSubscriber(location, client);
        //when
        weatherAlertService.sendNotification(location,"Będzie padać");
        //then
        Mockito.verify(notificationService).sendMessage(client,"Będzie padać");
    }

    @Test
    public void shouldSendNotificationToAll(){
        //given
        Client client = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        weatherAlertService.addSubscriber(location, client);
        weatherAlertService.addSubscriber(location, client2);
        weatherAlertService.addSubscriber(location, client3);
        //when
        weatherAlertService.sendNotificationToAll("Będzie padać");
        //then
        Mockito.verify(notificationService, Mockito.times(3)).sendMessage(Mockito.any(), Mockito.anyString());
    }

    @Test
    public void shouldRemoveLocation(){
       //given
        Client client = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        WeatherAlertService weatherAlertService = new WeatherAlertService(notificationService);
        weatherAlertService.addSubscriber(location, client);
        //when
        weatherAlertService.removeLocation(location);
        //then
        assertEquals(0, weatherAlertService.getNotification().size());
        assertNull(weatherAlertService.getNotification().get(location));
    }
}