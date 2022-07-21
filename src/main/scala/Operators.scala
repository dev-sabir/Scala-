//An operator is a symbol that represents an operation to be performed with one or more operand.
// Operators allow us to perform different kinds of operations on operands.
// There are different types of operators used in Scala as follows:

//    Arithmetic Operators
//    Relational Operators
//    Logical Operators
//    Assignment Operators
//    Bitwise Operators

object Operators{

  def main(args: Array[String]): Unit = {

    //operands
    var a = 20
    var b = 7

    var result = 0


    /*  Arithmetic Operator  */
    println("##### Arithmetic Operator #####")
    //    Addition(+) operator adds two operands. For example, x+y.
    //    Subtraction(-) operator subtracts two operands. For example, x-y.
    //    Multiplication(*) operator multiplies two operands. For example, x*y.
    //    Division(/) operator divides the first operand by the second. For example, x/y.
    //    Modulus(%) operator returns the remainder when the first operand is divided by the second. For example, x%y.
    //    Exponent(**) operator returns exponential(power) of the operands. For example, x**y.


    /*  Using arithmetic Operator  */
    // Addition
    println("Addition of a + b = " + (a + b))

    // Subtraction
    println("Subtraction of a - b = " + (a - b))

    // Multiplication
    println("Multiplication of a * b = " + (a * b))

    // Division
    println("Division of a / b = " + (a / b))

    // Modulus
    println("Modulus of a % b = " + (a % b))





    /* Relational Operator */
    println("##### Relational Operator #####")
    //    Equal To(==) operator checks whether the two given operands are equal or not. If so, it returns true. Otherwise it returns false. For example, 5==5 will return true.
    //    Not Equal To(!=) operator checks whether the two given operands are equal or not. If not, it returns true. Otherwise it returns false. It is the exact boolean complement of the ‘==’ operator. For example, 5!=5 will return false.
    //    Greater Than(>) operator checks whether the first operand is greater than the second operand. If so, it returns true. Otherwise it returns false. For example, 6>5 will return true.
    //    Less than(<) operator checks whether the first operand is lesser than the second operand. If so, it returns true. Otherwise it returns false. For example, 6<5 will return false.
    //    Greater Than Equal To(>=) operator checks whether the first operand is greater than or equal to the second operand. If so, it returns true. Otherwise it returns false. For example, 5>=5 will return true.
    //    Less Than Equal To(<=) operator checks whether the first operand is lesser than or equal to the second operand. If so, it returns true. Otherwise it returns false. For example, 5<=5 will also return true.

    /*  Using Relational Operators  */

    // Equal to operator
    println("Equality of a == b is : " + (a == b))

    // Not equal to operator
    println("Not Equals of a != b is : " + (a != b))

    // Greater than operator
    println("Greater than of a > b is : " + (a > b))

    // Lesser than operator
    println("Lesser than of a < b is : " + (a < b))

    // Greater than equal to operator
    println("Greater than or Equal to of a >= b is : " + (a >= b))

    // Lesser than equal to operator
    println("Lesser than or Equal to of a <= b is : " + (a <= b))




    /*  Logical Operator  */
    println("##### Logical Operator #####")
    //    They are used to combine two or more conditions/constraints or to complement the evaluation of the original condition in consideration. They are described below:
    //    Logical AND(&&) operator returns true when both the conditions in consideration are satisfied. Otherwise it returns false. Using “and” is an alternate for && operator. For example, a && b returns true when both a and b are true (i.e. non-zero).
    //    Logical OR(||) operator returns true when one (or both) of the conditions in consideration is satisfied. Otherwise it returns false. Using “or” is an alternate for || operator. For example, a || b returns true if one of a or b is true (i.e. non-zero). Of course, it returns true when both a and b are true.
    //    Logical NOT(!) operator returns true the condition in consideration is not satisfied. Otherwise it returns false. Using “not” is an alternate for ! operator. For example, !true returns false.

    /*  Using Logical Operator  */
    // logical NOT operator
    var c = true
    var d = false
    println("Logical Not of !(c && d) = " + !(c && d))

    // logical OR operator
    println("Logical Or of c || d = " + (c || d))

    // logical AND operator
    println("Logical And of c && d = " + (c && d))

    /* Ask Sir Why Logical Operator can do operation on Int */

    //Using Logical Operator 'OR'
    //    println("Logical Or of a and b is: "+ (a || b))

    //    var x: Int = 10
    //    var y: Int = 20
    //    println("Logical Or of a || b = " + (x || y))
    // Above Code is raising an error-> "value || is not a member of Int


    /* Assignment Operator  */
    println("##### Assignment Operator #####")
    //    Assignment operators are used to assigning a value to a variable.
    //    The left side operand of the assignment operator is a variable and right side operand of the assignment operator is a value.
    //    The value on the right side must be of the same data-type of the variable on the left side otherwise the compiler will raise an error.
    //    Different types of assignment operators are shown below:
    //    Simple Assignment (=) operator is the simplest assignment operator. This operator is used to assign the value on the right to the variable on the left.
    //    Add AND Assignment (+=) operator is used for adding left operand with right operand and then assigning it to variable on the left.
    //    Subtract AND Assignment (-=) operator is used for subtracting left operand with right operand and then assigning it to variable on the left.
    //    Multiply AND Assignment (*=) operator is used for multiplying the left operand with right operand and then assigning it to the variable on the left.
    //    Divide AND Assignment (/=) operator is used for dividing left operand with right operand and then assigning it to variable on the left.
    //    Modulus AND Assignment (%=) operator is used for assigning modulo of left operand with right operand and then assigning it to the variable on the left.
    //    Exponent AND Assignment (**=) operator is used for raising power of the left operand to the right operand and assigning it to the variable on the left.
    //    Left shift AND Assignment(<<=)operator is used to perform binary left shift of the left operand with the right operand and assigning it to the variable on the left.
    //    Right shift AND Assignment(>>=)operator is used to perform binary right shift of the left operand with the right operand and assigning it to the variable on the left.
    //    Bitwise AND Assignment(&=)operator is used to perform Bitwise And of the left operand with the right operand and assigning it to the variable on the left.
    //    Bitwise exclusive OR and Assignment(^=)operator is used to perform Bitwise exclusive OR of the left operand with the right operand and assigning it to the variable on the left.
    //    Bitwise inclusive OR and Assignment(|=)operator is used to perform Bitwise inclusive OR of the left operand with the right operand and assigning it to the variable on the left.

    /* Using Assignment Operator */
    var x = 90
    var y = 29
    var z = 0

    // simple addition
    z = x + y;
    println("simple addition: z= x + y = " + z);

    // Add AND assignment
    z += x;
    println("Add and assignment of z += x = " + z);

    // Subtract AND assignment
    z -= x;
    println("Subtract and assignment of z -= x = " + z);

    // Multiply AND assignment
    z *= x;
    println("Multiplication and assignment of z *= x = " + z);

    // Divide AND assignment
    z /= x;
    println("Division and assignment of z /= x = " + z);

    // Modulus AND assignment
    z %= x;
    println("Modulus and assignment of z %= x = " + z);

    // Left shift AND assignment
    z <<= 3;
    println("Left shift and assignment of z <<= 3 = " + z);

    // Right shift AND assignment
    z >>= 3;
    println("Right shift and assignment of z >>= 3 = " + z);

    // Bitwise AND assignment
    z &= x;
    println("Bitwise And assignment of z &= 3 = " + z);

    // Bitwise exclusive OR and assignment
    z ^= x;
    println("Bitwise Xor and assignment of z ^= x = " + z);

    // Bitwise inclusive OR and assignment
    z |= x;
    println("Bitwise Or and assignment of z |= x = " + z);


    /* Bitwise Operator */
    println("##### Bitwise Operator #####")
    //    In Scala, there are 7 bitwise operators which work at bit level or used to perform bit by bit operations.
    //    Following are the bitwise operators :
    //    Bitwise AND (&): Takes two numbers as operands and does AND on every bit of two numbers. The result of AND is 1 only if both bits are 1.
    //    Bitwise OR (|): Takes two numbers as operands and does OR on every bit of two numbers. The result of OR is 1 any of the two bits is 1.
    //    Bitwise XOR (^): Takes two numbers as operands and does XOR on every bit of two numbers. The result of XOR is 1 if the two bits are different.
    //    Bitwise left Shift (<<): Takes two numbers, left shifts the bits of the first operand, the second operand decides the number of places to shift.
    //    Bitwise right Shift (>>): Takes two numbers, right shifts the bits of the first operand, the second operand decides the number of places to shift.
    //    Bitwise ones Complement (~): This operator takes a single number and used to perform the complement operation of 8-bit.
    //    Bitwise shift right zero fill(>>>): In shift right zero fill operator, left operand is shifted right by the number of bits specified by the right operand, and the shifted values are filled up with zeros.

    /*  Using Bitwise Operator  */
    // variables
    var i = 20;
    var j = 18;
    var k = 0;

    // Bitwise AND operator
    k = i & j;
    println("Bitwise And of i & jj = " + k)

    // Bitwise OR operator
    k = i | j
    println("Bitwise Or of i | jj = " + k);

    // Bitwise XOR operator
    k = i ^ j
    println("Bitwise Xor of i ^ jj = " + k)

    // Bitwise once complement operator
    k = ~i
    println("Bitwise Ones Complement of ~i = " + k);

    // Bitwise left shift operator
    k = i << 3
    println("Bitwise Left Shift of i << 3 = " + k)

    // Bitwise right shift operator
    k = i >> 3
    println("Bitwise Right Shift of i >> 3 = " + k)

    // Bitwise shift right zero fill operator
    k = i >>> 4
    println("Bitwise Shift Right i >>> 4 = " + k)
  }
}
