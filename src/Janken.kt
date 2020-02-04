class Janken(val inputPlayer1: String, val inputPlayer2: String) {

    fun hasil(): String {
        val hasil: String

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