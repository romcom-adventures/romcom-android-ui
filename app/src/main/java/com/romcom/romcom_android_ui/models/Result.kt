package com.romcom.romcom_android_ui.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int

)