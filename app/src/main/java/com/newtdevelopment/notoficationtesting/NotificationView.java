package com.newtdevelopment.notoficationtesting;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jeremy on 9/9/2017.
 */

public class NotificationView extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
    }
}
