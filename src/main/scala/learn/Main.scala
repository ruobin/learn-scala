package learn

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
  println(s"The youngest person is ${ages.min}")

  val names = Seq("Alice", "Bob", "Charlie", "Derek")
  println(s"The longest name is ${names.maxBy(_.length)}")

  for (i <- 0 to 10 by 2) println(i)

  val x = for (i <- 1 to 5) yield i * 2
  println(x)

  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLengths = for {
    f <- fruits
    if f.length > 4
  } yield f.length
  println(fruitLengths)

  var nums = List.range(1, 10)
  println(nums)

  val doubles = nums.map(_ * 2)
  println(s"doubles list is $doubles")

  println(s"sum of numbers is ${nums.foldLeft(0)(_ + _)}")
  println(s"product of numbers is ${nums.foldLeft(1)(_ * _)}")

  nums = (1 to 10 by 3).toList
  println(nums)


  val p = new Person("Julia", "Kern")
  p.printFullName()
}