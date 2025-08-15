package com.example.outfits.model // Or your chosen package name

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Outfit(
    @StringRes val dayResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val descriptionResourceId: Int
)