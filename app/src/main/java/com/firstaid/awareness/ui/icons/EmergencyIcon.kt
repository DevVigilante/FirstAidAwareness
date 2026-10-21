package com.firstaid.awareness.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
public val emergency_icon: ImageVector
    get() {
        if (_emergency != null) {
            return _emergency!!
        }
        _emergency =
            ImageVector.Builder(
                name = "emergency",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.Companion.NonZero,
                    ) {
                        moveTo(10.25f, 21f)
                        verticalLineTo(15.05f)
                        lineTo(5.1f, 18.02f)
                        lineTo(3.35f, 15f)
                        lineTo(8.5f, 12f)
                        lineTo(3.35f, 9.02f)
                        lineTo(5.1f, 6f)
                        lineToRelative(5.15f, 2.97f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(3.5f)
                        verticalLineTo(8.98f)
                        lineTo(18.9f, 6f)
                        lineToRelative(1.75f, 3.02f)
                        lineTo(15.5f, 12f)
                        lineToRelative(5.15f, 3f)
                        lineTo(18.9f, 18.02f)
                        lineTo(13.75f, 15.05f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(-3.5f)
                        close()
                    }
                }
                .build()
        return _emergency!!
    }

private var _emergency: ImageVector? = null