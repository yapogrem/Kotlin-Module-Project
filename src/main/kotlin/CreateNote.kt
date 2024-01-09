import java.util.Scanner

class CreateNote() {
    fun createNotes(inputName: String): Note {
            println("Введите текст заметки:")
            val inputText = Scanner(System.`in`).nextLine()
            val note = Note(inputName, inputText)
            println("Создана заметка $inputName")
            return note
        }
    }

