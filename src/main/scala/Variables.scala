object Variables {

  def main(args: Array[String]): Unit = {


    //In Scala there're two type of variables
    //1. Mutable Variables  2. Immutable Variables
    //  Mutable Variables: These variables are those variables which allow us to change a value after the declaration of a variable.
    //    Mutable variables are defined by using the “var” keyword.
    //  Immutable Variables: These variables are those variables which do not allow you to change a value after the declaration of a variable.
    //    Immutable variables are defined by using the “val” keyword.

    // Mutable Variable
    // SYNTAX
    // var Variable_name: Data_type = "value";

    var name1: String = "Hello World";

    //We can do somthing like this

    name1 = "Hello"


    // Immutable Variable
    //SYNTAX
    // val Variable_name: Data_type =  "value";
    val name2: String = "Hello World";

    //we can't do this, it give an error
    //name2 = "Hello"


    //######################################

    //Rules for naming variable in Scala
    //    Variable name should be in lower case.
    //    Variable name can contain letter, digit and two special characters(Underscore(_) and Dollar($) sign)
    //    Variable name must not contain the keyword or reserved word.
    //    Starting letter of the variable name should be an alphabet.
    //    White space is not allowed in variable name.


    //##############################

    //NOTE: SCALA SUPPORTS MULTIPLE ASSIGNMENT BUT YOU CAN USE MULTIPLE ASSIGNMENT ONLY WITH **IMMUTABLE VARIABLES**.
    //For Example:
    //val(name1:Int, name2:String) = pair(2, "Hello World")
    val (roll_no: Int, s_name: String) = (135, "Mohd Sabir")
    println(roll_no)
    println(s_name)

    //############################################

    //VARIABLE TYPE INFERENCE IN SCALA: Scala supports variable type inference. In variable type inference values are directly assigned to the variable without defining its data type, the Scala compiler automatically resolves which value belongs to which data type.
    //  For Example:
    var name3 = 40;
    val name4 = "Hello World";
    println(name3)
    println(name4)
    //Here, name1 is by default int type and name2 is by default string type.
  }
}