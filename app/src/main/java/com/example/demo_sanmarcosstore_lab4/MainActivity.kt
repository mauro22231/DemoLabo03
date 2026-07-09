package com.example.demo_sanmarcosstore_lab3
import com.example.demo_sanmarcosstore_lab3.ui.navigation.AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.demo_sanmarcosstore_lab3.ui.theme.AppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.demo_sanmarcosstore_lab3.data.database.AppDatabaseProvider
import com.example.demo_sanmarcosstore_lab3.data.repository.ProductoRepository
import com.example.demo_sanmarcosstore_lab3.viewmodel.ProductoViewModel
import com.example.demo_sanmarcosstore_lab3.viewmodel.ProductoViewModelFactory
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                AppNavigation()
            }
        }

    }
}