package com.calculator.figmagymapp.storeoptions

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
import com.calculator.figmagymapp.supplements.Design
import com.calculator.figmagymapp.supplements.Supplements
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'store_options'.
 * Generated code; do not edit directly
 */
@Composable
fun StoreOptions(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Proteins(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = 0.0.dp
                )
            )
        )
        MassGainers(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = 225.0.dp
                )
            )
        )
        Creatine(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = 453.0.dp
                )
            )
        )
        SupplementsInstance(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 271.0.dp
                )
            )
        )
        Supplements2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 506.0.dp
                )
            )
        )
        Supplements1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 50.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 390, heightDp = 671)
@Composable
private fun StoreOptionsPreview() {
    MaterialTheme {
        RelayContainer {
            StoreOptions(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Proteins(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proteins",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 211,
            green = 221,
            blue = 227
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun MassGainers(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mass Gainers",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 211,
            green = 221,
            blue = 227
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(178.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun Creatine(modifier: Modifier = Modifier) {
    RelayText(
        content = "Creatine",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 211,
            green = 221,
            blue = 227
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(100.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun SupplementsInstance(modifier: Modifier = Modifier) {
    Supplements(
        design = Design.MassGainerList,
        modifier = modifier.requiredWidth(389.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun Supplements2(modifier: Modifier = Modifier) {
    Supplements(
        design = Design.CreatineList,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun Supplements1(modifier: Modifier = Modifier) {
    Supplements(modifier = modifier.requiredWidth(391.0.dp).requiredHeight(157.0.dp))
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
