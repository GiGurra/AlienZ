package com.github.alienz.game.state

/**
  * Created by johan on 2016-10-31.
  */
case class StoryProgression() {

}

object StoryProgression {
  def newGame(): StoryProgression = {
    new StoryProgression()
  }
}
