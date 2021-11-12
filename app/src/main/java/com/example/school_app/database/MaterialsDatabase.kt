package com.example.school_app.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class MaterialsDatabase : RoomDatabase() {
    abstract fun materialDao(): MaterialsDao

    companion object {
        @Volatile
        private var INSTANCE: MaterialsDatabase? = null
        fun getDatabase(context: Context): MaterialsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    MaterialsDatabase::class.java,
                    "material_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}