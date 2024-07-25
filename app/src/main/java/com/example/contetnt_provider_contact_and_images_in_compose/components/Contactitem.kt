package com.example.contetnt_provider_contact_and_images_in_compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contetnt_provider_contact_and_images_in_compose.model.Contact

@Composable
fun ContactItem(contact: Contact) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = contact.name, fontSize = 25.sp)
        Text(text = contact.number, fontSize = 20.sp)
        Divider(color = Color.Black, thickness = 2.dp, modifier = Modifier.padding(5.dp))
    }
}

@Composable
fun ContactList(contacts : List<Contact>, modifier: Modifier) {
    LazyColumn {
        items(contacts){contact->
            ContactItem(contact = contact)
        }
    }
}