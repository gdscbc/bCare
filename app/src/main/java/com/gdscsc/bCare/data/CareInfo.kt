package com.gdscsc.bCare.data

import com.gdscsc.bCare.utils.InfoDate

data class CareInfo(
    val infoType: InfoType,
    val nursingInfo: NursingInfo? = null,
    val dpChangeInfo: DpChangeInfo? = null,
    val sleepInfo: SleepInfo? = null,
    var date: InfoDate? = null,
    var totalSleepTime: Int = 0,
    var totalNursingTime: Int = 0,
    var diaperChangeTimes: Int = 0,
)
{
    init {
        when(infoType){
            InfoType.SLEEPING -> {this.date = InfoDate(sleepInfo?.startTime)
            }
            InfoType.NURSING -> {this.date = InfoDate(nursingInfo?.startTime)
            }
            else -> {this.date = InfoDate(dpChangeInfo?.date)
            }
        }
    }
    fun updateSleepTime(minutes: Int) {
        totalNursingTime += minutes
    }
    fun updateNursingTime(minutes: Int) {
        totalNursingTime += minutes
    }
    fun updateDiaperChange() {
        diaperChangeTimes++
    }

    override fun equals(other: Any?): Boolean = other is CareInfo && other.date!! == this.date
    override fun hashCode(): Int {
        return date?.hashCode() ?: 0
    }
}