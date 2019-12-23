import mill._
import scalalib._
import publish._
import $ivy.`com.lihaoyi::mill-contrib-bsp:$MILL_VERSION`

object myproj extends ScalaModule {
  def scalaVersion = "2.12.10"

  override def ivyDeps = Agg(
    ivy"com.lihaoyi::os-lib:0.4.0",
    ivy"com.lihaoyi::upickle:0.8.0"
  )

  object tests extends Tests {
    def ivyDeps = Agg(
      ivy"com.lihaoyi::ammonite-ops:1.8.1",
      ivy"com.lihaoyi::utest:0.7.2"
    )

    def testFrameworks = Seq("utest.runner.Framework")
  }
}