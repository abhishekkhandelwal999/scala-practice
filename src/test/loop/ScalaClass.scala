
object ScalaClass {

  def main(args: Array[String]) {
    var names = List("Abhishek", "Amit", "Amar")
    var finalNames = for {
      name <- names; if name.startsWith("A"); if (name.length == 4)
    } yield name
    var newList = List("Abhi")
    newList = "test" :: newList
    finalNames = finalNames ::: newList

    println(finalNames)
    println(finalNames.map( name => name.substring(2)))
    val map = Map("Abhishek" -> 18, "Amit" -> "20", "Amar" -> 25)
    val Mapx = for {
      mapVal <- map; if Integer.parseInt(mapVal._2.toString) > 19
    } yield mapVal

    println(Mapx.toString())

    def f(x: String) =  if (x.equalsIgnoreCase("Abhi")) Some(x) else None

    println(finalNames.map (x => f(x)))

    def g(x: String) = List (x, x.substring(2), x.substring(1))
    println (finalNames.flatMap(x => g(x)))
  }
}