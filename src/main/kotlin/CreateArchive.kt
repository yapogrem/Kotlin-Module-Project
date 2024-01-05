import java.util.Scanner

class CreateArchive() {
    fun createArchive(archiveList: MutableList<String>) {
        println("Введите имя архива:")

        val inputName = Scanner(System.`in`).nextLine()

        if(inputName in archiveList){
            println("Архив с таким именем уже существует")
            ArchiveSelection().showstartMenu(archiveList)
        }else{
            archiveList.add(inputName)
            val note = Note("Список заметок:", "Текст Заметки")
            val notes = mutableListOf(note)
            var archive = Archive(inputName, notes)
            println("Создан архив $inputName")
            NoteSelection().noteMenu(archive)
        }
    }
}