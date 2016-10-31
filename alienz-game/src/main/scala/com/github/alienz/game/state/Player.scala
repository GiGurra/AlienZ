package com.github.alienz.game.state

import java.util.UUID

import com.github.gigurra.math.Vec2

/**
  * Created by johan on 2016-10-31.
  */
case class Player(val name: String,
                  val id: UUID,
                  var pos: Vec2[Long]) {

}

object Player {
  def newGame(name: String = "John Doe"): Player = {
    Player(
      name = name,
      id = UUID.randomUUID(),
      pos = Vec2.zero
    )
  }
}
