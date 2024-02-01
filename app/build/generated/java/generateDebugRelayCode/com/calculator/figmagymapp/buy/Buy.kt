package com.calculator.figmagymapp.buy

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

// Design to select for Buy
enum class Property1 {
    Default,
    Variant2
}

/**
 * This composable was generated from the UI Package 'buy'.
 * Generated code; do not edit directly
 */
@Composable
fun Buy(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            AddToCartProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopEnd,
                    offset = DpOffset(
                        x = -26.0.dp,
                        y = 14.0.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            BuyProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 49.0.dp,
                        y = 14.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 187, heightDp = 58)
@Composable
private fun BuyProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Buy(
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 158, heightDp = 63)
@Composable
private fun BuyProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            Buy(
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun AddToCartProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Add to Cart",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(135.0.dp).requiredHeight(29.0.dp)
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
            red = 226,
            green = 192,
            blue = 68
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BuyProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Buy",
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(60.0.dp).requiredHeight(36.0.dp)
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
            red = 226,
            green = 192,
            blue = 68
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
