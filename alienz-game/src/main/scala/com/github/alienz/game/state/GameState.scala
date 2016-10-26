package com.github.alienz.game.state

import com.github.alienz.game.cutscene.Cutscene
import com.github.gigurra.math.Vec2

/**
  * Created by johan on 2016-10-26.
  */
case class GameState(cutscene: Option[Cutscene],
                     var worldTime: Long,
                     var appTime: Long,
                     var ownPos: Vec2[Long],
                     var worldScale: Long)

object GameState {
  def apply(t0: Long = System.currentTimeMillis): GameState = {
    new GameState(
      cutscene = None,
      worldTime = t0,
      appTime = t0,
      ownPos = Vec2(0L, 0L),
      worldScale = 1000L
    )
  }
}

