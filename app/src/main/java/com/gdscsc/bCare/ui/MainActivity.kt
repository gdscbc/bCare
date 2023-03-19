package com.gdscsc.bCare.ui

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gdscsc.bCare.R
import com.gdscsc.bCare.ui.theme.BCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BCareTheme {
                ConstraintLayout {
                    Backdrop(infoData = infoData)
                    val fab = createRef()
                    FloatingActionButton(
                        onClick = {
                            Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this@MainActivity, CareActivity::class.java))
                                  },
                        modifier = Modifier.constrainAs(fab) {
                            bottom.linkTo(parent.bottom, margin = 16.dp)
                            end.linkTo(parent.end, margin = 16.dp)
                        },
                        content = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_my_courses),
                                contentDescription = stringResource(id = R.string.add_icon_description)
                            )
                        })
                }
            }
        }
    }
}
fun Context.getActivity(): ComponentActivity? = when (this) {
    is ComponentActivity -> this
    is ContextWrapper -> baseContext.getActivity()
    else -> null
}