package com.gdscsc.bCare.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdscsc.bCare.R
import com.gdscsc.bCare.ui.theme.BCareTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Backdrop() {
    var iconStateId by remember { mutableStateOf(R.drawable.ic_add_alt) }
    val scope = rememberCoroutineScope()
    val backdropScaffoldState =
        rememberBackdropScaffoldState(initialValue = BackdropValue.Concealed)
    BackdropScaffold(scaffoldState = backdropScaffoldState, appBar = {
        TopAppBar(title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.child_care_48px),
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
        Text(text = "This is the content of the front layer", modifier = Modifier.padding(8.dp))
    }, frontLayerShape = MaterialTheme.shapes.large
    ) {

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
        MenuItem(btnText = "Enter nursing info", resourceId = R.drawable.breastfeeding_48px)
        MenuItem(btnText = "Record Sleep", resourceId = R.drawable.bed_48px)
        MenuItem(btnText = "Change diaper", resourceId = R.drawable.baseline_dirty_lens_24)

    }
}
@Composable
fun MenuItem(btnText: String = "Menu Item", resourceId: Int) {
    Button(onClick = {}) {
        Icon(painter = painterResource(id = resourceId), contentDescription = stringResource(id = R.string.nurse_btn_description))
        Text(text = btnText.uppercase(), style = MaterialTheme.typography.subtitle2)
    }
}

@Preview
@Composable
fun BackdropTest() {
    BCareTheme {
        Backdrop()
    }
}