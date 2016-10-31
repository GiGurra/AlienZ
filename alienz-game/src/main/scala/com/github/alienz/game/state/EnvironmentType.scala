package com.github.alienz.game.state

import enumeratum._

sealed trait EnvironmentType extends EnumEntry
object EnvironmentType extends Enum[EnvironmentType] {
  val values = findValues
  case object SURFACE extends EnvironmentType
  case object ORBIT extends EnvironmentType
  // TODO: Add SYSTEM and DEEP_SPACE
}
