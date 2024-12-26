package icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ic_common: ImageVector
	get() {
		if (_ic_common != null) {
			return _ic_common!!
		}
		_ic_common = ImageVector.Builder(
            name = "Ic_common",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFE8EAED)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(160f, 840f)
				verticalLineToRelative(-80f)
				horizontalLineToRelative(480f)
				verticalLineToRelative(80f)
				horizontalLineTo(160f)
				close()
				moveToRelative(226f, -194f)
				lineTo(160f, 420f)
				lineToRelative(84f, -86f)
				lineToRelative(228f, 226f)
				lineToRelative(-86f, 86f)
				close()
				moveToRelative(254f, -254f)
				lineTo(414f, 164f)
				lineToRelative(86f, -84f)
				lineToRelative(226f, 226f)
				lineToRelative(-86f, 86f)
				close()
				moveToRelative(184f, 408f)
				lineTo(302f, 278f)
				lineToRelative(56f, -56f)
				lineToRelative(522f, 522f)
				lineToRelative(-56f, 56f)
				close()
			}
		}.build()
		return _ic_common!!
	}

private var _ic_common: ImageVector? = null
