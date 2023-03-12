package com.gdscsc.bCare.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gdscsc.bCare.data.CareInfo
import com.gdscsc.bCare.data.careInfoData
import com.gdscsc.bCare.ui.theme.BCareTheme

val data = careInfoData
@Composable
fun CareInfoItem(info: CareInfo) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(weight = 0.2F)) {

        }
    }
}

@Preview
@Composable
fun CareInfoItemPreview() {
    BCareTheme {
        CareInfoItem(info = data[0])
    }
}