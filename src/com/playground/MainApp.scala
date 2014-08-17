package com.playground

class Person(val id: Integer, val age: Integer, val gender: String, val firstName: String, val lastName: String)

object MainApp {

  def main(args: Array[String]) {

    val people = List(
      new Person(1, 20, "M", "Peter", "Griffin"),
      new Person(2, 10, "M", "Bart", "Simpson"),
      new Person(3, 50, "M", "Homer", "Simpson"),
      new Person(4, 25, "F", "Meg", "Griffin"),
      new Person(5, 40, "M", "Alex", "Johnson"),
      new Person(6, 60, "M", "Clark", "Ken"),
      new Person(8, 18, "F", "Lisa", "Simpson")
    )

    println("Males over 18");
    val malesOver18 = people.filter(p => p.age > 18 && p.gender.equalsIgnoreCase("M"))
    malesOver18.foreach(p => System.out.println(p.firstName + "," + p.age))

    println("\nFemales over 18");
    val femalesOver18 = people.filter(p => p.age > 18 && p.gender.equalsIgnoreCase("F"))
    femalesOver18.foreach(p => System.out.println(p.firstName + "," + p.age))
  }
}
