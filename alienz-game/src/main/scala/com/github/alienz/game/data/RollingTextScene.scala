package com.github.alienz.game.data

import com.github.gigurra.glasciia.{Scene, TimedScene}

/**
  * Created by johan on 2016-10-31.
  */
object RollingTextScene {
  def apply(text: String,
            wordsPerSecond: Int = 2): Scene = {
    val words = text.split("\\W+")
    new TimedScene(words.length * wordsPerSecond) {}
  }
}
