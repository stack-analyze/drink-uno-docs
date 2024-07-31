import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import theme.AppTheme

@Composable
fun App() {
    AppTheme {
        val appStyles = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)

        Surface(modifier = appStyles) {
            MainScreen()
        }
    }
}