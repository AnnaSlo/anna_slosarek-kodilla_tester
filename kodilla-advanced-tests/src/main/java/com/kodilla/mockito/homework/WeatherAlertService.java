package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlertService {
    private Map<Location, List<Client>> notification = new HashMap<>();
    private NotificationService notificationService;

    public WeatherAlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addSubscriber(Location location, Client client){
        List<Client> clients = notification.getOrDefault(location,new ArrayList<>());
        clients.add(client);
        notification.put(location,clients);
    }

    public void removeSubscriber(Location location, Client client){
        List<Client> clients = notification.getOrDefault(location, new ArrayList<>());
        clients.remove(client);
        notification.put(location,clients);
    }

    public void  removeSubscriberFromAllLocations(Client client){
        notification.forEach((location, clients) -> removeSubscriber(location,client));
    }

    public void sendNotification(Location location, String message){
        notification.getOrDefault(location, new ArrayList<>())
                .forEach(client -> notificationService.sendMessage(client,message));
    }

    public void sendNotificationToAll(String message){
        notification.forEach((location, clients) -> sendNotification(location,message));
    }

    public void removeLocation(Location location){
        notification.remove(location);
    }

    public Map<Location, List<Client>> getNotification() {
        return notification;
    }
}
