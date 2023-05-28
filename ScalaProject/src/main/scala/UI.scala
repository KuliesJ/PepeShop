package userInterface

class UI {
  var loop: Boolean = true
  def MainMenu = {
    println(
      "----------------------------\n" +
      "| 1.- Test User class\n" +
      "| 2.- Add tests\n" +
        "3.- Close" +
      "Choose option: "
    )
    var UserInput = scala.io.StdIn.readLine().toInt
    if (UserInput == 3){
      loop = false
    }

  }


}
