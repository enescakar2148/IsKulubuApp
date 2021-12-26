package com.example.iskulubuapp

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.iskulubuapp.Screens.Login
import com.example.iskulubuapp.Screens.SplashScreen
import com.example.iskulubuapp.ui.theme.IskulubuappTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IskulubuappTheme(darkTheme = false) {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "SplashScreen") {
                    composable("SplashScreen"){
                        SplashScreen()
                    }
                    composable("Login"){
                        Login()
                    }

                    object : CountDownTimer(2500, 1000){
                        override fun onTick(millisUntilFinished: Long) {

                        }

                        override fun onFinish() {
                            navController.navigate("Login")
                        }
                    }.start()
                }
            }
        }
    }
}
