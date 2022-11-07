package com.example.testcompose.kelasb

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
fun Project1() {
    Box(
        modifier = Modifier.size(width = 200.dp, height = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.univmusamus),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Text(
            text = "Olahraga".uppercase(),
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.Black
            ),
            modifier = Modifier
                .padding(horizontal = 6.dp, vertical = 4.dp)
        )
    }
}

@Preview
@Composable
fun PreviewProject1() {
    Column {
        Project1()
    }
}
