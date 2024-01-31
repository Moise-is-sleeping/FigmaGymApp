package com.calculator.figmagymapp.fitnessinfo

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

/**
 * This composable was generated from the UI Package 'fitness_info'.
 * Generated code; do not edit directly
 */
@Composable
fun FitnessInfo(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        FitnessTrackerDialogcal1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -85.0.dp,
                    y = -46.0.dp
                )
            )
        )
        FitnessTrackerDialogsteps1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 85.0.dp,
                    y = -46.02119064331055.dp
                )
            )
        )
        FitnessTrackerDialogactivity1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 63.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 390, heightDp = 239)
@Composable
private fun FitnessInfoPreview() {
    MaterialTheme {
        RelayContainer {
            FitnessInfo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun FitnessTrackerDialogcal1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.fitness_info_fitness_tracker_dialogcal_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(148.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun FitnessTrackerDialogsteps1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.fitness_info_fitness_tracker_dialogsteps_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(148.0.dp).requiredHeight(118.9576187133789.dp)
    )
}

@Composable
fun FitnessTrackerDialogactivity1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.fitness_info_fitness_tracker_dialogactivity_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(64.0.dp)
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
