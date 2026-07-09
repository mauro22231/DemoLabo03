package com.example.demo_sanmarcosstore_lab3.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: String,
    val categoria: String,
    val favorito: Boolean = false
)

val productosDePrueba = listOf(
    Producto(1, "Café Premium 500g", "S/45.00", "Bebidas", true),
    Producto(2, "Chocolate Artesanal", "S/28.00", "Dulces"),
    Producto(3, "Pan de Masa Madre", "S/18.00", "Panadería"),
    Producto(4, "Miel Orgánica", "S/35.00", "Endulzantes", true),
    Producto(5, "Té Verde Matcha", "S/55.00", "Bebidas")
)