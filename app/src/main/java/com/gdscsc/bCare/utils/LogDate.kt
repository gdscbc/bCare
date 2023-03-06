package com.gdscsc.bCare.utils

import java.text.SimpleDateFormat
import java.util.*

class LogDate {
    var dayName: String
    var dayNum: String
    var month: String
    var year: String

    init {
        val date = Date()
        var dateFormat = SimpleDateFormat("MM-dd-E-y")
        var dateString: String = dateFormat.format(date)
        val dateParts = dateString.split("-")
        dayName = dateParts[2]
        dayNum = dateParts[1]
        month = dateParts[0]
        year = dateParts[3]
    }
}