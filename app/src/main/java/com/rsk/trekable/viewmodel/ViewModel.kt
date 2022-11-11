package com.rsk.trekable.viewmodel

import androidx.lifecycle.ViewModel
import com.rsk.trekable.R

class ViewModel: ViewModel() {

    val images = listOf(
        R.drawable.img,
        R.drawable.img_1,
        R.drawable.img_2,
        R.drawable.img_3
    )

    val cityNames = listOf(
        "Nairobi",
        "Mombasa",
        "Kisumu",
        "Nakuru"
    )


}