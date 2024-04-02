package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        addSubscribers(client, client2, client3);

        notificationService.sendNotification(notification);
        Mockito.verify(client,Mockito.times(1)).receive(notification);
        Mockito.verify(client2,Mockito.times(1)).receive(notification);
        Mockito.verify(client3,Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
    notificationService.addSubscriber(client);
    notificationService.addSubscriber(client);
    notificationService.addSubscriber(client);

    notificationService.sendNotification(notification);

    Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client,Mockito.never()).receive(notification);
    }
    private void addSubscribers(Client... clients){
        for (Client currentClient : clients){
            notificationService.addSubscriber(currentClient);
        }
    }
}
