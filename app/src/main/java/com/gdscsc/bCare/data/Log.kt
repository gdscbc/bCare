package com.gdscsc.bCare.data

import com.gdscsc.bCare.utils.LogDate

data class Log(
    val date: LogDate,
    val nursingInfo: String,
    val sleepingInfo: String,
    val diaperChangeInfo: String
)
