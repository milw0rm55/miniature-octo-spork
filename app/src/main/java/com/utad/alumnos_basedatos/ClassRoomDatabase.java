package com.utad.alumnos_basedatos;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Class.class}, version = 1)
public abstract class ClassRoomDatabase extends RoomDatabase {
    public abstract ClassDao classDao();

    private static ClassRoomDatabase INSTANCE;

    static ClassRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ClassRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ClassRoomDatabase.class, "Clases_DataBase").fallbackToDestructiveMigration().build();
                }
            }
        }
        return INSTANCE;
    }
}

