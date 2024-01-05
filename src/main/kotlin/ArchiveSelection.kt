

class ArchiveSelection() {
    fun showStartMenu(archiveList: MutableList<String>) {
        println("Список архивов:")
        for (name in archiveList){
            println(name)
        }
        println("0. Создать архив")
        println("1. Это мой уже созданный архив")
        println("2. Выход ")

        val input = InputMenu().choice_Menu()
        when (input) {
            0 ->
                CreateArchive().createArchive(archiveList)
            1 -> println("x=1")
            2 -> println("x=2")
            else -> println("x!=2")
        }
    }
}