package runtime

// import
import user.User
import userInterface.UI

object main extends App{
  val Menu = new UI()
  while (Menu.loop){
    Menu.MainMenu

  }
  /*println(
    "----------------------------\n" +
    "| 1.- Test User class\n" +
    "| 2.- Add tests\n" +
      "Choose option: ")
  var UserInput = scala.io.StdIn.readLine()

  val testUser = new User("Carlitos")
  testUser.hello()*/
}