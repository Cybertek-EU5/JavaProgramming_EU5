package week3;

public class Notes {
	
	/*
	04/10/2021
Week3 Java Review:
		1. Switch statements
		2. Loops
		3. Branching statements
		4. Methods
		


Switch statement:
	
boolean : equal, not equal, greater, less, . etc

	syntax:
		switch(expression){ // MUST be evaluated to single value

			case caseValue1: 
				statementA;
				break;   // for exiting the siwtch

			case caseValue2:
				statemementB;
				break;

			...

			default:
					statmentC;					

		}

		SWITCH does not accept: boolean, double, float, long

		caseValue MUST match with switch statements' expression

		caseValue MUST be unique

		whichever case matches, gets executed first

		dfeault block gets executed if none of the cases are matching


	number: 1~12

	28 days: 2
	30 days: 4, 6, 9, 11
	31 days: 1,3,5,7,8,10,12
	invalid Days: less than 1 or greaters than 12


Loops: repeated actions
		 for loop, while loop, do-while loop

		 for loop: only gets executed if the condition is true

		 		for(initialization; Condition; Iteration ){
		 				statement
		 		}

		 		initialization: starting point

		 					i = 1;

				Condition: ending point, created based on initialization

							i <= 5

				Iteration: co-related to the condition. MUST be capable enough to make the condition false


		while loop: repeated if statement
				while(Condition){ // true
					statementA; // gets executed multiple times
				}


				if(Condition){ // true
					statementB;  // only gets executed one time
				}

		do-while loop:

			do{

			}while(Condition);


Nested Loop: loop inside another loop
	when do we need it: when we need to repeat a loop

	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop
	1 2 3 4 5  // 1 for loop

	==========================
	total 10 for loops are being used ==> can be created by using one nested loop

Branching statements:
	break: used for exiting the loop & switch statement
			when we need to forcefully exit the loop

	continue: skip iteration, jumps to the enxt iteration. 
				THERE MUST BE A LOOP

	return: exits the method. can also be used to return a value


Methods: Function. grouping aseries of codes

	int n1 =10            isEven(n1);   
	if(n1%2==0){
		Even
	}

	int n2 = 20;          isEven(n2);
	if(n1%2==0){
		Even
	}


	Access-Modifier   specifier   return-Type   methodName(Parameter){
				statements
	}

	Access-modifiers: public, private, protected, default
			public: always accessible

	specifier: static, final, abstract
			static: can be called through class name

	returnType:  void, any dataType
			void: cannot return any value from the method
			not-void: method returns a value

	parameter: any dataType
			a data that the method method MUST have in order to complete functionality




		
		
	 */

}
