import java.util.*

class CheckInputNote {
    private var inputText = ""
    fun checkInputNote(): String {
        while (inputText == "") {
            inputText = Scanner(System.`in`).nextLine()
            if (inputText == "") {
                println("Ввод не может быть пустым, повторите ввод:")

            }
        }
        return inputText
    }
}