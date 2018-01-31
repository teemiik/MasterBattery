package com.masterclean.system.app.Application;

import android.app.Application;

import com.onesignal.OneSignal;
import com.system.app.R;
import com.yandex.metrica.YandexMetrica;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Инициализация AppMetrica SDK
        YandexMetrica.activate(getApplicationContext(), getString(R.string.app_metrica));
        // Отслеживание активности пользователей
        YandexMetrica.enableActivityAutoTracking(this);

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
