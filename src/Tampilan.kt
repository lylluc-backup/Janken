class Tampilan {
    fun menu() {
        val line = "=========================="
        val judul = "GAME SUIT TERMINAL VERSION"
        println("$line\n$judul\n$line")
    }

    fun inputPlayer(player: Int): String {
        print("1. Masukkan pemain $player: ")
        return readLine().toString()
    }
}