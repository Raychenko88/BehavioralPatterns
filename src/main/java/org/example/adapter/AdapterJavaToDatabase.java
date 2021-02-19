package org.example.adapter;

public class AdapterJavaToDatabase extends JavaApp implements Database {

    @Override
    public void insertObject() {
        save();
    }

    @Override
    public void updateObject() {
        update();
    }

    @Override
    public void getAllObject() {
        findAll();
    }

    @Override
    public void removeObject() {
        delete();
    }
}
