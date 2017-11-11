package com.example.root.eragames_app;

import android.util.Log;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

/**
 * Created by root on 10/11/17.
 */

public class CustomNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {
    @Override
    public void notificationOpened(OSNotificationOpenResult result) {
        JSONObject data = result.notification.payload.additionalData;

        if (data != null){
            Log.i("Log","Notificação Aberta" + data);
        }
    }
}
