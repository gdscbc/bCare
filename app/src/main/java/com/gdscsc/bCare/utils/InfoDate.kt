package com.gdscsc.bCare.utils

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.temporal.Temporal
import java.util.*
/*Date formatting utility class for CareInfo. The startDate can either come from recording a sleep, nursing, or diaper change event*/
class InfoDate (startTime: LocalDateTime?) {
    var dayName: String
    var dayNum: String
    var month: String
    var year: String

    init {
        val date = Date.from(startTime?.toInstant(ZoneOffset.UTC ))
        val dateFormat = SimpleDateFormat("MM-dd-E-", Locale.getDefault()) // Needs to test with different locales
        val dateString: String = dateFormat.format(date)
        val dateParts = dateString.split("-")
        dayName = dateParts[2]
        dayNum = dateParts[1]
        month = dateParts[0]
        year = dateParts[3]
    }

    override fun equals(other: Any?): Boolean = other is InfoDate
            && other.dayNum == this.dayNum
            && other.month == this.month
            && other.year == this.year

    override fun hashCode(): Int {
        var result = dayNum.hashCode()
        result = 31 * result + month.hashCode()
        result = 31 * result + year.hashCode()
        return result
    }
}