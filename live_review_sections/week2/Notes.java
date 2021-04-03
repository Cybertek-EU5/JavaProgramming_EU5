package week2;

public class Notes {
	
	/*
	04/03/2021
Week 2 Java Review

	Review topics: 
		Arithmetic Opertaors: +, -, *, /, %

		Unary Operators: -, +, --, ++, !

		Shorthand Operators: =, +=, -=, *=, /=, %=

		Relational Operators: >, <, <=, >=, ==, !=

		Logical Operators: |, &, ||, &&, ^

		If Statements: single if, if & else, Multi-branch if, nested If

		ternary:  ? , :

	


Arithmetic operators: 
                +: addition
                	10 + 2 = 12

                -: subtraction
                	10 - 3 =7

                *: multiplication
                	10 * 2 = 20;

                /: division
                	in math: 10/3 ==> 3.33333
                	in java: 10/3 => 3
                			 10.0/3 ==> 3.3333
                			 10/3.0 ==> 3.3333

                	in java: int/int ==> int 
                			 double/int ==> double
                			 int/double ==> double
                			 double/double ==> double


                %: remainder
                		10%3 ==> 1
                		15%2 ==> 1
                		20%7 ==> 6

                	int math: 10/3 ==> 3.33333 ;
                			remainder: 10 - (3 * 3) = 1

        					 15 / 2 ==> 7.5
        					 remainder: 15 - (2 * 7) = 1

        					 20/7 ==> 2.8...
        					 remainder: 20 - (7 *2) = 6


					 remainder: numerator - (denominator * whole number of result)


Unary operators:
		-: negative
			-10 ===> less than 0

		+: positive
			10 or +10 ===> greater than 0

		--: decreases the value by 1
				int a = 10;
					--a; ==> 9

		++: increases the value by 1
				int a = 10;
				++a ==>  11;

			two types of increament/decreament:
				pre: place  increament/decreament before variable. increase/decreases by 1 immediately
					int a = 10;
						--a; ==> 9	

					int a = 10;
					++a ==>  11;

				post: place  increament/decreament after variable. first passes current value, then increase/decreases by 1

					int a = 10;
					int b = a--;  b ==>  10
								  a ==> 9

	!: not, opposite
		!true  ==> false
		!!true ==> true
		!false ==> true
		!!false ==>false

		!yes

shorthand operators:
		+=
			int a = 10;
			a = a + 20 + 5 

			a +=  20 + 5
			a += 25  ==> a = a + 25 ==> 35

			a ==> 35



		-=
			int a = 100;
			 a -= 20 * 2
			 a -= 40; ==> a = a - 40; 60


		*=

		/=

		%=


Relational Operators: return boolean
		>: greater than

			10 > 9 ==> true

		<: less than

			10 < 9 ==> false

		>=: greater than or equal (either)
			10 >= 10  ==> true
			10 >= 9 ==> true
			10 >= 11 ==> false

		<=: lass than or equal

			9 <= 10 ==> true

			8 <= 5 ==> false


		==: equal

			10 == 20 ==>false
			true == false  ==> false

			true == !false ==> true


		!=


Logical Operators:
	
		||: or. only one condition need to be true in order to return true
			AS LONG AS ONE CONDITION IS TRUE, IT WILL ALWAYS RETURNS TRUE

	
		&&: and. both conditions MUST be true in order to return true
				AS LONG AS ONE CONDITION IS FALSE, IT ALWAYS RETURNS FALSE


		^: BITE WISER EXCLUSIVE OR OPERATOR
				if only one condition is true, then returns true. otherwise always returns false

				true ^ false ==> true
				false ^ true ==> true

				true ^ true ==> false
				false ^ false ==> false

come back at 2:10 pm US EST

If statements:
	
	single if statement: for one condition, or option

				if(Condition){
					statements;	
				}


				if( eligible){
					can buy alcohol
				}

				if ( not eligible){
				 cannot by alcohol
				}


	if & else statement: 2 options or  2 possibile conditions (NOT MORE NOT LESS)

			if(Condition){
				statement A;
			}else{
				statement B;
			}

			if(eligible){
				can buy alcohol
			}else{
				can not buy
			}


	multi-branch if statement: if there are more than two options or possible outcomes
			// Excellent, reat, good, okay, bad

			if(Condition1){
				statementA;
			}else if(Condition2){
				statementB;
			}else if(Condition3){
				statementC;
			}else{
				statementD;
			}



	nested if: if the condition can be evaluated into multiple scenarios
				if we have pre condition (Mandatory step)


		A, B, C, D, F
		Precondition: score MUST be valid if score   between 0 to 100


		1-Monday, 2-Tuesday, 3-Wednesday, 4-Thursday, 5-Friday, 6-Saturday, 7-Sunday
		precondition: number MUST be between 1-7


		if(){
			if statment
		}


ternary: shortcut of if statemnts
		
		? if keyword  
			(condition)?   ==  if(Condition)

		: else keyword
			:(condition)?  == else if(Condition)
			:   == else{ }

		TOTAL NUMBER OF ? MUST BE EQUAL TO TOTAL NUMBER OF : IN TERNARY




	 */

}
