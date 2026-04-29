package com.rom.poa.ui.screens.Todo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable

fun TodoForm ( todoViewModel: TodoViewModel = viewModel(),
              modifier: Modifier){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       val title by remember { mutableStateOf(TextFieldValue("")) }
        val description by remember { mutableStateOf(TextFieldValue("")) }
        val media by remember { mutableStateOf(TextFieldValue("")) }
        val isComplete by remember { mutableStateOf(TextFieldValue("")) }

    }

}