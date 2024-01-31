package com.calculator.figmagymapp.home

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.calculator.figmagymapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

// Design to select for Home
enum class Property1 {
    Default,
    Variant2,
    Variant3
}

/**
 * This composable was generated from the UI Package 'home_'.
 * Generated code; do not edit directly
 */
@Composable
fun Home(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default,
    storeButton: () -> Unit = {},
    workoutButton: () -> Unit = {},
    homeButton: () -> Unit = {}
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            IconamoonHomeThinProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {}
            FitnessProtein1Property1Default(
                storeButton = storeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IconoirGymweight1Property1Default(
                workoutButton = workoutButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -140.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            VectorHomeButton11Property1Default(
                homeButton = homeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            IconamoonHomeThinProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {}
            VectorHomeButton11Property1Variant2(
                homeButton = homeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            FitnessProtein1Property1Variant2(
                storeButton = storeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 141.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IconoirGymweight2Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -141.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            Rectangle1Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -141.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(modifier = modifier) {
            IconamoonHomeThinProperty1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {}
            VectorHomeButton11Property1Variant3(
                homeButton = homeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Rectangle1Property1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            FitnessProtein1Property1Variant3(
                storeButton = storeButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 140.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IconoirGymweight1Property1Variant3(
                workoutButton = workoutButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -140.5.dp,
                        y = 2.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 64)
@Composable
private fun HomeProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Home(
                storeButton = {},
                workoutButton = {},
                homeButton = {},
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 64)
@Composable
private fun HomeProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            Home(
                storeButton = {},
                workoutButton = {},
                homeButton = {},
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 64)
@Composable
private fun HomeProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            Home(
                storeButton = {},
                workoutButton = {},
                homeButton = {},
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun IconamoonHomeThinProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 142,
            red = 151,
            green = 146,
            blue = 146
        ),
        isStructured = false,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun FitnessProtein1Property1Default(
    storeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_fitness_protein_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = storeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun IconoirGymweight1Property1Default(
    workoutButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_iconoir_gymweight_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = workoutButton).requiredWidth(41.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun VectorHomeButton11Property1Default(
    homeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_vector_home_button_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = homeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun TopLevelProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconamoonHomeThinProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 151,
            green = 146,
            blue = 146
        ),
        isStructured = false,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun VectorHomeButton11Property1Variant2(
    homeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_vector_home_button_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = homeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun FitnessProtein1Property1Variant2(
    storeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_fitness_protein_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = storeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun IconoirGymweight2Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_iconoir_gymweight_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Rectangle1Property1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_rectangle_1),
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconamoonHomeThinProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 151,
            green = 146,
            blue = 146
        ),
        isStructured = false,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun VectorHomeButton11Property1Variant3(
    homeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_vector_home_button_1_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = homeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Rectangle1Property1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_rectangle_2),
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(52.0.dp)
    )
}

@Composable
fun FitnessProtein1Property1Variant3(
    storeButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_fitness_protein_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = storeButton).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun IconoirGymweight1Property1Variant3(
    workoutButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.home_iconoir_gymweight_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = workoutButton).requiredWidth(41.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
