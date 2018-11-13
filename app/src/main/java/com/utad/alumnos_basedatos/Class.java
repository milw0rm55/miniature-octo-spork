package com.utad.alumnos_basedatos;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

@Entity(tableName = "clase")
public class Class {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "Nombre")
    private String mNombre;

    @ColumnInfo(name= "Profesor")
    private String mProfesor;

    @ColumnInfo(name = "Nota")
    private String mNotaMedia;

    @ColumnInfo(name = "Numero_Horas")
    private String mNumeroHoras;

    @ColumnInfo(name = "Numero_Alumnos")
    private String mNumeroAlumnos;




    public Class(String id) {
        mId = id;
    }

    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    public String getProfesor() {
        return mProfesor;
    }

    public void setProfesor(String profesor) {
        mProfesor = profesor;
    }
    public String getNotaMedia() {
        return mNotaMedia;
    }

    public void setNotaMedia(String nota) {
        mNotaMedia = nota;
    }

    public void setNumeroHoras(String horas) {
        this.mNumeroHoras = horas;
    }

    public String getNumeroHoras() {
        return mNumeroHoras;
    }

    public String getNumeroAlumnos() {
        return mNumeroAlumnos;
    }

    public void setNumeroAlumnos(String mNumeroAlumnos) {
        this.mNumeroAlumnos = mNumeroAlumnos;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String mNombre) {
        this.mNombre = mNombre;
    }
}