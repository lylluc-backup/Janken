class Tampilan {

    fun vsCom(){
        val line = "=========================="
        val judul = "\t\tVS CPU"
        println("$line\n$judul\n$line")
    }

    fun vsPlayer(){
        val line = "=========================="
        val judul = "\t\tVS Player"
        println("$line\n$judul\n$line")
    }

    fun menu() {
        val line = "=========================="
        val judul = "GAME SUIT TERMINAL VERSION"
        println("$line\n$judul\n$line")
        println("1. VS CPU")
        println("2. VS Player")
        println("3. Keluar")
    }

}