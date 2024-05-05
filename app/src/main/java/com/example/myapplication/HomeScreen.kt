package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate(Counter.route)}) {
            Text(text = Counter.route)
        }
        Button(onClick = { navController.navigate(DiceRoller.route)}) {
            Text(text = DiceRoller.route)
        }
        Button(onClick = { navController.navigate(LocalWebViewDes.route)}) {
            Text(text = LocalWebViewDes.route)
        }
    }
}