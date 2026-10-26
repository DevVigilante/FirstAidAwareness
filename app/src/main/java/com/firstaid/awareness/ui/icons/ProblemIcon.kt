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
public val problem: ImageVector
    get() {
        if (_problem != null) {
            return _problem!!
        }
        _problem =
            ImageVector.Builder(
                name = "problem",
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
                        moveTo(7.71f, 15.71f)
                        quadTo(8f, 15.43f, 8f, 15f)
                        reflectiveQuadTo(7.71f, 14.29f)
                        reflectiveQuadTo(7f, 14f)
                        quadTo(6.58f, 14f, 6.29f, 14.29f)
                        reflectiveQuadTo(6f, 15f)
                        reflectiveQuadToRelative(0.29f, 0.71f)
                        reflectiveQuadTo(7f, 16f)
                        reflectiveQuadTo(7.71f, 15.71f)
                        close()
                        moveTo(6f, 13f)
                        horizontalLineTo(8f)
                        verticalLineTo(8f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(5f)
                        close()
                        moveToRelative(4f, 2f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(13f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(2f)
                        close()
                        moveToRelative(0f, -4f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(9f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(2f)
                        close()
                        moveTo(4f, 20f)
                        quadTo(3.18f, 20f, 2.59f, 19.41f)
                        reflectiveQuadTo(2f, 18f)
                        verticalLineTo(6f)
                        quadTo(2f, 5.18f, 2.59f, 4.59f)
                        reflectiveQuadTo(4f, 4f)
                        horizontalLineTo(20f)
                        quadToRelative(0.83f, 0f, 1.41f, 0.59f)
                        quadTo(22f, 5.18f, 22f, 6f)
                        verticalLineTo(18f)
                        quadToRelative(0f, 0.82f, -0.59f, 1.41f)
                        reflectiveQuadTo(20f, 20f)
                        horizontalLineTo(4f)
                        close()
                        moveTo(4f, 18f)
                        horizontalLineTo(20f)
                        verticalLineTo(6f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                        moveToRelative(0f, 0f)
                        verticalLineTo(6f)
                        verticalLineTo(18f)
                        close()
                    }
                }
                .build()
        return _problem!!
    }

private var _problem: ImageVector? = null