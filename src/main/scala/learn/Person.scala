package learn

class Person(var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}
