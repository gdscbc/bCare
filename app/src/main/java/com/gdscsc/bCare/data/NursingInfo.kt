package com.gdscsc.bCare.data

import com.gdscsc.bCare.utils.InfoDate
import java.time.LocalDateTime

data class NursingInfo(
    var startTime: LocalDateTime, // Using Temporal just to produce random date date using the LocalDate/Time
    var endTime: LocalDateTime,
    var side: String, // Just to track the last side used to nurse the baby
    var date: InfoDate = InfoDate(startTime),
)
