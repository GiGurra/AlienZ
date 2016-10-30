package com.github.alienz.game

import com.github.alienz.game.drawing.{drawGui, drawWorld}
import com.github.alienz.game.state.{GameState, update}
import com.github.gigurra.glasciia.GameEvent.{Init, InputEvent, Render}
import com.github.gigurra.glasciia.{Game, GameEvent}

/**
  * Created by johan on 2016-10-26.
  */
class Alienz extends Game {

  val state = GameState()

  def eventHandler: PartialFunction[GameEvent, Unit] = {

    case Render =>
      update(state)
      drawWorld(state, canvas)
      drawGui(state, canvas)

    case input: InputEvent =>
      println(input)
  }
}


