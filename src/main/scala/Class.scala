object Class{
  def main(args: Array[String]): Unit ={
    case class Student(var roll_no: Int, var Name: String, var marks: Int){
      println(roll_no)
      println(Name)
      println(marks)
    }

    var s1 = Student(135, "Mohd Sabir", 79)
    println(s1.marks)
    println(s1.Name)
    println(s1.roll_no)

    case class Cars(var Brand: String , var Model: String, var year: Int=2010){
      println(Brand)
      println(Model)
      println(year)
    }

    var c1 = Cars("Toyota", "XYZ")

    //DEFINING A METHODS

    case class Students(var Name: String, var Roll_No: Int, var Marks: Int){
      //defining the method
      def show() ={
        print(Name)
        print(Roll_No)
        print(Marks)
      }

    }

    var s2 = Students("Mohd Sabir", 135, 80)
    s2.show()


    //Comparison

    case class StudentDetails(var roll_no: Int, var name: String, var marks: Int){

      def >(student: StudentDetails) : Boolean = {
        return marks > student.marks;
      }
    }

    var std1 = StudentDetails(135, "Sabir", 90)
    var std2 = StudentDetails(121, "Girjesh",95)

    // This '>' is a function
    std1.>(std2)  //false
  }
}