import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import screens.*

@Composable
fun MainScreen() {
    TabNavigator(HomeScreen) {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    TabNavigationItem(HomeScreen)
                    TabNavigationItem(ActionCardsScreen)
                    TabNavigationItem(WildCardsScreen)
                }
            },
        ) {
            val appStyles = Modifier.fillMaxSize().padding(it)
            Box(modifier = appStyles) { CurrentTab() }
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        label = { Text(tab.options.title) },
        icon = { Icon(tab.options.icon!!, null) }
    )
}