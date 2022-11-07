package com.example.testcompose.Komik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testcompose.R
import com.example.testcompose.ui.theme.TestComposeTheme

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme(){
                DefaultPreview();
            }
        }
    }
}
@Composable
fun Background() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        painter = painterResource(id = R.drawable.background),
        contentDescription = "Diary",
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Menu(){
    Box(modifier = Modifier){
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(680.dp)
                .padding(start = 30.dp, top = 80.dp, end = 30.dp, bottom = 20.dp),
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Diary",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Image(
                modifier = Modifier
                    .padding(top = 200.dp, start = 50.dp, end = 50.dp)
                    .clickable { println("Button Clicked!") }
                    .animateContentSize(),
                painter = painterResource(id = R.drawable.bagan),
                contentDescription = null,

                )
            Image(
                modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp, end = 50.dp)
                    .clickable { println("Button Clicked!") }
                    .animateContentSize(),
                painter = painterResource(id = R.drawable.prolog),
                contentDescription = null,

                )
            Image(
                modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp, end = 50.dp)
                    .clickable { println("Button Clicked!") }
                    .animateContentSize(),
                painter = painterResource(id = R.drawable.rangkuman),
                contentDescription = null,

                )
            Image(
                modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp, end = 50.dp)
                    .clickable { println("Button Clicked!") }
                    .animateContentSize(),
                painter = painterResource(id = R.drawable.soal_latihan),
                contentDescription = null,

                )
        }
    }

}
@Composable
fun Dock(){
    val selected = remember { mutableStateOf(false) }
    val scale = animateFloatAsState(if (selected.value) 2f else 1f)

    Box(modifier = Modifier){
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp, top = 30.dp),
            painter = painterResource(id = R.drawable.dock),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Row( modifier = Modifier
            .padding(start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.Center


        ){
                Image(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(170.dp)
                        .clickable { println("Button Clicked!") }
                        .animateContentSize(),
                    painter = painterResource(id = R.drawable.petunjuk),
                    contentDescription = null,

                    )

                Image(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(170.dp)
                        .clickable { println("Button Clicked!") }
                        .animateContentSize(),
                    painter = painterResource(id = R.drawable.profil),
                    contentDescription = null,
                )



        }
    }

}
@Preview
@Composable
fun DefaultPreview() {
    Background()
    Column {
        Menu()
        Dock()
    }
}
