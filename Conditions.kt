fun main(){
  // boolean values
  // only true or false (1 or 0 in memory)

  //test conditions
  // only print if the test is true (or false)
  // if(condition)
  if(true){
    println("This code will always run")
  }

  if(false){
    println("This code will never run")
  }

  var myBool = true

  if(myBool){
    println("This is again always going to print")
  }


  /*
      > Greater than
      < Less than
      >= Greater or equal to
      <= less or equal to
      != not equal
      ! not
      == comares if two things are equal
      === the two things have the same memory address
      () we can state the order that comparisons happen
      && and
      || or
  */

  // print("Enter your whole number numeric grade: ")
  // var grade = readln().toInt()

  // if(grade >= 50 && grade < 60){
  //   println("You passed with D!")
  // }
  // else if(grade >= 60){
  //   println("You passed with C!")
  // }
  // else if(grade >= 70){
  //   println("You passed with B!")
  // }
  // else if(grade >= 80){
  //   println("You passed with A!")
  // }
  // //else if(grade < 50){
  // else{
  //   println("You did not pass")
  // }

  // var count = 0
  // while(count <= 10){
  //   println("This code will continue to print")
  //   ++count
  // }

  //for(index in 0..10 step 1)
  for(index in 10 downTo 1){
    println(index)
  }

  repeat(10){
    println("This will repeat 10 times")
  }

  // while(grade > 100 || grade < 0){
  //   println("Enter a *valid* grade: ")
  //   grade = readln().toInt()
  // }
  var grade: Int
  do{
    print("Enter your whole number numeric grade: ")
    try{
      grade = readln().toInt()
    }
    catch(e: NumberFormatException){
      println("That isn't a valid number")
      grade = -1
    }
  }
  while(grade > 100 || grade < 0)

  // if(grade <= 100 && grade >= 0){
    if(grade >= 80){
       println("You passed with A!")
     }
     else if(grade >= 70){
       println("You passed with B!")
     }
     else if(grade >= 60){
       println("You passed with C!")
     }
     else if(grade >= 50){
       println("You passed with D!")
     }
     //else if(grade < 50){
     else{
       println("You did not pass")
     }
   // }
   // else{
   //   println("That is not a valid grade")
   // }

  // switch(viewIDs){
  //   case a:
  //     code
  //     code
  //     break;
  //
  //   case b:
  //   case c:
  //     code
  //     break:
  //
  //   default:
  //     break;
  // }

  // when(grade){
  //   in 50..59 -> {
  //     println("You passed with D!")
  //   }
  //   in 60..69 -> {
  //     println("You passed with C!")
  //   }
  //   in 70..79 -> {
  //     println("You passed with B!")
  //   }
  //   in 80..100 -> {
  //     println("You passed with A!")
  //   }
  //   else -> println("You did not pass")
  // }

}
