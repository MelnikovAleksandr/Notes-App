package ru.asmelnikov.android.notes_app.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.asmelnikov.android.notes_app.domain.model.Note
import ru.asmelnikov.android.notes_app.presentation.ui.NotesAppTheme
import ru.asmelnikov.android.notes_app.presentation.ui.components.NoteItem


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val notes: List<Note> = listOf(
        Note(
            title = "TEST",
            content = "TEST CONTENT",
            backgroundColor = Color(0xFFFF00FF).toArgb()
        )
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    tint = Color.White,
                    contentDescription = "add"
                )
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Notes",
                fontSize = 43.sp,
                modifier = Modifier
                    .padding(top = 43.dp, start = 24.dp, bottom = 12.dp)
            )
            notes.forEach { note ->
                NoteItem(
                    title = note.title,
                    backgroundColor = Color(note.backgroundColor),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 24.dp)
                        .padding(vertical = 12.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    NotesAppTheme {
        MainScreen()
    }
}