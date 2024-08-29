import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import drinkunodocs.composeapp.generated.resources.Res.drawable
import drinkunodocs.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

/**
 * @param title title for action card, wild card or special condition.
 * @param shotUnit how many drinks should you drink?
 * @param [image] image component is optional if title name is no a card
 * @param [altImage] same of [image]
*/
data class Card(
    val title: String,
    val shotUnit: String,
    val image: (@Composable () -> Unit)? = null,
    val altImage: (@Composable () -> Unit)? = null,
)

/**
* @param img get drawable resource image item
* image card component
*/
@Composable
fun CardImage(img: DrawableResource) {
    Image(
        painter = painterResource(img),
        contentDescription = "card",
        modifier = Modifier.size(80.dp)
    )
}

/** list of some uno game cards */
val cards = listOf(
    Card(
        title = "falso uno", 
        shotUnit = "toma tres shots."
    ),
    Card(
        title = "ganar la partida", 
        shotUnit = "elige un jugador al azar y se toma tres shots."
    ),
    Card(
        title = "piedad (uno no mercy)", 
        shotUnit = "en jugador que llegue a 25 cartas o mas: ademas de esta eliminado, debe tomar 4 shots"
    ),
    Card(
        title = "toma 1 (uno express & uno flip)", 
        shotUnit = "toma un shot.",
        image = { CardImage(drawable.toma1) },
    ),
    Card(
        title = "toma 2 (varios uno)", 
        shotUnit = "toma un shot.",
        image = { CardImage(drawable.toma2) },
        altImage = { CardImage(drawable.comodin_toma2) }
    ),
    Card(
        title = "toma 4 (varios uno)", 
        shotUnit = "toma dos shots.",
        image = { CardImage(drawable.comodin_toma4) },
        altImage = { CardImage(drawable.toma4) }
    ),
    Card(
        title = "toma 5 (uno flip)", 
        shotUnit = "toma tres shots.",
        image = { CardImage(drawable.toma5) },
    ),
    Card(
        title = "toma 6 (uno no mercy)", 
        shotUnit = "toma tres shots.",
        image = { CardImage(drawable.comodin_toma6) },
    ),
    Card(
        title = "toma 10 (uno no mercy)", 
        shotUnit = "toma cinco shots.",
        image = { CardImage(drawable.comodin_toma10) },
    ),
    Card(
        title = "salta (todos los uno)",
        shotUnit = "el jugador que perdió el turno se toma un shot.",
        image = { CardImage(drawable.salta) },
        altImage = { CardImage(drawable.comodin_salta) },
    ),
    Card(
        title = "salta dos (uno all wild)",
        shotUnit = "los siguientes dos jugadores que perdieron su turno se toma un shot.",
        image = { CardImage(drawable.comodin_salta2) },
    ),
    Card(
        title = "todos toman una carta (uno flex)",
        shotUnit = """
        si un jugador juegan por el lado flex de la carta toma 2:
            todos los jugadores se toman un shot.
        """.trimIndent(),
        image = { CardImage(drawable.flex_toma2) },
    ),
    Card(
        title = "elige y toma 2 (uno all wild & uno flex)",
        shotUnit = """
        1) si la carta es un comodin elige y toma dos.
        2) si la carta es el lado flex de comodín toma 2 focalizada.
        
        el jugador elegido se toma un shot.
        """.trimIndent(),
        image = { CardImage(drawable.comodin_elige_toma2) },
        altImage = { CardImage(drawable.comodin_toma2_focalizada) },
    ),
    Card(
        title = "toma un color (uno flip)",
        shotUnit = """
        el siguiente jugador debe tomar cartas hasta que le salga el color que se eligio.
        se debe tomar la cantidad de shot basado en n° total de cartas:
            caso 1: si tomo una carta o dos se toma un shot.
            caso 2 si agarro mas de tres cartas se toma dos o mas shots.
        """.trimIndent(),
        image = { CardImage(drawable.comodin_toma_un_color) },
    ),
    Card(
        title = "ruleta de color (uno no mercy)",
        shotUnit = """
        el siguiente jugador elige un color hasta le salga el color que fue elegido.
        se debe tomar la cantidad de shots basados en número par: 
            si agarro 10 cartas se toma 5 shots.
        """.trimIndent(),
        image = { CardImage(drawable.comodin_ruleta_de_color) },
    ),
    Card(
        title = "reversa y salta (uno flex)",
        shotUnit = """
        si juegas por el lado flex de la carta flex reversa:
            1) el que le cambiaron la dirección toma un shot.
            2) el perdió turno por el cambio de dirección se toma un shot.
        """.trimIndent(),
        image = { CardImage(drawable.flex_reversa) },
    ),
    Card(
        title = "salta a todos (uno flip, uno flex, uno no mercy)",
        shotUnit = """
        1) si la carta es un carta salta a todos
        2) si la carta es el lado flex de la carta flex salta.
            
        todos los jugadores que perdieron su turno se toma un shot.
        """.trimIndent(),
        image = { CardImage(drawable.salta_todos) },
    ),
    Card(
        title = "reversa toma 4 (uno no mercy)",
        shotUnit = "el siguiente jugador que le cambiaron la dirección o así mismo se toma dos shots.",
        image = { CardImage(drawable.comodin_reversa_toma4) },
    ),
    Card(
        title = "reversa (todos los uno)",
        shotUnit = "el jugador que le cambiaron la dirección toma un shot.",
        image = { CardImage(drawable.reversa) },
        altImage = { CardImage(drawable.comodin_reversa) }
    ),
    Card(
        title = "todos toman dos cartas (uno flex)",
        shotUnit = """
        si un jugador juegan por el lado flex de la carta comodín flex todos toman:
            todos los jugadores se toman dos shots.
        """.trimIndent(),
        image = { CardImage(drawable.comodin_todos_toman) },
    ),
    Card(
        title = "elige y toma cuatro (uno flex)",
        shotUnit = """
        si un jugador juegan por el lado flex de la carta comodín flex toma 4:
            el jugador elegido se toma dos shots.
        """.trimIndent(),
        image = { CardImage(drawable.comodin_todos_toman) },
    ),
).sortedBy { it.image != null }