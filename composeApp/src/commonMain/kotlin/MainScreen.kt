import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun MainScreen() {
    val state = rememberLazyListState()

    Scaffold {
        LazyColumn(
            state = state,
            modifier = Modifier.fillMaxSize().padding(it)
        ) {
            items(cards) { (title, shotUnit, image, altImage) ->
                ListItem(
                    headlineContent = { Text(title, fontWeight = FontWeight.Bold) },
                    supportingContent = { Text(shotUnit) },
                    leadingContent = image,
                    trailingContent = altImage
                )
                HorizontalDivider()
            }
        }
    }
}