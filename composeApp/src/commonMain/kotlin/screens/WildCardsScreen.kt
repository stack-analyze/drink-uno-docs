package screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import data.wildCardsList

object WildCardsScreen : Tab {
    @Composable
    override fun Content() {
        val state = rememberLazyListState()

        LazyColumn(
            state = state,
            modifier = Modifier.fillMaxSize().padding()
        ) {
            items(wildCardsList) { (title, shotUnit, image, altImage) ->
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

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(icons.ic_wild)

            return remember {
                TabOptions(index = 2u, title = "comodines", icon)
            }
        }
}