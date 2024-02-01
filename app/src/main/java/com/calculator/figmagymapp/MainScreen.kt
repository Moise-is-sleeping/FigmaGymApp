package com.calculator.figmagymapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.calculator.figmagymapp.accesbutton.AccesButton
import com.calculator.figmagymapp.code.Code
import com.calculator.figmagymapp.fitnessinfo.FitnessInfo
import com.calculator.figmagymapp.header.Header
import com.calculator.figmagymapp.home.Home
import com.calculator.figmagymapp.home.Property1
import com.calculator.figmagymapp.options.Options
import com.calculator.figmagymapp.ui.theme.FigmaGymAppTheme
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight


@Composable
fun MainScreen(navController: NavController) {
    var code by remember { mutableStateOf(false) }
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
                property1 = com.calculator.figmagymapp.header.Property1.Default,
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
            Row(
                modifier = Modifier
                    .height(290.dp)
                    .width(370.dp)
                    .padding(bottom = 10.dp, top = 10.dp)
            )
            {
                FitnessInfo(
                    modifier = Modifier
                        .rowWeight(0.0f)
                        .columnWeight(1.0f)
                        .padding(top = 15.dp, bottom = 15.dp)
                )
            }
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(370.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(0xFFFFFFFF))
            ) {
                Column(
                    modifier = Modifier
                        .height(400.dp)
                        .width(370.dp)
                        .background(color = Color(0xFFFFFFFF)),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = "Premium Plan",
                        fontSize = 23.sp,
                        modifier = Modifier.padding(13.dp)
                    )
                    Box(
                        modifier = Modifier
                            .height(330.dp)
                            .width(310.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(color = Color(0xFFD3D0CB))
                    ) {
                        Column(
                            modifier = Modifier
                                .height(330.dp)
                                .width(310.dp)
                        ) {
                            Row {
                                Text(
                                    text = "Reserve Ammenities",
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .padding(start = 20.dp),
                                    fontSize = 20.sp,
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .height(56.dp)
                                    .width(329.dp)

                            ) {
                                Options(
                                    optionSelected = {},
                                    property1 = com.calculator.figmagymapp.options.Property1.Default,
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .height(56.dp)
                                    .width(329.dp)
                            ) {
                                Options(
                                    optionSelected = {},
                                    property1 = com.calculator.figmagymapp.options.Property1.Variant2,
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .height(56.dp)
                                    .width(329.dp)
                            ) {
                                Options(
                                    optionSelected = {},
                                    property1 = com.calculator.figmagymapp.options.Property1.Variant3,
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .height(56.dp)
                                    .width(329.dp)
                            ) {
                                Options(
                                    optionSelected = {},
                                    property1 = com.calculator.figmagymapp.options.Property1.Variant4,
                                    modifier = Modifier
                                        .rowWeight(1.0f)
                                        .columnWeight(1.0f)
                                )
                            }
                            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                                Row(
                                    modifier = Modifier
                                        .height(49.dp)
                                        .width(160.dp)
                                        .padding(end = 38.dp)
                                ) {
                                    AccesButton(
                                        qrCode = {
                                                 code = true
                                        },
                                        modifier = Modifier
                                            .rowWeight(1.0f)
                                            .columnWeight(1.0f)
                                    )
                                }
                            }

                        }
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
                    navController.navigate(Routes.WorkoutsScreen.route)
                },
                homeButton = {
                },
                property1 = Property1.Default,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
        Log.d("codes",code.toString())
        if (code){
            Dialog(onDismissRequest = {
            }) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Column(modifier = Modifier
                        .height(640.dp)
                        .width(329.dp))
                    {
                        Code(
                            exit = {
                                code = false
                            },
                            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }

            }
        }
    }

}