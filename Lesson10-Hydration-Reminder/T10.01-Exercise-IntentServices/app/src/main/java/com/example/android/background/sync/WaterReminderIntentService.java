package com.example.android.background.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class WaterReminderIntentService extends IntentService {

    public WaterReminderIntentService() {
        super(WaterReminderIntentService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent == null) return;
        ReminderTasks.executeTask(this, intent.getAction());
    }
}