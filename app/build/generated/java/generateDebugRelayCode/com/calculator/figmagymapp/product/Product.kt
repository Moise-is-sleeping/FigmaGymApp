package com.calculator.figmagymapp.product

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
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'product'.
 * Generated code; do not edit directly
 */
@Composable
fun Product(
    modifier: Modifier = Modifier,
    cartButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Frame19(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 15.0.dp,
                    y = 79.0.dp
                )
            )
        ) {}
        ProductName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 32.0.dp,
                    y = 18.0.dp
                )
            )
        )
        Frame20(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 15.0.dp,
                    y = 438.0.dp
                )
            )
        ) {}
        Description(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 27.0.dp,
                    y = 373.0.dp
                )
            )
        )
        Quantity(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 32.0.dp,
                    y = 557.0.dp
                )
            )
        )
        Quantity1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 605.0.dp
                )
            )
        ) {
            Quantity2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                Ellipse11(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 7.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                Ellipse12(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 114.0.dp,
                            y = 7.0.dp
                        )
                    )
                )
                IcBaselinePlus(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 115.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                IcBaselineMinus(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 4.0.dp
                        )
                    )
                ) {
                    Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Rectangle2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 9.0.dp
                        )
                    )
                )
                Class2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 74.0.dp,
                            y = 11.0.dp
                        )
                    )
                )
            }
        }
        Buy(
            cartButton = cartButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 168.0.dp,
                    y = 601.0.dp
                )
            )
        ) {
            AddToCart(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopEnd,
                    offset = DpOffset(
                        x = -26.0.dp,
                        y = 14.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 370, heightDp = 699)
@Composable
private fun ProductPreview() {
    MaterialTheme {
        RelayContainer {
            Product(
                cartButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Frame19(
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
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(339.0.dp).requiredHeight(263.0.dp)
    )
}

@Composable
fun ProductName(modifier: Modifier = Modifier) {
    RelayText(
        content = "Product Name",
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
        modifier = modifier.requiredWidth(315.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Frame20(
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
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(339.0.dp).requiredHeight(83.0.dp)
    )
}

@Composable
fun Description(modifier: Modifier = Modifier) {
    RelayText(
        content = "Description",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(315.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Quantity(modifier: Modifier = Modifier) {
    RelayText(
        content = "Quantity",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(114.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Ellipse11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_ellipse_11),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Ellipse12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_ellipse_12),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(36.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.5416259765625.dp,
                top = 8.5382080078125.dp,
                end = 8.541706085205078.dp,
                bottom = 8.545125961303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselinePlus(
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
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_vector1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.54168701171875.dp,
                top = 18.7882080078125.dp,
                end = 8.541645050048828.dp,
                bottom = 18.795125246047974.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcBaselineMinus(
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
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.product_rectangle_2),
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Class2(modifier: Modifier = Modifier) {
    RelayText(
        content = "2",
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
fun Quantity2(
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Quantity1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(157.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun AddToCart(modifier: Modifier = Modifier) {
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
fun Buy(
    cartButton: () -> Unit,
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
        modifier = modifier.tappable(onTap = cartButton).requiredWidth(186.0.dp).requiredHeight(59.0.dp)
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
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
