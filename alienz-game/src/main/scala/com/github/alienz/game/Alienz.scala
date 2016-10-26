package com.github.alienz.game

import com.github.alienz.game.drawing.{drawGui, drawWorld}
import com.github.alienz.game.state.{GameState, update}
import com.github.gigurra.glasciia.GameEvent.{Init, InputEvent, Render}
import com.github.gigurra.glasciia.{Game, GameEvent}

/**
  * Created by johan on 2016-10-26.
  */
class Alienz extends Game {

  def eventHandler: PartialFunction[GameEvent, Unit] = {

    case Init(canvas) =>
      val game = canvas.game
      game.addResource[GameState]("game-state", GameState())

    case Render(canvas) =>
      val game = canvas.game
      val state = game.resource[GameState]("game-state")
      update(state)
      drawWorld(state, canvas)
      drawGui(state, canvas)

    case input: InputEvent =>
      println(input)
  }
}


