package com.example.root.eragames_app;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import com.onesignal.OneSignal;

/**
 * Created by root on 10/11/17.
 */

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .setNotificationOpenedHandler(new CustomNotificationOpenedHandler())
                .setNotificationReceivedHandler(new CustomNotificationRecivedHandler())
                .init();

    }

}
