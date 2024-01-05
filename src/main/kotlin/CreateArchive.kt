import java.util.Scanner

class CreateArchive {
    fun createArchive() {
        println("Введите имя архива:")
        val inputName = Scanner(System.`in`).nextLine()
        val note = Note("Список заметок:", "Текст Заметки")
        val notes = mutableListOf(note)
        var archive = Archive(inputName, notes)
        println("Создан архив $inputName")
        NoteSelection().noteMenu(archive)
    }
}