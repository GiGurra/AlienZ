package com.github.alienz.game.state

import com.github.gigurra.math.Box2

/**
  * Created by johan on 2016-10-31.
  */
case class Zone(val environmentType: EnvironmentType,
                val bounds: Box2[Long]) {

}
