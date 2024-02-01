package com.calculator.figmagymapp.header

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
import com.google.relay.compose.tappable

// Design to select for Header
enum class Property1 {
    Default,
    Variant2
}

/**
 * This composable was generated from the UI Package 'header'.
 * Generated code; do not edit directly
 */
@Composable
fun Header(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default,
    shoppingCartButton: () -> Unit = {}
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            HeaderProperty1Default(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
            Vectoruser1Property1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -172.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            Frame1logo1Property1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            HeaderProperty1Variant2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
            Frame1logo1Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            Vectoruser1Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -175.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            PhShoppingCartLightcart1Property1Variant2(
                shoppingCartButton = shoppingCartButton,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 169.5.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 60)
@Composable
private fun HeaderProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Header(
                shoppingCartButton = {},
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 60)
@Composable
private fun HeaderProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            Header(
                shoppingCartButton = {},
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun HeaderProperty1Default(
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
fun Vectoruser1Property1Default(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.header_vectoruser_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(51.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Frame1logo1Property1Default(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.header_frame_1logo_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(135.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun TopLevelProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HeaderProperty1Variant2(
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
fun Frame1logo1Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.header_frame_1logo_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(135.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Vectoruser1Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.header_vectoruser_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(51.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun PhShoppingCartLightcart1Property1Variant2(
    shoppingCartButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.header_ph_shopping_cart_lightcart_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = shoppingCartButton).requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
