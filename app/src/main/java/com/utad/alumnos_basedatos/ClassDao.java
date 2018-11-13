package com.utad.alumnos_basedatos;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ClassDao {

    @Insert
    void insert(Class clases);

    @Insert
    void insertAll(List<Class> classes);

    @Query("DELETE FROM clase")
    void deleteAll();

    @Query("SELECT * from clase")
    LiveData<List<Class>> getAllClass();
}
