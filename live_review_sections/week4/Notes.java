package week4;

public class Notes {
	/*
	 04/17/2021
Week 4 Java Review:
			1. Class & Object
			2. Garbage Collection & Collector
			3. Scanner: next() vs nextLine()
			4. String & Loop
			5. String & nested loop
			6. Custom methods & overloading

class: Templete of object. where all objects are came from
		indicates the attributes and actions/beharios of the object

		Circle:
			attributes:
				radius

			action/behaviors:
					area()
					perimeter()


Object: instance of the class (created from a class)
		
		circle1.r ==> r=3
		circle2.r ==> r=5
		circle3.r ==> r=6

		circle1.area() ==>  3 * 3 * PI
		circle2.area() ==>

	Instance variables: belongs to the object
						each object has it's own copy of instance variables

	Instance methods: belongs to the object
						each object has it's own copy

			instance: multiple copies
			static: one copy

	toString(): converst the object to String
				exewcutes automatically wheneever the object is passed to the console

	Salary:
		attributes
			rate, weeklyHour, taxRate

		actions:
			setInfo(), salary(), totalTax(), salaryAfterTax(), toString()

	Pizza:
		attribue:
			size
			numberOfCheeseTopping
			numberOfPeperoniTopping

		Actions:
			setInfo(), calculatePrice(), toString()

			assume that:
				size:
					small ==> $10
					medium ==> $11
					large ==> $12

				one cheese topping 1$
				one peporoniz topping 2$


Garbage Collection: collection of garbage objects (unreferenced objects)
			
		unreferenced objects:
				1. re-assigning reference variables 
						String str = "java";
						str = "python";  // "java" is unreferenced and eligible for garbage collection

						sout(str); // python

				2. assigning null
						String str = "Java";
							str = null;  // "java" is unreferenced and eligible for garbage collection




garbage collector: responsible for collecting the objects that are eligible for garbage collection. and destroying it


Scanner: used for getting user input
	
	import packageName.className;  // imports a single class for a package

	import packageName.*; // imports all the class from a package

	Scanner	scan = new Scanner(System.in);

	System.in

	nextInt(): gets user input as int
	nextDouble(): gets user input as double
	nextBoolean(): gets user input as boolean
	next().charAt(0): gets user input as char

	next(): gets user input as String
		only takes one word

	nextLine(): gets user input as String
		TAKES EVERY THING. EVEN THE ENTRY KEY


	Task 1:
		  ask user to enter :
				first name (next())
				last name (next())
				age (nextInt())
				job title (nextLine())

	Task 2:
		ask user to enter:
			full name (nextLine())
			Address (nextLine)
			city name (nextLine)
			state (nextLine)
			zipcode ( next() )
			age (nextInt())


String: 	
		
		1. Object:
				literal:  
						 String str1 = "Java"
						 String str2 = "Java"

						 String pool: special memory location for all string literals
						 			DOES NOT contain duplicated objects

				new keyword: 
						String str1 = new String("Java");
						String str2 = new String("Java");



		2. Immutable: not changable, cannot modified


		3. sequences of characters: each character in string has representive number called index number.
				index number: starts from zero

					String str ="Java Language";
					//	index:   0123456789...	   




Task:
	write a program that can return the unique characters from a string

		ex:
			"aabcccd";

		output:
			bd

	Write a program that can remove duplciated characters from a string

		ex:
			str = "aaaabbbbbbcccccccccdddd"

			output:
				abcd

	Write a program that can return the first non-duplicated character from the string
		ex:
			str = "aaabcccdeeef"

			output:
				b








	 */

}
