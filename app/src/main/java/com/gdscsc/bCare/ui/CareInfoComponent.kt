package com.gdscsc.bCare.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdscsc.bCare.R
import com.gdscsc.bCare.data.CareInfo
import com.gdscsc.bCare.data.careInfoData
import com.gdscsc.bCare.ui.theme.BCareTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CareInfoItem(info: CareInfo, modifier: Modifier = Modifier) {

    Card(
        onClick = {},
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            // Colum to contain the date: DayString, DayNumber, and MonthString
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                info.date?.dayName?.let { Text(text = it) }
                info.date?.dayNum?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.h4,
                        color = MaterialTheme.colors.primaryVariant
                    )
                }
                info.date?.month?.let { Text(text = it) }
            }
            Spacer(modifier = Modifier.padding(4.dp))
            // A vertical divider
            Divider(
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(1.dp),
                thickness = 1.dp
            )
            Spacer(modifier = Modifier.padding(4.dp))
            // Column containing the specific info history: sleep, nursing, and dp change info
            Column {
                Text(
                    text = stringResource(id = R.string.time_slept, info.totalSleepTime),
                    color = MaterialTheme.colors.secondaryVariant
                )
                Text(
                    text = stringResource(
                        id = R.string.time_nursed, info.totalNursingTime.toString()
                    ),
                    color = MaterialTheme.colors.onSurface
                )
                Text(
                    text = stringResource(
                        id = R.string.diaper_changed,
                        info.totalSleepTime.toString()
                    ),
                    color = MaterialTheme.colors.onSecondary
                )
            }
        }


    }


}

@Preview
@Composable
fun CareInfoPreview() {
    BCareTheme {
        CareInfoItem(info = careInfoData[0])
    }
}