package org.example.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

       database.insertObject();
       database.updateObject();
       database.getAllObject();
       database.removeObject();
    }
}
