package com.example.demo_sanmarcosstore_lab3.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demo_sanmarcosstore_lab3.model.productosDePrueba
import com.example.demo_sanmarcosstore_lab3.ui.components.ProductoItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TiendaScreen(navController: NavController) {

    var busqueda by remember { mutableStateOf("") }

    val productosFiltrados = productosDePrueba.filter {
        it.nombre.contains(busqueda, ignoreCase = true)
    }

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text("SanMarcos Store")
                }
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Agregar"
                )
            }
        }

    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {

            OutlinedTextField(
                value = busqueda,
                onValueChange = {
                    busqueda = it
                },
                label = {
                    Text("Buscar producto")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {

                items(productosFiltrados) { producto ->
                    ProductoItem(producto = producto)
                }

                item {

                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        onClick = {
                            navController.navigate("profile")
                        }
                    ) {
                        Text("Ir al Perfil")
                    }

                }

            }

        }

    }

}