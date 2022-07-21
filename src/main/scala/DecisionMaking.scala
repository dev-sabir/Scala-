object DecisionMaking {

  def main(args: Array[String]): Unit = {

    //Decision making in programming is similar to decision making in real life.
    // In decision making, a piece of code is executed when the given condition is fulfilled.
    // Sometimes these are also termed as the Control flow statements.
    // Scala uses control statements to control the flow of execution of the program based on certain conditions.
    // These are used to cause the flow of execution to advance and branch based on changes to the state of a program.

    //The conditional statements of Scala are:
    //    if
    //    if-else
    //    Nested if-else
    //    if-else if ladder

    /*  if statement  */

    //“if” statement is the simplest decision making statements among all decision making statements.
    // In this statement, the block of code is executed only when the given condition is true and if the condition is false then that block of code will not execute.

    //SYNTAX
      //  if(condition)
      //  {
      //    Code to be executed
      //  }

    //Here, condition after evaluation will be either true or false. if statement accepts boolean values – if the value is true then it will execute the block of statements under it.
    //If we do not provide the curly braces ‘{‘ and ‘}’ after if(condition) then by default if statement will consider the immediate one statement to be inside its block.
    //Example:
    //
    //if(condition)
    //   statement1;
    //   statement2;

    //// Here if the condition is true, if block
    //// will consider only statement1 to be inside
    //// its block.

    var a: Int = 20;
    if(a>10){
      println("A is greater than 20")
    }


    /*  if-else  statement  */
    //The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t.
    // But what if we want to do something else if the condition is false. Here comes the else statement.
    // We can use the else statement with if statement to execute a block of code when the condition is false.

    //SYNTAX
        //  if (condition)
        //  {
        //       Executes this block if condition is true
        //  }
        //  else
        //  {
        //      Executes this block if  condition is false
        //  }

      var x: Int = 50
      if(x>100){
        println("X is greater than 100.")
      }else{
        println("X in not greater than 100.")
      }


    /* Nested if else  */

    //Nested if-else statement
    //A nested if is an if statement that is the target of another if-else statement.
    // Nested if-else statement means an if-else statement inside an if statement or in a else statement.
    // Scala allows us to nest if-else statements within if-else statement.

    // Nested structure is similar to C++ or Python or JavaScript
    //Google it if don't know the nested structure

    /*  if-else if Ladder  */

    //Here, a user can decide among multiple options. The if statements are executed from the top down.
    // As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed.
    // If none of the conditions is true, then the final else statement will be executed.

    //SYNTAX:
        //    if(condition_1)
        //    {
        //        this block will execute when condition_1 is true
        //    }
        //    else if(condition_2)
        //    {
        //       this block will execute  when condition2 is true
        //    }
        //    .
        //    .
        //    .
        //    else
        //    {
        //       this block will execute when none of the condition is true
        //     }
  }
}