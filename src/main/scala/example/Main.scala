package example

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
  println(s"The youngest person is ${ages.min}")
  println(s"The oldest person is ${ages.maxBy(_.toInt)}")

  val names = Seq("Alice", "Bob", "Charlie", "Derek")
  println(s"The longest name is ${names.maxBy(_.length)}")
}