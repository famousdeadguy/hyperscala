package org.hyperscala.js

/**
 * @author Matt Hicks <mhicks@powerscala.org>
 */
object Math {
  def random() = ExistingVariable[Double]("Math.random()")

  def floor(v: TypedVar[Double]) = ExistingVariable[Int]("Math.floor(%s)".format(v.reference.get))
}
