fun main() {
    println("Mode 1 - Choisir a l'avance votre nb de notes")
    println("Mode 2 - Rentrer vos notes jusqu'a -1")
    print("choisissez votre mode :")
    when(readln().toIntOrNull()){
        null -> main()
        1 -> moyenneAvecNbValeurs()
        2 -> moyenneJusquaMoinsUn()
        else -> main()
    }
}

fun moyenneAvecNbValeurs(){
    print("Entrez le nombre de valeurs :")
    val nbValeur = readln().toIntOrNull()
    val listeNote = arrayListOf<Float>()
    if(nbValeur == null || nbValeur in Int.MIN_VALUE .. 0)
        moyenneAvecNbValeurs()
    for(i in 1..nbValeur!!){
        val note  = readln().toFloatOrNull()
        if (note != null) {
            listeNote.add(note)
        }
    }
    println("La moyenne est ${listeNote.sum()/listeNote.size}")
}

val listNotes = mutableListOf<Float>()

fun moyenneJusquaMoinsUn(){
    var canAdd = true
    while(canAdd){
        println("Note (-1 pour terminer) ?")
        canAdd = addNoteToList(readln().toFloatOrNull() ?: -1f)
    }
    println("La moyenne est ${listNotes.sum()/listNotes.size}")
}

/**
 * Return false if function couldn't add note
 * true otherwise
 */
fun addNoteToList(note:Float) :Boolean{
    if(note == -1f)
        return false;
    return listNotes.add(note)
}