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
val sources_icon: ImageVector
    get() {
        if (_sources != null) {
            return _sources!!
        }
        _sources =
            ImageVector.Builder(
                name = "sources",
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
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineTo(19f)
                        curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                        horizontalLineTo(19f)
                        curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        moveTo(11f, 17f)
                        horizontalLineTo(7f)
                        verticalLineTo(15f)
                        horizontalLineTo(11f)
                        verticalLineTo(17f)
                        moveTo(17f, 13f)
                        horizontalLineTo(7f)
                        verticalLineTo(11f)
                        horizontalLineTo(17f)
                        verticalLineTo(13f)
                        moveTo(17f, 9f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        horizontalLineTo(17f)
                        verticalLineTo(9f)
                        close()
                    }
                }
                .build()
        return _sources!!
    }

private var _sources: ImageVector? = null
