package com.utad.alumnos_basedatos;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class ClassRepository {
    private ClassDao mClassDao;
    private LiveData<List<Class>> mAllClass;

    ClassRepository(Application application){
        ClassRoomDatabase db = ClassRoomDatabase.getDatabase(application);
        mClassDao = db.classDao();
        mAllClass = mClassDao.getAllClass();
    }
    LiveData<List<Class>> getAllClass(){
        return mAllClass;
    }

    public void insert(Class clase){
        new insertAsyncTask(mClassDao).execute(clase);
    }
    private static class insertAsyncTask extends AsyncTask<Class, Void, Void>{
        private ClassDao mAsyncTaskDao;
        insertAsyncTask(ClassDao dao){ mAsyncTaskDao = dao;}

        @Override
        protected Void doInBackground(Class... classes){
            mAsyncTaskDao.insert(classes[0]);
            return null;
        }
    }
}
