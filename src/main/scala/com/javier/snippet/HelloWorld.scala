


package com.javier.snippet

import scala.xml.{NodeSeq}
import net.liftweb.util.Helpers._

class HelloWorld {
  def render = "*" #> <strong>hola mundo!</strong>
}