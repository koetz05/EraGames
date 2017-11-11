package com.example.root.eragames_app;

import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by root on 10/11/17.
 */

public class CustomNotificationRecivedHandler implements OneSignal.NotificationReceivedHandler {

    @Override
    public void notificationReceived(OSNotification notification) {
        JSONObject data = notification.payload.additionalData;
        if (data != null){
            Log.i("Log","Notificação Aberta" + data);
        }
    }
}
