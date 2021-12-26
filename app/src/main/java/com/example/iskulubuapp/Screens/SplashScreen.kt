package com.example.iskulubuapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iskulubuapp.R

@Composable
fun SplashScreen(){

    Surface(color = Color.White) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp, bottom = 175.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(225.dp)
                    .padding(top = 10.dp)
            )

            Text(
                text = "Hoş Geldin",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color(128, 164, 185),
                modifier = Modifier.padding(top = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    SplashScreen()
}