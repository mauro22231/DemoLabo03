package com.example.demo_sanmarcosstore_lab3.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demo_sanmarcosstore_lab3.model.Producto

@Composable
fun ProductoItem(
    producto: Producto
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column {

                Text(
                    text = producto.nombre,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = producto.categoria,
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = producto.precio,
                    style = MaterialTheme.typography.bodyLarge
                )

            }

            IconButton(
                onClick = { }
            ) {

                if (producto.favorito) {

                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorito"
                    )

                } else {

                    Icon(
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = "No favorito"
                    )

                }

            }

        }

    }

}