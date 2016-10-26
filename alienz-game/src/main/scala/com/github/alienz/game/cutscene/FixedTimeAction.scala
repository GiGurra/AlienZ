package com.github.alienz.game.cutscene

/**
  * Created by johan on 2016-10-26.
  */
case class FixedTimeAction(t0: Long,
                           duration: Long,
                           var t: Long) extends Node {

  def dt: Long = t - t0

  override def finished: Boolean = dt >= duration
}
