package com.github.alienz.game.data

import com.github.gigurra.glasciia.Act

/**
  * Created by johan on 2016-10-31.
  */
object IntroCutscene {
  def apply(): Act = {
    Act(
      RollingTextScene(
        s"""Project Lazarus.. The name never quite made any sense.
           |Oddly enough your application was accepted - why they would
           |chose someone so average seemed strange, but then again,
           |what was there to lose.
           |
           |You have spent your last presumable 250 years dreaming
           |in cryo sleep. Dreaming about where you are going, about where
           |you left. Certainly not about who you left behind - they're
           |all dead..
           |
           |Your ship, Ark6, was the last to launch to launch. Supposed to
           |jump with the rest of the Arks, but due to an overwhelming number
           |of system failures was delayed. You chose to go into cryo sleep
           |anyway, while repairs were being made. 1st generation FTL..
         """.stripMargin
      )
    )
  }
}
