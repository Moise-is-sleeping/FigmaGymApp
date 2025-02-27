package com.calculator.figmagymapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.calculator.figmagymapp.Routes
import com.calculator.figmagymapp.accesbutton.AccesButton
import com.calculator.figmagymapp.fitnessinfo.FitnessInfo
import com.calculator.figmagymapp.header.Header
import com.calculator.figmagymapp.header.Property1
import com.calculator.figmagymapp.home.Home
import com.calculator.figmagymapp.options.Options
import com.calculator.figmagymapp.productincart.ProductInCart
import com.calculator.figmagymapp.workoutsessions.WorkoutSessions
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight


@Composable
fun WorkoutsScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF393E41))
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.080f)
                .fillMaxWidth()
        ) {
            Header(
                shoppingCartButton = {},
                property1 = Property1.Default,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
        Column(
            modifier = Modifier
                .height(702.dp)
                .width(430.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn {
                item {
                    Row(
                        modifier = Modifier
                            .width(368.dp)
                            .height(239.dp)
                            .padding(top = 15.dp)
                    ) {
                        WorkoutSessions(
                            property1 = com.calculator.figmagymapp.workoutsessions.Property1.Default,
                            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(368.dp)
                            .height(239.dp)
                            .padding(top = 15.dp)
                    ) {
                        WorkoutSessions(
                            property1 = com.calculator.figmagymapp.workoutsessions.Property1.Variant2,
                            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(368.dp)
                            .height(239.dp)
                            .padding(top = 15.dp)
                    ) {
                        WorkoutSessions(
                            property1 = com.calculator.figmagymapp.workoutsessions.Property1.Variant3,
                            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .width(368.dp)
                            .height(239.dp)
                            .padding(top = 15.dp)
                    ) {
                        WorkoutSessions(
                            property1 = com.calculator.figmagymapp.workoutsessions.Property1.Variant4,
                            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
            }

        }
        Row(
            modifier = Modifier
                .height(60.dp)
                .width(430.dp)
        ) {
            Home(
                storeButton = {
                    navController.navigate(Routes.StoreScreen.route)
                },
                workoutButton = {

                },
                homeButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                property1 = com.calculator.figmagymapp.home.Property1.Variant2,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}