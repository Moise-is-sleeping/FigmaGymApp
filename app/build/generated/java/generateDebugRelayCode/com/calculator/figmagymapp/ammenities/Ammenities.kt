package com.calculator.figmagymapp.ammenities

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'ammenities'.
 * Generated code; do not edit directly
 */
@Composable
fun Ammenities(
    modifier: Modifier = Modifier,
    contenido: @Composable RelayContainerScope.() -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        PremiumPlan(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 13.0.dp
                )
            )
        )
        Frame10(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 31.0.dp,
                    y = 65.0.dp
                )
            )
        ) {
            contenido()
        }
    }
}

@Preview(widthDp = 392, heightDp = 484)
@Composable
private fun AmmenitiesPreview() {
    MaterialTheme {
        RelayContainer {
            Ammenities(
                contenido = {
                    RelayText(
                        content = "Reserve Ammenities",
                        fontSize = 20.0.sp,
                        color = Color(
                            alpha = 255,
                            red = 0,
                            green = 0,
                            blue = 0
                        ),
                        letterSpacing = 0.10000000149011612.sp,
                        fontWeight = FontWeight(500.0.toInt()),
                        maxLines = -1,
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 9.0.dp,
                                y = 16.0.dp
                            )
                        ).requiredWidth(205.0.dp).requiredHeight(26.0.dp).wrapContentHeight(
                            align = Alignment.CenterVertically,
                            unbounded = true
                        )
                    )
                },
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun PremiumPlan(modifier: Modifier = Modifier) {
    RelayText(
        content = "Premium Plan",
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 0.8333333587646484.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(172.0.dp).requiredHeight(32.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Frame10(
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
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(329.0.dp).requiredHeight(389.0.dp)
    )
}

@Composable
fun TopLevel(
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
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
