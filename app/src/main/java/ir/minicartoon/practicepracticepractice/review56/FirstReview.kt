package ir.minicartoon.practicepracticepractice.review56

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ir.minicartoon.practicepracticepractice.review56.ui.theme.PracticePracticePracticeTheme
import kotlin.random.Random

class FirstReview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var color = remember {
                mutableStateOf(Color. DarkGray)
            }
            Column() {

                ColorBox(){
                    color.value=it
                }

                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(color.value)

                )
            }

//           ColorBox2()
        }
    }
}


@Composable
fun ColorBox(color: (Color)->Unit) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.5f)
        .background(Color.Black)
        .clickable {
            color(
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

@Composable
fun OtherBox(color: MutableState<Color>){

}

@Composable
fun ColorBox2() {

    var color = remember {
        mutableStateOf(Color.Yellow)
    }


    Column(modifier = Modifier
        .fillMaxSize()
//        .background(color.value)
    )
    {

        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            }


        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color.value)

        )

    }

}