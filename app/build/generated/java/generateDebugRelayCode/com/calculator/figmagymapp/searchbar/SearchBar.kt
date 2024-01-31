package com.calculator.figmagymapp.searchbar

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
 * This composable was generated from the UI Package 'search_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    search: String = "",
    serachButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Search(
            search = search,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 23.0.dp,
                    y = 11.0.dp
                )
            )
        )
        BitcoinIconsSearchFilledsearch1(
            serachButton = serachButton,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 323.0.dp,
                    y = 5.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 390, heightDp = 50)
@Composable
private fun SearchBarPreview() {
    MaterialTheme {
        RelayContainer {
            SearchBar(
                search = "Search...",
                serachButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Search(
    search: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = search,
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 57,
            green = 62,
            blue = 65
        ),
        height = 1.2102272510528564.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(103.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun BitcoinIconsSearchFilledsearch1(
    serachButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.search_bar_bitcoin_icons_search_filledsearch_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = serachButton).requiredWidth(41.0.dp).requiredHeight(41.0.dp)
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
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        radius = 67.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
