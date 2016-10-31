package com.github.alienz.game

import com.github.alienz.game.drawing.{drawGui, drawWorld}
import com.github.alienz.game.state.{GameState, updateWorld}
import com.github.gigurra.glasciia.GameEvent.{Init, InputEvent, Render}
import com.github.gigurra.glasciia.{Game, GameEvent}

/**
  * Created by johan on 2016-10-26.
  */
object AlienZ extends Game {

  var state = GameState.newGame()

  def eventHandler: PartialFunction[GameEvent, Unit] = {

    case Render(appTime, _) =>
      updateWorld(state, appTime)
      drawWorld(state, canvas)
      drawGui(state, canvas)

    case input: InputEvent =>
      println(input)
  }
}


