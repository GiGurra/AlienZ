package com.github.alienz.game.state

/**
  * Created by johan on 2016-10-26.
  */
object update {
  def apply(state: GameState): Unit = {
    val t = System.currentTimeMillis
    val dt = state.appTime - t
    state.appTime = t

    // TODO: Perform some world changes :S

    state.cutscene match {
      case Some(cutscene) => // Don't update world time
      case None => state.worldTime += dt
    }
  }
}
