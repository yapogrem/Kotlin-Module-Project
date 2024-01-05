import java.util.Scanner

class CreateNote() {
    fun createNotes(): Note {
        println("Введите имя заметки:")
        val inputName = Scanner(System.`in`).nextLine()
        println("Введите текст заметки:")
        val inputText = Scanner(System.`in`).nextLine()
        val note = Note(inputName, inputText)
        return note
    }
}