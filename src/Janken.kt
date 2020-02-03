class Janken(val player1: String, val player2: String) {

    fun hasil(): String {
        val hasil: String

        print("\nHasil:\n")
        if ((player1 == "batu" && player2 == "gunting") || (player1 == "gunting" && player2 == "kertas") || (player1 == "kertas" && player2 == "batu")) {
            hasil = "Pemain 1 MENANG!"
        } else if (player1 == player2) {
            hasil = "DRAW!"
        } else {
            hasil = "Pemain 2 MENANG!"
        }

        return hasil
    }
}