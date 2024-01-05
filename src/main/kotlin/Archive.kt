class Archive(val name: String) {
    private val notes = mutableListOf<Note>()

    fun addNote(note: Note) {
        notes.add(note)
    }

    fun removeNoteById(id: Int) {
        val noteToRemove = notes.find { it.id == id }
        notes.remove(noteToRemove)
    }

    fun getNotes(): List<Note> {
        return notes.toList()
    }
}