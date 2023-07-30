package ir.minicartoon.practicepracticepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    //Start : 08:55 AM  End : 09:35
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val updateColor = remember {
                mutableStateOf(Color.Black)
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                ColorBox() {
                    updateColor.value = it
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(updateColor.value)
                )
            }


        }

    }
}

@Composable
fun ColorBox(updateColor: (Color) -> Unit) {

    Box(modifier = Modifier

        .fillMaxWidth()
        .fillMaxHeight(0.5f)
        .background(Color.Blue)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )

        }

    )
}




