import java.util.*

class NoteSelection {
    fun noteMenu(archive: Archive) {
    for ((index, note) in archive.notes.withIndex()) {
        println(note.noteName)
    }
        println("Для продолжения работы выберите пункт меню от 0 до 2")
        println("0. Создать заметку")
        println("1. Показать заметку. Введите название заметки:")
        println("2. Назад ")

        val input = InputMenu().choice_Menu()
        when (input) {
            0 ->{
                val newNote = CreateNote().createNotes()
                archive.notes.add(newNote)
                NoteSelection().noteMenu(archive)
            }
            1 -> {
                println("Введите название заметки")
                val inputName = Scanner(System.`in`).nextLine()
//                for((noteName, noteText) in archive.notes){
//                    if(noteName == inputName){
//                        println("Заметка $noteName")
//                        println(noteText)
//                for ((index, note) in archive.notes.withIndex()) {
//                    if (note.noteName == inputName){
//                        println(note.noteText)}else{
//                            println("Заметки с таким именем нет")
//                        }
//                }

                NoteSelection().noteMenu(archive)

                    }
            2 -> ArchiveSelection().showstartMenu()
            else -> println("x!=2")
        }
    }
}