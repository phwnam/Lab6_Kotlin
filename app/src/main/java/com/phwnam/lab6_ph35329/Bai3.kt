package com.phwnam.lab6_ph35329

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.phwnam.lab6_ph35329.ui.screens.CinemaSeatBookingScreen
import com.phwnam.lab6_ph35329.ui.screens.createTheaterSeating

@Preview(showBackground = true)
@Composable
fun PreBai3() {
    val navController = rememberNavController()
    Bai3(navController)
}

@Composable
fun Bai3(navController: NavHostController) {
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}
