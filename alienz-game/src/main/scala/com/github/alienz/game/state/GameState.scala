package com.github.alienz.game.state

import com.github.gigurra.glasciia.Act
import com.github.gigurra.math.Vec2

/**
  * Created by johan on 2016-10-26.
  */
case class GameState(var cutscene: Option[Act],
                     var worldTime: Long,
                     var appTime: Long,
                     val player: Player,
                     val storyProgression: StoryProgression)

object GameState {
  def newGame(player: Player = Player.newGame()): GameState = {
    new GameState(
      cutscene = None,
      worldTime = 0L,
      appTime = 0L,
      player = player,
      storyProgression = StoryProgression.newGame()
    )
  }
}

