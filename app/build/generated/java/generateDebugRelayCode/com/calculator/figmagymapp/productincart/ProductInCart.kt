package com.calculator.figmagymapp.productincart

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.google.relay.compose.RelayVector

// Design to select for ProductInCart
enum class Property1 {
    Default,
    Variant2,
    Variant3
}

/**
 * This composable was generated from the UI Package 'product_in_cart'.
 * Generated code; do not edit directly
 */
@Composable
fun ProductInCart(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            QuantityProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 236.0.dp
                    )
                )
            ) {
                Ellipse11Property1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                Ellipse12Property1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 114.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                IcBaselinePlusProperty1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 115.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    VectorProperty1Default(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                IcBaselineMinusProperty1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    Vector1Property1Default(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Rectangle2Property1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class2Property1Default(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 74.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            M1RemovebgPreview1Property1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 86.0.dp,
                        y = 33.0.dp
                    )
                )
            )
            XfitSeriousMassGainerProperty1Default(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            QuantityProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 236.0.dp
                    )
                )
            ) {
                Ellipse11Property1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                Ellipse12Property1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 114.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                IcBaselinePlusProperty1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 115.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    VectorProperty1Variant2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                IcBaselineMinusProperty1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    Vector1Property1Variant2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Rectangle2Property1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class2Property1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 74.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            OrgainOrganicProteinProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 6.0.dp
                    )
                )
            )
            P2RemovebgPreview1Property1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 69.0.dp,
                        y = 30.0.dp
                    )
                )
            )
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(modifier = modifier) {
            QuantityProperty1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 236.0.dp
                    )
                )
            ) {
                Ellipse11Property1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                Ellipse12Property1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 114.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                IcBaselinePlusProperty1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 115.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    VectorProperty1Variant3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                IcBaselineMinusProperty1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    Vector1Property1Variant3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Rectangle2Property1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class2Property1Variant3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 74.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
            WheyCreatineMonohydrateProperty1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 6.0.dp
                    )
                )
            )
            C4RemovebgPreview1Property1Variant3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 97.0.dp,
                        y = 39.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 376, heightDp = 295)
@Composable
private fun ProductInCartProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            ProductInCart(
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 376, heightDp = 295)
@Composable
private fun ProductInCartProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            ProductInCart(
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 376, heightDp = 295)
@Composable
private fun ProductInCartProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            ProductInCart(
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Ellipse11Property1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_11),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Ellipse12Property1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_12),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun VectorProperty1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 8.5382080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 8.545125961303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselinePlusProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Vector1Property1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 18.7882080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 18.795125246047974.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselineMinusProperty1Default(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Rectangle2Property1Default(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_rectangle_2),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class2Property1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 81,
            green = 78,
            blue = 78
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun QuantityProperty1Default(
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
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun M1RemovebgPreview1Property1Default(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.product_in_cart_m1_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(207.0.dp).requiredHeight(207.0.dp)
    )
}

@Composable
fun XfitSeriousMassGainerProperty1Default(modifier: Modifier = Modifier) {
    RelayText(
        content = "Xfit Serious Mass Gainer",
        fontSize = 22.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272727272727.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(263.0.dp).requiredHeight(27.0.dp)
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
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Ellipse11Property1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_13),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Ellipse12Property1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_14),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun VectorProperty1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 8.5382080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 8.545125961303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselinePlusProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Vector1Property1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 18.7882080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 18.795125246047974.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselineMinusProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Rectangle2Property1Variant2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_rectangle_3),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class2Property1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 81,
            green = 78,
            blue = 78
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun QuantityProperty1Variant2(
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
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun OrgainOrganicProteinProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Orgain Organic Protein",
        fontSize = 22.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272727272727.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(263.0.dp).requiredHeight(27.0.dp)
    )
}

@Composable
fun P2RemovebgPreview1Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.product_in_cart_p2_removebg_preview_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(217.0.dp).requiredHeight(217.0.dp)
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
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Ellipse11Property1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_15),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Ellipse12Property1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_ellipse_16),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun VectorProperty1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector4),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 8.5382080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 8.545125961303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselinePlusProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Vector1Property1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_vector5),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.541748046875.dp,
                top = 18.7882080078125.dp,
                end = 8.541584014892578.dp,
                bottom = 18.795125246047974.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselineMinusProperty1Variant3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(41.0.dp).requiredHeight(41.0.dp)
    )
}

@Composable
fun Rectangle2Property1Variant3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_in_cart_rectangle_4),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class2Property1Variant3(modifier: Modifier = Modifier) {
    RelayText(
        content = "1",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 81,
            green = 78,
            blue = 78
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun QuantityProperty1Variant3(
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
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun WheyCreatineMonohydrateProperty1Variant3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Whey Creatine Monohydrate",
        fontSize = 22.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272727272727.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(27.0.dp)
    )
}

@Composable
fun C4RemovebgPreview1Property1Variant3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.product_in_cart_c4_removebg_preview_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(151.0.dp).requiredHeight(197.0.dp)
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
            red = 211,
            green = 208,
            blue = 203
        ),
        isStructured = false,
        radius = 20.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
