package com.github.alienz.game.state

/**
  * Created by johan on 2016-10-26.
  */
object updateWorld {

  def apply(state: GameState, appTime: Long): Unit = {
    val dt = appTime - state.appTime
    state.appTime = appTime

    // TODO: Perform some world changes :S

    state.cutscene match {
      case Some(cutscene) =>
        cutscene.update(appTime)
      // Don't update world time
      case None =>
        state.worldTime += dt
    }
  }
}
