import java.util.Scanner

class CreateArchive() {
    fun createArchive(archiveList: MutableList<Archive>) {
        println("Введите имя архива:")

        val inputName = Scanner(System.`in`).nextLine()

        if(inputName in archiveList.stream().map { x -> x.archiveName}.toList()){
            println("Архив с таким именем уже существует")
            ArchiveMenu().showStartMenu(archiveList)
        }else{
            val notes:MutableList<Note> = ArrayList()
            val archive = Archive(inputName, notes)
            archiveList.add(archive)
            println("Создан архив $inputName")
            ArchiveMenu().showStartMenu(archiveList)
        }
    }
}