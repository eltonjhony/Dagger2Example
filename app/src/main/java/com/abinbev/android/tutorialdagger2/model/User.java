package com.abinbev.android.tutorialdagger2.model;

/**
 * Created by eltonjhony on 3/29/17.
 */
public class User {

    Perfil perfil;

    public User(Perfil perfil) {
        this.perfil = perfil;
    }

    public Perfil getPerfil() {
        return perfil;
    }
}
