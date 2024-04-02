package com.kodilla.mockito.homework;

public class NotificationService {
    public void sendMessage(Client client, String message){
        System.out.println("Wysyłam wiadomość: " + message + " do: " + client.getName());
    }
}
