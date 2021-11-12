package com.example.school_app.database

import androidx.lifecycle.LiveData
import androidx.room.*
import retrofit2.http.GET

@Dao
interface MaterialsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addMaterial(material: Material)

    @Update
    fun updateMaterial(material: Material)

    @Delete
    fun deleteMaterial(material: Material)

    @Query("SELECT * FROM material_table ORDER BY id ASC")
    fun getAllMaterials(): LiveData<List<Material>>

    @Query("SELECT * FROM material_table ORDER BY id ASC")
    fun getAllMaterials2(): LiveData<List<Material>>
}