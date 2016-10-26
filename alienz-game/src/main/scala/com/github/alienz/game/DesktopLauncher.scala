package com.github.alienz.game

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}

/**
  * Created by johan on 2016-10-26.
  */
object DesktopLauncher {

  def main(args: Array[String]): Unit = {

    val config = new LwjglApplicationConfiguration {
      x = 100
      y = 100
      width = 1280
      height = 720
      resizable = true
      fullscreen = false
      title = "Test Game 1"
      forceExit = false
      vSyncEnabled = true
      samples = 4
      foregroundFPS = 0 // 0 means no limit
      backgroundFPS = 30
    }

    new LwjglApplication(new Alienz, config)
  }
}
