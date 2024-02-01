package com.calculator.figmagymapp.proteins

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

// Design to select for Proteins
enum class Property1 {
    Default,
    Variant2,
    Variant3,
    Variant4,
    Variant5
}

/**
 * This composable was generated from the UI Package 'proteins'.
 * Generated code; do not edit directly
 */
@Composable
fun Proteins(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default,
    button1: () -> Unit = {}
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(
            button1 = button1,
            modifier = modifier
        ) {
            P2RemovebgPreview1Property1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(
            button1 = button1,
            modifier = modifier
        ) {
            P1RemovebgPreview1Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(
            button1 = button1,
            modifier = modifier
        ) {
            P3RemovebgPreview1Property1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        Property1.Variant4 -> TopLevelProperty1Variant4(
            button1 = button1,
            modifier = modifier
        ) {
            P5RemovebgPreview1Property1Variant4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Property1.Variant5 -> TopLevelProperty1Variant5(
            button1 = button1,
            modifier = modifier
        ) {
            P4RemovebgPreview1Property1Variant5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 200, heightDp = 157)
@Composable
private fun ProteinsProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Proteins(
                button1 = {},
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 200, heightDp = 157)
@Composable
private fun ProteinsProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            Proteins(
                button1 = {},
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 200, heightDp = 157)
@Composable
private fun ProteinsProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            Proteins(
                button1 = {},
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 200, heightDp = 157)
@Composable
private fun ProteinsProperty1Variant4Preview() {
    MaterialTheme {
        RelayContainer {
            Proteins(
                button1 = {},
                property1 = Property1.Variant4,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 200, heightDp = 157)
@Composable
private fun ProteinsProperty1Variant5Preview() {
    MaterialTheme {
        RelayContainer {
            Proteins(
                button1 = {},
                property1 = Property1.Variant5,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun P2RemovebgPreview1Property1Default(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proteins_p2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun TopLevelProperty1Default(
    button1: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.tappable(onTap = button1).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun P1RemovebgPreview1Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proteins_p1_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(112.0.dp).requiredHeight(133.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant2(
    button1: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.tappable(onTap = button1).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun P3RemovebgPreview1Property1Variant3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proteins_p3_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(120.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant3(
    button1: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.tappable(onTap = button1).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun P5RemovebgPreview1Property1Variant4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proteins_p5_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(129.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant4(
    button1: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.tappable(onTap = button1).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun P4RemovebgPreview1Property1Variant5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proteins_p4_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(123.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant5(
    button1: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.tappable(onTap = button1).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
