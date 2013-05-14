package com.digitalgradient.scala

import scala.collection.immutable.HashSet
import scala.collection.mutable.Map

import com.digitalgradient.scala

object SayHello {	

	def max(x: Int, y: Int): Int = {
			if (x > y) x
			else y
	}
    def arrayExamples() = {
     	val numNames = Array("zero", "one", "two")
		for (i <- 0 to 2)
			print(numNames(i)+ " ")

		val greetStrings = new Array[String](3)
		greetStrings(0) = "Hello"
		greetStrings(1) = ", "
		greetStrings(2) = "world!\n"

		for (i <- 0 to 2)
			print(greetStrings(i))

		greetStrings.update(0, "I")
		greetStrings.update(1, " am ")
		greetStrings.update(2, "learning Scala \n")
		for (i <- 0.to(2))
			print(greetStrings.apply(i))
      
    }
    
	def listExamples() = {
		val oneTwo = List(1, 2)
		val threeFour = List(3, 4)
		// List has a method named ‘:::’ for list concatenation.

		val oneTwoThreeFour = oneTwo ::: threeFour
		println(oneTwo +" and "+ threeFour +" were not mutated.")
		println("Thus, "+ oneTwoThreeFour +" is a new list.")
		
		/* '::', which is called as “cons”
			Cons prepends a new element to the beginning of an existing list, and
			returns the resulting list.
		*/
		val twoThree = List(2, 3)
		val oneTwoThree = 1 :: twoThree
		println(oneTwoThree)
	}

	def tupleExamples() = {
		val pair = (99, "Luftballons")
		println(pair._1)
		println(pair._2)
  
	}
	
	def setExamples() = {	  
	  var jetSet = Set("Boeing", "Airbus")
	  jetSet += "Lear"
	  println(jetSet.contains("Cessna"))
	  println(jetSet)	  
	  val hashSet = HashSet("Tomatoes", "Chilies")
	  println(hashSet + "Coriander")
	}
	
	def mapExamples() = {
	  
	   var capital = Map("US" -> "Washington",
				"India" -> "New Delhi")
			capital += ("Japan" -> "Tokyo")

		println(capital("India"))
		
	    val treasureMap = Map[Int, String]()
		treasureMap += (1 -> "Go to island.")
		treasureMap += (2 -> "Find big X on ground.")
		treasureMap += (3 -> "Dig.")
		println(treasureMap(2))
		
		val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
		println(romanNumeral(4))
	}
	def loopExamples() = {
		val numbers = Array("zero", "one", "two","three")
		for (i <- 0 to 3)
			println(numbers(i)+ " ")
		
		for ( num <- numbers)
			println(num)
			
		numbers.foreach(println)

		var j = 0
		while (j < numbers.length) {
			println(numbers(j))
			j += 1
		}  
	  
	}
		
	def classfunctionCallExamples() ={
		//get factorial 
		var mathAct = new MathActivity()
		println(mathAct.factorial(5))

		//get gcd
		println(mathAct.gcd(14, 21))

		//get square
		println(mathAct.square(4))

		//get poer of two
		println(mathAct.powerOfTwo(3))
	}
	
	def main(args: Array[String]): Unit = {

	    println("hello scala")
		//function call
		println("Max out of 6 & 7 is :"+max(6,7))
        
		classfunctionCallExamples()
		arrayExamples()
		loopExamples()
		listExamples()
		tupleExamples()
		setExamples()
		mapExamples()


	}

}