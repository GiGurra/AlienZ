package com.github.alienz.game.drawing

import com.badlogic.gdx.graphics.Color
import com.github.alienz.game.state.GameState
import com.github.gigurra.glasciia.{Canvas, Font}
import com.github.gigurra.glasciia.Glasciia._
import com.github.gigurra.glasciia.impl.TextDrawer.Anchor
import com.github.gigurra.math.Zero

/**
  * Created by johan on 2016-10-26.
  */
object drawWorld {

  lazy val testFont = Font.fromTtfFile("pt-mono/PTM55FT.ttf")

  def apply(state: GameState,
            canvas: Canvas): Unit = {

    val ownPosFloat = state.ownPos.toFloat / state.worldScale.toFloat

    println(ownPosFloat)


    val camWorldWidth = 100L * state.worldScale
    canvas.setOrtho(
      yDown = false,
      width = camWorldWidth,
      height = camWorldWidth / canvas.aspectRatio
    )
    canvas.setCameraPos(ownPosFloat)

    canvas.drawFrame(clearBuffer = Some(Color.DARK_GRAY)) {
      canvas.drawText(
        text = "lala",
        font = testFont,
        color = Color.WHITE,
        at = Zero.vec2f,
        scale = state.worldScale,
        rotate =  0.0f,
        anchor = Anchor.CC
      )
    }
  }
}
