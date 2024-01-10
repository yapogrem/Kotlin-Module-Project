class NoteSelection {
    fun noteMenu(archive: Archive) {
        for ((index, note) in archive.notes.withIndex()) {
            println("$index ${note.noteName}")
        }
        println("Для продолжения работы выберите пункт меню от 0 до 2")
        println("0. Создать заметку")
        println("1. Посмотреть текст моей уже созданной заметки")
        println("2. Назад ")
        val input = InputMenu().choice_Menu()
        when (input) {
            0 -> {
                println("Введите имя заметки:")
                val inputName = CheckInputNote().checkInputNote()
                if (archive.notes.stream().filter { x -> x.noteName == inputName }.findFirst().isPresent) {
                    println("Заметка с таким именем уже существует")
                } else {
                    val note = CreateNote().createNotes(inputName)
                    archive.notes.add(note)
                    NoteSelection().noteMenu(archive)
                }
            }

            1 -> {
                println("Введите имя заметки")
                val inputName = CheckInputNote().checkInputNote()
                if (archive.notes.stream().filter { x -> x.noteName == inputName }.findFirst().isEmpty) {
                    println("Заметки с таким именем не существует")
                } else {
                    for (note in archive.notes.stream().filter { x -> x.noteName == inputName }) {
                        println(note.noteText)
                    }
                    NoteSelection().noteMenu(archive)
                }
            }

            2 -> ArchiveMenu().showStartMenu(archiveList)
        }
    }
}