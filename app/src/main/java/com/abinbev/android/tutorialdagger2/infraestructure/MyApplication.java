package com.abinbev.android.tutorialdagger2.infraestructure;

import android.app.Application;

import com.abinbev.android.tutorialdagger2.infraestructure.dagger.DaggerServiceComponent;
import com.abinbev.android.tutorialdagger2.infraestructure.dagger.ServiceComponent;
import com.abinbev.android.tutorialdagger2.infraestructure.dagger.ServiceModule;

/**
 * Created by eltonjhony on 3/29/17.
 */

public class MyApplication extends Application {

    private static ServiceComponent serviceComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDIManager();
    }

    public static ServiceComponent getDIManager() {
        return serviceComponent;
    }

    private void setupDIManager() {
        serviceComponent = DaggerServiceComponent.builder().serviceModule(new ServiceModule()).build();
    }
}
