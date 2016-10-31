package com.github.alienz.game.drawing

import com.badlogic.gdx.graphics.Color
import com.github.alienz.game.state.GameState
import com.github.gigurra.glasciia.{Canvas, Font}
import com.github.gigurra.glasciia.Glasciia._
import com.github.gigurra.glasciia.impl.TextDrawer.Anchor
import com.github.gigurra.math.{Vec2, Zero}

/**
  * Created by johan on 2016-10-26.
  */
object drawWorld {

  lazy val testFont = Font.fromTtfFile("pt-mono/PTM55FT.ttf")

  def apply(state: GameState,
            canvas: Canvas): Unit = {

    val camWorldWidth = 100000L

    canvas.drawFrame(
      clearBuffer = Some(Color.DARK_GRAY),
      camPos = state.player.pos.toFloat,
      camViewportWithoutZoom = camWorldWidth * Vec2(1.0f, 1.0f / canvas.aspectRatio)
    ) {
      canvas.drawText(
        text = "lala",
        font = testFont,
        color = Color.WHITE,
        at = Zero.vec2f,
        scale = 1000.0f,
        rotate =  0.0f,
        anchor = Anchor.CC
      )
    }
  }
}
