package com.kenstarry.taskly.features.feature_main.presentation

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.kenstarry.taskly.features.feature_main.presentation.components.Fab
import com.kenstarry.taskly.features.feature_main.presentation.components.MainTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val context = LocalContext.current

    Scaffold(
        topBar = {},
        floatingActionButton = { Fab(onClick = {}) },
        floatingActionButtonPosition = FabPosition.Center
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {

                //  top app bar
                MainTopAppBar()

            }
        }
    }
}

















