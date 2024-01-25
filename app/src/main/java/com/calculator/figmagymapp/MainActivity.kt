package com.calculator.figmagymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.calculator.figmagymapp.header.Header
import com.calculator.figmagymapp.home.Home
import com.calculator.figmagymapp.home.Property1
import com.calculator.figmagymapp.ui.theme.FigmaGymAppTheme
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Column (
        modifier = Modifier.fillMaxSize().background(color = Color(0xFF393E41))
    ){
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
        Row (
            modifier = Modifier
                .height(702.dp)
                .width(430.dp)
        ){

        }
        Row (
            modifier = Modifier
                .height(60.dp)
                .width(430.dp)
        ){
            Home(
                storeButton = {},
                workoutButton = {},
                homeButton = {},
                property1 = Property1.Default,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }

    }
}