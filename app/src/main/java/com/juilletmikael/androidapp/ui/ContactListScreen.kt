package com.juilletmikael.androidapp.ui

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp

@Composable
fun ContactList(contactList: List<String>) {
    LazyColumn {
        items(contactList) { contact ->
            ContactCard(contact = contact)
        }
    }
}

@Composable
fun ContactCard(contact: String, modifier: Modifier = Modifier) {
    ClickableText(text = AnnotatedString(contact) ,  onClick = { offset ->
        Log.d("ClickableText", "$offset -th character is clicked.")
    },
        modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.headlineSmall
    )
}
