package com.abinbev.android.tutorialdagger2.infraestructure.dagger;

import com.abinbev.android.tutorialdagger2.model.Perfil;
import com.abinbev.android.tutorialdagger2.model.PerfilFree;
import com.abinbev.android.tutorialdagger2.model.PerfilPremium;
import com.abinbev.android.tutorialdagger2.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by eltonjhony on 3/29/17.
 */
@Module
public class ServiceModule {

    @Provides @Singleton
    Perfil providePerfil() {
        return new PerfilPremium();
    }

    @Provides @Singleton
    PerfilFree providePerfilFree() {
        return new PerfilFree();
    }

    @Provides @Singleton
    User provideUser() {
        return new User(new PerfilPremium());
    }
}
