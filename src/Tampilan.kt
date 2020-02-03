class Tampilan {
    fun menu() {
        var line = "=========================="
        var judul = "GAME SUIT TERMINAL VERSION"
        println("$line\n$judul\n$line")
    }

    fun inputPlayer(player: Int): String {
        print("1. Masukkan pemain $player: ")
        val playerInput: String = readLine().toString()
        return playerInput
    }

    fun hasil(inputPlayer1: String, inputPlayer2: String): String {
        var hasil = ""

        print("\nHasil:\n")
        if ((inputPlayer1 == "batu" && inputPlayer2 == "gunting") || (inputPlayer1 == "gunting" && inputPlayer2 == "kertas") || (inputPlayer1 == "kertas" && inputPlayer2 == "batu")) {
            hasil = "Pemain 1 MENANG!"
        } else if (inputPlayer1 == inputPlayer2) {
            hasil = "DRAW!"
        } else {
            hasil = "Pemain 2 MENANG!"
        }

        return hasil
    }
}