package com.example.school_app.database

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "material_table")
data class Material(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id") val id: Int,
    @SerializedName("assignedDate") val assignedDate: String,
    @SerializedName("dueDate") val dueDate: String,
    @SerializedName("homeworkImageLink") val homeworkImageLink: String,
    @SerializedName("assignmentName") val assignmentName: String,
    @SerializedName("assignmentSubject") val assignmentSubject: String,
    @SerializedName("assignmentClassification") val assignmentClassificaiton: String,
): Parcelable