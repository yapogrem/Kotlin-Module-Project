import java.util.*

class ArchiveSelection {
    fun archiveSelection(archiveList: MutableList<Archive>) {
        println("Введите имя Вашего архива?")
        val inputName = Scanner(System.`in`).nextLine()
        val optionalArchive = archiveList.stream().filter { x -> x.archiveName == inputName }.findFirst()
        if (optionalArchive.isPresent) {
            val archive = optionalArchive.get()
            NoteSelection().noteMenu(archive)
        } else {
            println("Архива с таким именем не существует")
            ArchiveMenu().showStartMenu(archiveList)
        }
    }
}

