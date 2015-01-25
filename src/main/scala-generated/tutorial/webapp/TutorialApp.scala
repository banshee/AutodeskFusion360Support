package tutorial.webapp

import scala.scalajs.js
import js.annotation.JSExport
import js.Dynamic.global
import com.restphone.fusion360._

@JSExport("HelloWorld")
object HelloWorld {
  @JSExport("getXStr")
  def getStr(app: Application): String = {
    val x: Any = app
    app match {
      case x: Application => global.console.log(s"got application ${x.getClass}")
      case _ => global.console.log("got something other than application2")
    }
    val p: Product = app.activeProduct
    global.console.log(s"p.objectType is ${p.objectType}")
    workWithDesign(p.asInstanceOf[Design])
    "done"
  }

  def workWithDesign(d: Design) = {
    val sketches: Sketches = d.rootComponent.sketches
    val xyPlane = d.rootComponent.xYConstructionPlane
    for {
      sketch <- SketchesUtilities.toSeq(sketches)
      _ = println(sketch)
      constraint <- GeometricConstraintsUtilities.toSeq(sketch.geometricConstraints)
    } {
      println(s"constraint is $constraint")
    }
  }
}
