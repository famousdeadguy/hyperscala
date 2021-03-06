package org.hyperscala.style

/**
 * @author Matt Hicks <mhicks@powerscala.org>
 */
case class Length(value: String) extends StyleValue

object Length {
  val Auto = Length("auto")
  val Inherit = Length("inherit")
  def Pixels(v: Int) = Length("%spx".format(v))
  def Centimeters(v: Int) = Length("%scm".format(v))
  def Percent(v: Int) = Length(v + "%")
}