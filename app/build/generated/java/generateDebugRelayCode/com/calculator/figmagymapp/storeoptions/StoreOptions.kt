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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'store_options'.
 * Generated code; do not edit directly
 */
@Composable
fun StoreOptions(
    modifier: Modifier = Modifier,
    massGainerButton1: () -> Unit = {},
    massGainerButton2: () -> Unit = {},
    creatinebutton1: () -> Unit = {},
    creatinebutton2: () -> Unit = {},
    protein1button: () -> Unit = {},
    protein2button: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Proteins(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -117.5.dp,
                    y = -281.0.dp
                )
            )
        )
        MassGainers(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -81.5.dp,
                    y = -83.0.dp
                )
            )
        )
        Creatine(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -120.5.dp,
                    y = 115.0.dp
                )
            )
        )
        Supplements(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 234.0.dp
                )
            )
        ) {
            MassGainers5(massGainerButton1 = massGainerButton1) {
                M4RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 57.0.dp,
                            y = 18.0.dp
                        )
                    )
                )
            }
            MassGainers4(
                massGainerButton2 = massGainerButton2,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M5RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
            MassGainers3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M3RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 15.0.dp
                        )
                    )
                )
            }
            MassGainers2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M2RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 36.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            MassGainers1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M1RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 29.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
        }
        Supplements2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 208.0.dp
                )
            )
        ) {
            Creatine5(creatinebutton1 = creatinebutton1) {
                C5RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 37.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            Creatine4(
                creatinebutton2 = creatinebutton2,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C4RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 45.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Creatine3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C3RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 34.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
            }
            Creatine2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C2RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
            }
            Creatine1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C1RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 42.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
        }
        Supplements1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 36.0.dp
                )
            )
        ) {
            Proteins5(protein1button = protein1button) {
                P2RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 35.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
            Proteins4(
                protein2button = protein2button,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P1RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 44.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
            }
            Proteins3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P3RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 40.0.dp,
                            y = 18.0.dp
                        )
                    )
                )
            }
            Proteins2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P5RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
            Proteins1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P4RemovebgPreview1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 40.0.dp,
                            y = 17.0.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 369, heightDp = 605)
@Composable
private fun StoreOptionsPreview() {
    MaterialTheme {
        RelayContainer {
            StoreOptions(
                massGainerButton1 = {},
                massGainerButton2 = {},
                creatinebutton1 = {},
                creatinebutton2 = {},
                protein1button = {},
                protein2button = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
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
fun M4RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_m4_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(86.0.dp).requiredHeight(122.0.dp)
    )
}

@Composable
fun MassGainers5(
    massGainerButton1: () -> Unit,
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
        modifier = modifier.tappable(onTap = massGainerButton1).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun M5RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_m5_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(91.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun MassGainers4(
    massGainerButton2: () -> Unit,
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
        modifier = modifier.tappable(onTap = massGainerButton2).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun M3RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_m3_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(103.0.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun MassGainers3(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun M2RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_m2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(127.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun MassGainers2(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun M1RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_m1_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(141.0.dp).requiredHeight(141.0.dp)
    )
}

@Composable
fun MassGainers1(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun Supplements(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(369.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C5RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_c5_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(125.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun Creatine5(
    creatinebutton1: () -> Unit,
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
        modifier = modifier.tappable(onTap = creatinebutton1).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C4RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_c4_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(109.0.dp).requiredHeight(142.0.dp)
    )
}

@Composable
fun Creatine4(
    creatinebutton2: () -> Unit,
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
        modifier = modifier.tappable(onTap = creatinebutton2).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C3RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_c3_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun Creatine3(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C2RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_c2_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(99.0.dp).requiredHeight(139.0.dp)
    )
}

@Composable
fun Creatine2(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C1RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_c1_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(129.0.dp)
    )
}

@Composable
fun Creatine1(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun Supplements2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(369.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P2RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_p2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Proteins5(
    protein1button: () -> Unit,
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
        modifier = modifier.tappable(onTap = protein1button).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P1RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_p1_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(112.0.dp).requiredHeight(133.0.dp)
    )
}

@Composable
fun Proteins4(
    protein2button: () -> Unit,
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
        modifier = modifier.tappable(onTap = protein2button).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P3RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_p3_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(120.0.dp)
    )
}

@Composable
fun Proteins3(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P5RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_p5_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(129.0.dp)
    )
}

@Composable
fun Proteins2(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P4RemovebgPreview1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.store_options_p4_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(123.0.dp)
    )
}

@Composable
fun Proteins1(
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
        modifier = modifier.requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun Supplements1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(369.0.dp).requiredHeight(157.0.dp)
    )
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
