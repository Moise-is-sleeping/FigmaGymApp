package com.calculator.figmagymapp.workoutsessions

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.calculator.figmagymapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

// Design to select for WorkoutSessions
enum class Property1 {
    Default,
    Variant2,
    Variant3,
    Variant4
}

/**
 * This composable was generated from the UI Package 'workout_sessions'.
 * Generated code; do not edit directly
 */
@Composable
fun WorkoutSessions(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            CapturaDePantalla121Property1Default()
            Frame13Property1Default {
                GroupSessionsProperty1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 102.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            CapturaDePantalla131Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 49.0.dp
                    )
                )
            )
            Frame13Property1Variant2 {
                IndividualSessionsProperty1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 78.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(modifier = modifier) {
            CapturaDePantalla131Property1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 597.0.dp,
                        y = 570.0.dp
                    )
                )
            )
            Frame13Property1Variant3 {
                OnlineSessionsProperty1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 78.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            CapturaDePantalla141Property1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 49.0.dp
                    )
                )
            )
        }
        Property1.Variant4 -> TopLevelProperty1Variant4(modifier = modifier) {
            CapturaDePantalla131Property1Variant4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 597.0.dp,
                        y = 570.0.dp
                    )
                )
            )
            Frame13Property1Variant4 {
                CoreWorkoutsProperty1Variant4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 78.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            CapturaDePantalla151Property1Variant4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 49.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 368, heightDp = 239)
@Composable
private fun WorkoutSessionsProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            WorkoutSessions(
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 368, heightDp = 239)
@Composable
private fun WorkoutSessionsProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            WorkoutSessions(
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 368, heightDp = 239)
@Composable
private fun WorkoutSessionsProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            WorkoutSessions(
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 368, heightDp = 239)
@Composable
private fun WorkoutSessionsProperty1Variant4Preview() {
    MaterialTheme {
        RelayContainer {
            WorkoutSessions(
                property1 = Property1.Variant4,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun CapturaDePantalla121Property1Default(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_12_1),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(368.0.dp).requiredHeight(239.0.dp)
    )
}

@Composable
fun GroupSessionsProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Group Sessions",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(187.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame13Property1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(49.0.dp)
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

@Composable
fun CapturaDePantalla131Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_13_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(239.0.dp)
    )
}

@Composable
fun IndividualSessionsProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Individual Sessions",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(233.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame13Property1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(49.0.dp)
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

@Composable
fun CapturaDePantalla131Property1Variant3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_13_1),
        radius = 6.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(239.0.dp)
    )
}

@Composable
fun OnlineSessionsProperty1Variant3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Online Sessions",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(233.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame13Property1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun CapturaDePantalla141Property1Variant3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_14_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(239.0.dp)
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

@Composable
fun CapturaDePantalla131Property1Variant4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_13_1),
        radius = 6.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(239.0.dp)
    )
}

@Composable
fun CoreWorkoutsProperty1Variant4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Core Workouts",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(264.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Frame13Property1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun CapturaDePantalla151Property1Variant4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.workout_sessions_captura_de_pantalla_15_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(390.0.dp).requiredHeight(212.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant4(
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
