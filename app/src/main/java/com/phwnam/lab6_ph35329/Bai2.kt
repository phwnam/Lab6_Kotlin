package com.phwnam.lab6_ph35329

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun PreBai2(){
    val navController = rememberNavController()
    Bai2(navController)
}
@Composable
fun Bai2(navController: NavHostController){
}
