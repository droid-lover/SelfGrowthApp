package com.nmb.practice

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

data class Fruit (
    val id: Int,
    val name: String
) : Serializable


@Parcelize
data class Fruit2(
    val id: Int,
    val name: String
) : Parcelable

data class Fruit1(
    val id: Int,
    val name: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()?:""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fruit1> {
        override fun createFromParcel(parcel: Parcel): Fruit1 {
            return Fruit1(parcel)
        }

        override fun newArray(size: Int): Array<Fruit1?> {
            return arrayOfNulls(size)
        }
    }
}
