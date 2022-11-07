package com.example.testcompose.kelasb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.R

@Composable
fun Project2() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            painter = painterResource(id = R.drawable.univmusamus),
            contentDescription = "Diary",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                    vertical = 20.dp
                ),
            text = "Mulai sekarang!",
            style = TextStyle(
                fontSize = 18.sp
            ),
        )
        Text(
            text = "Informasi pribadi Anda tidak disimpan di server",
            style = TextStyle(
                fontSize = 14.sp
            )
        )
        Spacer(
            modifier = Modifier
                .height(70.dp)
        )
        Button(onClick = {
            println("Clicked")
        }) {
            Text(text = "Mulai")
        }
    }
}

@Preview
@Composable
fun PreviewProject2() {
    Project2()
}
