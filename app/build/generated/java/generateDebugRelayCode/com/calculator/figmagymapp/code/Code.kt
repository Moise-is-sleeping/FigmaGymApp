package com.calculator.figmagymapp.code

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.calculator.figmagymapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'code'.
 * Generated code; do not edit directly
 */
@Composable
fun Code(
    modifier: Modifier = Modifier,
    exit: () -> Unit = {}
) {
    TopLevel(
        exit = exit,
        modifier = modifier
    ) {
        AccesCode(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -84.5.dp
                )
            )
        ) {
            VaadinQrcode(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 36.0.dp,
                        y = 28.0.dp
                    )
                )
            ) {
                Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Enter(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 7.5.dp,
                    y = 139.5.dp
                )
            )
        ) {
            ScanCodeToEnter(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 3.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 813)
@Composable
private fun CodePreview() {
    MaterialTheme {
        RelayContainer {
            Code(
                exit = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.code_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 128.125.dp,
                bottom = 128.125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.code_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 25.625.dp,
                end = 128.125.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.code_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 25.625.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 25.625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.code_vector1),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VaadinQrcode(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(205.0.dp).requiredHeight(205.0.dp)
    )
}

@Composable
fun AccesCode(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(260.0.dp)
    )
}

@Composable
fun ScanCodeToEnter(modifier: Modifier = Modifier) {
    RelayText(
        content = "Scan  code to Enter",
        fontSize = 26.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 0.7692308044433593.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(43.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Enter(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(263.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TopLevel(
    exit: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 239,
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = exit).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
