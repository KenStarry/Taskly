package com.kenstarry.taskly.features.feature_main.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainTopAppBar() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = MaterialTheme.colorScheme.background),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            //  menu icon
            CustomMenuIcon(
                onMenuClicked = {}
            )
            Spacer(modifier = Modifier.width(8.dp))
            //  name
            Text(text = "Taskly", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        }
        //  user image
    }
}