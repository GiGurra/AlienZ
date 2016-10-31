package com.github.alienz.game.state

import com.github.gigurra.glasciia.Act
import com.github.gigurra.math.Vec2

/**
  * Created by johan on 2016-10-26.
  */
case class GameState(var cutscene: Option[Act],
                     var worldTime: Long,
                     var appTime: Long,
                     var ownPos: Vec2[Long])

object GameState {
  def apply(t0: Long = System.currentTimeMillis): GameState = {
    new GameState(
      cutscene = None,
      worldTime = t0,
      appTime = t0,
      ownPos = Vec2(0L, 0L)
    )
  }
}

