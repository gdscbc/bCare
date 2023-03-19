package com.gdscsc.bCare.data

import java.time.LocalDateTime
import kotlin.random.Random

val careInfoData = mutableListOf(

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),

    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),    CareInfo(
        InfoType.NURSING,
        NursingInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            side = if (Random(System.currentTimeMillis()).nextLong(0, 20) > 10) "L" else "R",

            ), DpChangeInfo(
            date = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)).plusMinutes(15),
            isWet = false
        ), SleepInfo(
            startTime = LocalDateTime.now().minusDays(5)
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 100)),
            endTime = LocalDateTime.now()
                .plusMinutes(Random(System.currentTimeMillis()).nextLong(5, 7200)),
            selfWokeUP = true,
        ),
    ),
)