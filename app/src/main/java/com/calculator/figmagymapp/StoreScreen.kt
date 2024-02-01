package com.calculator.figmagymapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.calculator.figmagymapp.header.Header
import com.calculator.figmagymapp.header.Property1
import com.calculator.figmagymapp.home.Home
import com.calculator.figmagymapp.searchbar.SearchBar
import com.calculator.figmagymapp.storeoptions.StoreOptions
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope


@Composable
fun StoreScreen(navController: NavController){
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
                property1 = Property1.Variant2,
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
            Row (modifier = Modifier
                .height(70.dp)
                .width(370.dp)
                .padding(top = 25.dp)){
                SearchBar(
                    search = "Search...",
                    serachButton = {},
                    modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f)
                )
            }
            RelayContainer(
                isStructured = true,
                scrollable = true,
                mainAxisAlignment = MainAxisAlignment.Start,
                crossAxisAlignment = CrossAxisAlignment.Start,
                arrangement = RelayContainerArrangement.Row,
                radius = 5.0,
                modifier = Modifier
                .height(605.dp)
                .width(370.dp)
                    .padding(top = 10.dp)) {
                StoreOptions(
                    massGainerButton1 = {navController.navigate(Routes.ProductScreen.route)},
                    massGainerButton2 = {navController.navigate(Routes.ProductScreen.route)},
                    creatinebutton1 = {navController.navigate(Routes.ProductScreen.route)},
                    creatinebutton2 = {navController.navigate(Routes.ProductScreen.route)},
                    protein1button = {navController.navigate(Routes.ProductScreen.route)},
                    protein2button = {navController.navigate(Routes.ProductScreen.route)},
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
        Row(
            modifier = Modifier
                .height(60.dp)
                .width(430.dp)
        ) {
            Home(
                storeButton = {

                },
                workoutButton = {
                    navController.navigate(Routes.WorkoutsScreen.route)
                },
                homeButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                property1 = com.calculator.figmagymapp.home.Property1.Variant3,
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}
@Composable
fun Scroll(modifier: Modifier, content:@Composable RelayContainerScope.()->Unit){
    RelayContainer(
        isStructured = true,
        scrollable = true,
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        radius = 5.0,
        content = content,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )
}