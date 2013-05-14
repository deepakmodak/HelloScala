package com.digitalgradient.scala

class MathActivity {
	def factorial(x: BigInt): BigInt =
			if (x == 0) 1 else x * factorial(x - 1)

	def gcd(a: Int, b: Int): Int = 
	  		if (b == 0) a else gcd(b, a % b)

	def square(x: Int): Int = x * x

	def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

}