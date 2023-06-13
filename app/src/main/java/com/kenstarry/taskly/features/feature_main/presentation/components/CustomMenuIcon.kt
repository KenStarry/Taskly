package com.kenstarry.taskly.features.feature_main.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomMenuIcon(
    onMenuClicked: () -> Unit
) {

    val primaryCol = MaterialTheme.colorScheme.primary
    val padding by remember {
        mutableFloatStateOf(24f)
    }
    val radius by remember {
        mutableFloatStateOf(12f)
    }

    Canvas(
        modifier = Modifier
            .size(30.dp)
            .background(color = MaterialTheme.colorScheme.background)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) { },
        onDraw = {
            //  menu icon
            drawCircle(
                color = primaryCol,
                radius = radius,
                center = Offset(x = padding, y = padding)
            )
            drawCircle(
                color = primaryCol,
                radius = radius,
                center = Offset(x = this.size.width - padding, y = padding)
            )
            drawCircle(
                color = primaryCol,
                radius = radius,
                center = Offset(x = this.size.width - padding, y = this.size.height - padding)
            )
            drawCircle(
                color = primaryCol,
                radius = radius,
                center = Offset(x = padding, y = this.size.height - padding)
            )
        }
    )
}
























