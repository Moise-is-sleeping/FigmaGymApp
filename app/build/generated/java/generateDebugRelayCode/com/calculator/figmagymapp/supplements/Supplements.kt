package com.calculator.figmagymapp.supplements

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

// Design to select for Supplements
enum class Design {
    ProteinList,
    MassGainerList,
    CreatineList
}

/**
 * This composable was generated from the UI Package 'supplements'.
 * Generated code; do not edit directly
 */
@Composable
fun Supplements(
    modifier: Modifier = Modifier,
    design: Design = Design.ProteinList,
    proteinButton: () -> Unit = {},
    proteinButton2: () -> Unit = {},
    massgainerButton: () -> Unit = {},
    creatineButton: () -> Unit = {}
) {
    when (design) {
        Design.ProteinList -> TopLevelProteinList(
            proteinButton = proteinButton,
            modifier = modifier
        ) {
            Proteins5ProteinList {
                P2RemovebgPreview1ProteinList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 35.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
            Proteins4ProteinList(
                proteinButton2 = proteinButton2,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P1RemovebgPreview1ProteinList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 44.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
            }
            Proteins3ProteinList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P3RemovebgPreview1ProteinList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 40.0.dp,
                            y = 18.0.dp
                        )
                    )
                )
            }
            Proteins2ProteinList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P5RemovebgPreview1ProteinList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 14.0.dp
                        )
                    )
                )
            }
            Proteins1ProteinList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                P4RemovebgPreview1ProteinList(
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
        Design.MassGainerList -> TopLevelMassGainerList(
            proteinButton = proteinButton,
            modifier = modifier
        ) {
            MassGainers5MassGainerList(massgainerButton = massgainerButton) {
                M4RemovebgPreview1MassGainerList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 57.0.dp,
                            y = 18.0.dp
                        )
                    )
                )
            }
            MassGainers4MassGainerList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M5RemovebgPreview1MassGainerList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 54.0.dp,
                            y = 13.0.dp
                        )
                    )
                )
            }
            MassGainers3MassGainerList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M3RemovebgPreview1MassGainerList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 15.0.dp
                        )
                    )
                )
            }
            MassGainers2MassGainerList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M2RemovebgPreview1MassGainerList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 36.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            MassGainers1MassGainerList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                M1RemovebgPreview1MassGainerList(
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
        Design.CreatineList -> TopLevelCreatineList(
            proteinButton = proteinButton,
            modifier = modifier
        ) {
            Creatine5CreatineList(creatineButton = creatineButton) {
                C5RemovebgPreview1CreatineList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 37.0.dp,
                            y = 16.0.dp
                        )
                    )
                )
            }
            Creatine4CreatineList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 228.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C4RemovebgPreview1CreatineList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 45.0.dp,
                            y = 8.0.dp
                        )
                    )
                )
            }
            Creatine3CreatineList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 456.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C3RemovebgPreview1CreatineList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 34.0.dp,
                            y = 12.0.dp
                        )
                    )
                )
            }
            Creatine2CreatineList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 684.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C2RemovebgPreview1CreatineList(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 50.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
            }
            Creatine1CreatineList(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 912.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                C1RemovebgPreview1CreatineList(
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
    }
}

@Preview(widthDp = 390, heightDp = 157)
@Composable
private fun SupplementsProteinListPreview() {
    MaterialTheme {
        RelayContainer {
            Supplements(
                proteinButton = {},
                proteinButton2 = {},
                massgainerButton = {},
                creatineButton = {},
                design = Design.ProteinList,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 157)
@Composable
private fun SupplementsMassGainerListPreview() {
    MaterialTheme {
        RelayContainer {
            Supplements(
                proteinButton = {},
                proteinButton2 = {},
                massgainerButton = {},
                creatineButton = {},
                design = Design.MassGainerList,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 157)
@Composable
private fun SupplementsCreatineListPreview() {
    MaterialTheme {
        RelayContainer {
            Supplements(
                proteinButton = {},
                proteinButton2 = {},
                massgainerButton = {},
                creatineButton = {},
                design = Design.CreatineList,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun P2RemovebgPreview1ProteinList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_p2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Proteins5ProteinList(
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
fun P1RemovebgPreview1ProteinList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_p1_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(112.0.dp).requiredHeight(133.0.dp)
    )
}

@Composable
fun Proteins4ProteinList(
    proteinButton2: () -> Unit,
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
        modifier = modifier.tappable(onTap = proteinButton2).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun P3RemovebgPreview1ProteinList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_p3_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(120.0.dp)
    )
}

@Composable
fun Proteins3ProteinList(
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
fun P5RemovebgPreview1ProteinList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_p5_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(129.0.dp)
    )
}

@Composable
fun Proteins2ProteinList(
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
fun P4RemovebgPreview1ProteinList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_p4_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(120.0.dp).requiredHeight(123.0.dp)
    )
}

@Composable
fun Proteins1ProteinList(
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
fun TopLevelProteinList(
    proteinButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = proteinButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun M4RemovebgPreview1MassGainerList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_m4_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(86.0.dp).requiredHeight(122.0.dp)
    )
}

@Composable
fun MassGainers5MassGainerList(
    massgainerButton: () -> Unit,
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
        modifier = modifier.tappable(onTap = massgainerButton).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun M5RemovebgPreview1MassGainerList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_m5_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(91.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun MassGainers4MassGainerList(
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
fun M3RemovebgPreview1MassGainerList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_m3_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(103.0.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun MassGainers3MassGainerList(
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
fun M2RemovebgPreview1MassGainerList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_m2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(127.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun MassGainers2MassGainerList(
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
fun M1RemovebgPreview1MassGainerList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_m1_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(141.0.dp).requiredHeight(141.0.dp)
    )
}

@Composable
fun MassGainers1MassGainerList(
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
fun TopLevelMassGainerList(
    proteinButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = proteinButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun C5RemovebgPreview1CreatineList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_c5_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(125.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun Creatine5CreatineList(
    creatineButton: () -> Unit,
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
        modifier = modifier.tappable(onTap = creatineButton).requiredWidth(200.0.dp).requiredHeight(157.0.dp)
    )
}

@Composable
fun C4RemovebgPreview1CreatineList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_c4_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(109.0.dp).requiredHeight(142.0.dp)
    )
}

@Composable
fun Creatine4CreatineList(
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
fun C3RemovebgPreview1CreatineList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_c3_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun Creatine3CreatineList(
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
fun C2RemovebgPreview1CreatineList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_c2_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(99.0.dp).requiredHeight(139.0.dp)
    )
}

@Composable
fun Creatine2CreatineList(
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
fun C1RemovebgPreview1CreatineList(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.supplements_c1_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(129.0.dp)
    )
}

@Composable
fun Creatine1CreatineList(
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
fun TopLevelCreatineList(
    proteinButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = proteinButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
