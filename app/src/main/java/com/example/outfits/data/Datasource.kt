/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.outfits.data

import com.example.outfits.R
import com.example.outfits.model.Outfit

/**
 * [Datasource] generates a list of [Outfit]
 */
class Datasource() {
    fun loadOutfits(): List<Outfit> {
        return listOf<Outfit>(
            Outfit(R.string.day1, imageResourceId=R.drawable.outfit1, descriptionResourceId=R.string.outfit1),
            Outfit(R.string.day2, imageResourceId=R.drawable.outfit2, descriptionResourceId=R.string.outfit2),
            Outfit(R.string.day3, imageResourceId=R.drawable.outfit3, descriptionResourceId=R.string.outfit3),
            Outfit(R.string.day4, imageResourceId=R.drawable.outfit4, descriptionResourceId=R.string.outfit4),
            Outfit(R.string.day5, imageResourceId=R.drawable.outfit5, descriptionResourceId=R.string.outfit5),
            Outfit(R.string.day6, imageResourceId=R.drawable.outfit6, descriptionResourceId=R.string.outfit6),
            Outfit(R.string.day7, imageResourceId=R.drawable.outfit7, descriptionResourceId=R.string.outfit7),
            Outfit(R.string.day8, imageResourceId=R.drawable.outfit8, descriptionResourceId=R.string.outfit8),
            Outfit(R.string.day9, imageResourceId=R.drawable.outfit9, descriptionResourceId=R.string.outfit9),
            Outfit(R.string.day10, imageResourceId=R.drawable.outfit10, descriptionResourceId=R.string.outfit10),
            Outfit(R.string.day11, imageResourceId=R.drawable.outfit11, descriptionResourceId=R.string.outfit11),
            Outfit(R.string.day12, imageResourceId=R.drawable.outfit12, descriptionResourceId=R.string.outfit12),
            Outfit(R.string.day13, imageResourceId=R.drawable.outfit13, descriptionResourceId=R.string.outfit13),
            Outfit(R.string.day14, imageResourceId=R.drawable.outfit14, descriptionResourceId=R.string.outfit14),
            Outfit(R.string.day15, imageResourceId=R.drawable.outfit15, descriptionResourceId=R.string.outfit15),
            Outfit(R.string.day16, imageResourceId=R.drawable.outfit16, descriptionResourceId=R.string.outfit16),
            Outfit(R.string.day17, imageResourceId=R.drawable.outfit17, descriptionResourceId=R.string.outfit17),
            Outfit(R.string.day18, imageResourceId=R.drawable.outfit18, descriptionResourceId=R.string.outfit18),
            Outfit(R.string.day19, imageResourceId=R.drawable.outfit19, descriptionResourceId=R.string.outfit19),
            Outfit(R.string.day20, imageResourceId=R.drawable.outfit20, descriptionResourceId=R.string.outfit20),
            Outfit(R.string.day21, imageResourceId=R.drawable.outfit21, descriptionResourceId=R.string.outfit21),
            Outfit(R.string.day22, imageResourceId=R.drawable.outfit22, descriptionResourceId=R.string.outfit22),
            Outfit(R.string.day23, imageResourceId=R.drawable.outfit23, descriptionResourceId=R.string.outfit23),
            Outfit(R.string.day24, imageResourceId=R.drawable.outfit24, descriptionResourceId=R.string.outfit24),
            Outfit(R.string.day25, imageResourceId=R.drawable.outfit25, descriptionResourceId=R.string.outfit25),
            Outfit(R.string.day26, imageResourceId=R.drawable.outfit26, descriptionResourceId=R.string.outfit26),
            Outfit(R.string.day27, imageResourceId=R.drawable.outfit27, descriptionResourceId=R.string.outfit27),
            Outfit(R.string.day28, imageResourceId=R.drawable.outfit28, descriptionResourceId=R.string.outfit28),
            Outfit(R.string.day29, imageResourceId=R.drawable.outfit29, descriptionResourceId=R.string.outfit29),
            Outfit(R.string.day30, imageResourceId=R.drawable.outfit30, descriptionResourceId=R.string.outfit30))
    }
}
