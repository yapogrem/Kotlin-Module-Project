class ArchiveMenu {
    fun showStartMenu(archiveList: MutableList<Archive>) {
        println("Список архивов:")
        for (archiveName in archiveList.stream().map { x -> x.archiveName }.toList()) {
            println(archiveName)
        }
        println("0. Создать архив")
        println("1. Это мой уже созданный архив")
        println("2. Выход ")

        val input = InputMenu().choice_Menu()
        when (input) {
            0 ->
                CreateArchive().createArchive(archiveList)

            1 -> ArchiveSelection().archiveSelection(archiveList)
            2 -> println("Всего доброго")
        }
    }
}