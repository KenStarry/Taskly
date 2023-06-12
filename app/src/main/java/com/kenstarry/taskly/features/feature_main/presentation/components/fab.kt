package com.kenstarry.taskly.features.feature_main.presentation.components

import android.content.Context
import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Fab(onClick: () -> Unit) {
    FloatingActionButton(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = Color(0xFFffffff),
        onClick = onClick) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add Icon")
    }
}