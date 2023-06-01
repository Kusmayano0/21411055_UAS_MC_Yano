package com.example.a21411055_uas_mc

import android.os.Parcel
import android.os.Parcelable

data class Tumbuhan (val imageSource:Int, val ImageTitle: String, val imageDecs: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSource)
        parcel.writeString(ImageTitle)
        parcel.writeString(imageDecs)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tumbuhan> {
        override fun createFromParcel(parcel: Parcel): Tumbuhan {
            return Tumbuhan(parcel)
        }

        override fun newArray(size: Int): Array<Tumbuhan?> {
            return arrayOfNulls(size)
        }
    }
}
