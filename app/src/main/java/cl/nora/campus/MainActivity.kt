package cl.nora.campus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstaceState)
        setContent { MaterialTheme {InicioDemo()} }
    }
}

@Composable
fun InicioDemo() {
    var pulsaciones by remember { mutableStateOf(0) }
    Column(Modifier.fillMaxSize().padding(24.dp)) {
        Text("NORA Campus", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        Text("Interacciones: $pulsaciones")
        Button(onClick = { pulsaciones++ }) { Text("Probar Compose") }
    }
}