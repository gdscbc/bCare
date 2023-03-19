package com.gdscsc.bCare.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdscsc.bCare.R
import com.gdscsc.bCare.data.CareInfo
import com.gdscsc.bCare.data.careInfoData
import com.gdscsc.bCare.ui.theme.BCareTheme
import kotlinx.coroutines.launch

private const val TAG = "MenuItems"
val infoData = careInfoData

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Backdrop(infoData: List<CareInfo>) {
    var iconStateId by remember { mutableStateOf(R.drawable.ic_add_alt) }
    val scope = rememberCoroutineScope()
    val backdropScaffoldState =
        rememberBackdropScaffoldState(initialValue = BackdropValue.Concealed)
    Column {
        BackdropScaffold(scaffoldState = backdropScaffoldState, appBar = {
            TopAppBar(title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Backdrop Icon",
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = stringResource(id = R.string.app_name))
                }
            }, actions = {
                Icon(painter = painterResource(id = iconStateId),
                    contentDescription = stringResource(
                        id = R.string.add_icon_description
                    ),
                    modifier = Modifier.clickable {
                        scope.launch {
                            iconStateId = if (backdropScaffoldState.isRevealed) {
                                backdropScaffoldState.conceal()
                                R.drawable.ic_add_alt
                            } else {
                                backdropScaffoldState.reveal()
                                R.drawable.baseline_close_24
                            }
                        }
                    }

                )
            }, elevation = 0.dp)
        }, backLayerContent = { AddItems() }, frontLayerContent = {
            LazyColumn {
                items(infoData.size) { index ->
                    CareInfoItem(infoData[index])
                }
            }
        }, frontLayerShape = MaterialTheme.shapes.large
        ) {

        }
    }
}

@Composable
fun AddItems() {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Divider(color = MaterialTheme.colors.onBackground)
        MenuItem(
            modifier = Modifier.border(2.dp,MaterialTheme.colors.secondaryVariant),
            btnText = "Record Sleep",
            resourceId = R.drawable.ic_featured,
            txtColor = MaterialTheme.colors.secondaryVariant
        )
        MenuItem(
            modifier = Modifier.border(2.dp,MaterialTheme.colors.onSurface),
            btnText = "Enter nursing info",
            resourceId = R.drawable.ic_featured,
            txtColor = MaterialTheme.colors.onSurface
        )
        MenuItem(
            modifier = Modifier.border(2.dp,MaterialTheme.colors.onSecondary),
            btnText = "Change diaper",
            resourceId = R.drawable.ic_featured,
            txtColor = MaterialTheme.colors.onSecondary
        )

    }
}

@Composable
fun MenuItem(
    resourceId: Int,
    modifier: Modifier = Modifier,
    btnText: String = "Menu Item",
    txtColor: Color = MaterialTheme.colors.onSurface,
) {
    Button(onClick = {}, modifier = modifier) {
        Icon(
            modifier = Modifier
                .padding(2.dp),
            painter = painterResource(id = resourceId),
            contentDescription = stringResource(id = R.string.nurse_btn_description)
        )
        Text(
            text = btnText.uppercase(), color = txtColor, style = MaterialTheme.typography.subtitle2
        )
    }
}

@Preview
@Composable
fun BackdropTest() {
    BCareTheme {
        Backdrop(infoData)
    }
}