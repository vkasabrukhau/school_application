package com.example.school_app.database

import androidx.lifecycle.LiveData

class DataRepository(private val materialsDao: MaterialsDao) {
    suspend fun addMaterialLocal(material: Material){
        materialsDao.addMaterial(material)
    }

    suspend fun updateMaterialLocal(material: Material){
        materialsDao.updateMaterial(material)
    }

    suspend fun deleteMaterialLocal(material: Material){
        materialsDao.deleteMaterial(material)
    }

    fun getAllMaterials(): LiveData<List<Material>>{
        return materialsDao.getAllMaterials()
    }
}