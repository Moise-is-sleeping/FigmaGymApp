package com.calculator.figmagymapp.options

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.calculator.figmagymapp.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

// Design to select for Options
enum class Property1 {
    Default,
    Variant2,
    Variant3,
    Variant4,
    Variant5
}

/**
 * This composable was generated from the UI Package 'options'.
 * Generated code; do not edit directly
 */
@Composable
fun Options(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default,
    optionSelected: () -> Unit = {}
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            LeadingElementProperty1Default {
                BuildingBlocksMonogramProperty1Default {
                    InitialProperty1Default(
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
            ContentProperty1Default(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                HeadlineProperty1Default(modifier = Modifier.rowWeight(1.0f))
            }
            TrailingElementProperty1Default(optionSelected = optionSelected) {
                CheckboxesProperty1Default {
                    StateLayerProperty1Default {
                        StateLayerSynthProperty1Default {
                            ContainerProperty1Default()
                        }
                        IconsCheckSmallProperty1Default(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {
                            IconProperty1Default(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 9.5367431640625e-7.dp,
                                        y = -0.2999997138977051.dp
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            LeadingElementProperty1Variant2 {
                BuildingBlocksMonogramProperty1Variant2 {
                    InitialProperty1Variant2(
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
            ContentProperty1Variant2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                HeadlineProperty1Variant2(modifier = Modifier.rowWeight(1.0f))
            }
            TrailingElementProperty1Variant2(optionSelected = optionSelected) {
                CheckboxesProperty1Variant2 {
                    StateLayerProperty1Variant2 {
                        StateLayerSynthProperty1Variant2 {
                            ContainerProperty1Variant2()
                        }
                        IconsCheckSmallProperty1Variant2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {
                            IconProperty1Variant2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 9.5367431640625e-7.dp,
                                        y = -0.2999997138977051.dp
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(modifier = modifier) {
            LeadingElementProperty1Variant3 {
                BuildingBlocksMonogramProperty1Variant3 {
                    InitialProperty1Variant3(
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
            ContentProperty1Variant3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                HeadlineProperty1Variant3(modifier = Modifier.rowWeight(1.0f))
            }
            TrailingElementProperty1Variant3(optionSelected = optionSelected) {
                CheckboxesProperty1Variant3 {
                    StateLayerProperty1Variant3 {
                        StateLayerSynthProperty1Variant3 {
                            ContainerProperty1Variant3()
                        }
                        IconsCheckSmallProperty1Variant3(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {
                            IconProperty1Variant3(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 9.5367431640625e-7.dp,
                                        y = -0.2999997138977051.dp
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
        Property1.Variant4 -> TopLevelProperty1Variant4(modifier = modifier) {
            LeadingElementProperty1Variant4 {
                BuildingBlocksMonogramProperty1Variant4 {
                    InitialProperty1Variant4(
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
            ContentProperty1Variant4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                HeadlineProperty1Variant4(modifier = Modifier.rowWeight(1.0f))
            }
            TrailingElementProperty1Variant4(optionSelected = optionSelected) {
                CheckboxesProperty1Variant4 {
                    StateLayerProperty1Variant4 {
                        StateLayerSynthProperty1Variant4 {
                            ContainerProperty1Variant4()
                        }
                        IconsCheckSmallProperty1Variant4(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {
                            IconProperty1Variant4(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 9.5367431640625e-7.dp,
                                        y = -0.2999997138977051.dp
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
        Property1.Variant5 -> TopLevelProperty1Variant5(modifier = modifier) {
            LeadingElementProperty1Variant5 {
                BuildingBlocksMonogramProperty1Variant5 {
                    InitialProperty1Variant5(
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
            ContentProperty1Variant5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                HeadlineProperty1Variant5(modifier = Modifier.rowWeight(1.0f))
            }
            TrailingElementProperty1Variant5(optionSelected = optionSelected) {
                CheckboxesProperty1Variant5 {
                    StateLayerProperty1Variant5 {
                        StateLayerSynthProperty1Variant5 {
                            ContainerProperty1Variant5()
                        }
                        IconsCheckSmallProperty1Variant5(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = 0.0.dp,
                                    y = 0.0.dp
                                )
                            )
                        ) {
                            IconProperty1Variant5(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.Center,
                                    offset = DpOffset(
                                        x = 9.5367431640625e-7.dp,
                                        y = -0.2999997138977051.dp
                                    )
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 329, heightDp = 56)
@Composable
private fun OptionsProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            Options(
                optionSelected = {},
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 329, heightDp = 56)
@Composable
private fun OptionsProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            Options(
                optionSelected = {},
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 329, heightDp = 56)
@Composable
private fun OptionsProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            Options(
                optionSelected = {},
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 329, heightDp = 56)
@Composable
private fun OptionsProperty1Variant4Preview() {
    MaterialTheme {
        RelayContainer {
            Options(
                optionSelected = {},
                property1 = Property1.Variant4,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 329, heightDp = 56)
@Composable
private fun OptionsProperty1Variant5Preview() {
    MaterialTheme {
        RelayContainer {
            Options(
                optionSelected = {},
                property1 = Property1.Variant5,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun InitialProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.5.em,
        letterSpacing = 0.15000000596046448.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuildingBlocksMonogramProperty1Default(
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
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LeadingElementProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
    )
}

@Composable
fun HeadlineProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Swimming pool",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContentProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContainerProperty1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_container),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayerSynthProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IconProperty1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_icon),
        modifier = modifier.requiredWidth(12.000001907348633.dp).requiredHeight(9.40000057220459.dp)
    )
}

@Composable
fun IconsCheckSmallProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun CheckboxesProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 4.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingElementProperty1Default(
    optionSelected: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = optionSelected)
    )
}

@Composable
fun TopLevelProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 245,
            green = 245,
            blue = 245
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InitialProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "2",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.5.em,
        letterSpacing = 0.15000000596046448.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuildingBlocksMonogramProperty1Variant2(
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
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LeadingElementProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
    )
}

@Composable
fun HeadlineProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Spa",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContentProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContainerProperty1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_container1),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayerSynthProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IconProperty1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_icon1),
        modifier = modifier.requiredWidth(12.000001907348633.dp).requiredHeight(9.40000057220459.dp)
    )
}

@Composable
fun IconsCheckSmallProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun CheckboxesProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 4.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingElementProperty1Variant2(
    optionSelected: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = optionSelected)
    )
}

@Composable
fun TopLevelProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 245,
            green = 245,
            blue = 245
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InitialProperty1Variant3(modifier: Modifier = Modifier) {
    RelayText(
        content = "3",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.5.em,
        letterSpacing = 0.15000000596046448.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuildingBlocksMonogramProperty1Variant3(
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
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LeadingElementProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
    )
}

@Composable
fun HeadlineProperty1Variant3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sauna",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContentProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContainerProperty1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_container2),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayerSynthProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IconProperty1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_icon2),
        modifier = modifier.requiredWidth(12.000001907348633.dp).requiredHeight(9.40000057220459.dp)
    )
}

@Composable
fun IconsCheckSmallProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun CheckboxesProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 4.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingElementProperty1Variant3(
    optionSelected: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = optionSelected)
    )
}

@Composable
fun TopLevelProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 245,
            green = 245,
            blue = 245
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InitialProperty1Variant4(modifier: Modifier = Modifier) {
    RelayText(
        content = "4",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.5.em,
        letterSpacing = 0.15000000596046448.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuildingBlocksMonogramProperty1Variant4(
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
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LeadingElementProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
    )
}

@Composable
fun HeadlineProperty1Variant4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Massage",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContentProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContainerProperty1Variant4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_container3),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayerSynthProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IconProperty1Variant4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_icon3),
        modifier = modifier.requiredWidth(12.000001907348633.dp).requiredHeight(9.40000057220459.dp)
    )
}

@Composable
fun IconsCheckSmallProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun CheckboxesProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 4.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingElementProperty1Variant4(
    optionSelected: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = optionSelected)
    )
}

@Composable
fun TopLevelProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 245,
            green = 245,
            blue = 245
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InitialProperty1Variant5(modifier: Modifier = Modifier) {
    RelayText(
        content = "5",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.5.em,
        letterSpacing = 0.15000000596046448.sp,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuildingBlocksMonogramProperty1Variant5(
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
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LeadingElementProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier
    )
}

@Composable
fun HeadlineProperty1Variant5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Meal",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ContentProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContainerProperty1Variant5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_container4),
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun StateLayerSynthProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IconProperty1Variant5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.options_icon4),
        modifier = modifier.requiredWidth(12.000001907348633.dp).requiredHeight(9.40000057220459.dp)
    )
}

@Composable
fun IconsCheckSmallProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayerProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun CheckboxesProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(
            start = 0.0.dp,
            top = 4.0.dp,
            end = 4.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TrailingElementProperty1Variant5(
    optionSelected: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = optionSelected)
    )
}

@Composable
fun TopLevelProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 0,
            red = 245,
            green = 245,
            blue = 245
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
