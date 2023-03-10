package com.gdscsc.bCare.data

import com.gdscsc.bCare.utils.InfoDate
import java.time.LocalDateTime

data class SleepInfo(
    var startTime: LocalDateTime,
    var endTime: LocalDateTime,
    var selfWokeUP: Boolean,
    var date: InfoDate = InfoDate(startTime)
)
