package com.abinbev.android.tutorialdagger2.infraestructure.dagger;

import com.abinbev.android.tutorialdagger2.MainActivity;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by eltonjhony on 3/29/17.
 */
@Singleton
@Component(modules = {ServiceModule.class})
public interface ServiceComponent {

    void inject(MainActivity mainActivity);
}
