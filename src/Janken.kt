class Janken(val inputPlayer1: String, val inputPlayer2: String) {

    fun hasil(versi:String, callback: Callback){
        val hasil: String
        val player2 = if (versi == "CPU") "CPU" else "Player 2"

        println("\nPlayer 1 memilih $inputPlayer1")
        println("$player2 memilih $inputPlayer2")
        print("Hasil:\n")
        hasil = if ((inputPlayer1 == "batu" && inputPlayer2 == "gunting") || (inputPlayer1 == "gunting" && inputPlayer2 == "kertas") || (inputPlayer1 == "kertas" && inputPlayer2 == "batu")) {
            "Player 1 MENANG!\n"
        } else if (inputPlayer1 == inputPlayer2) {
            "DRAW!\n\n"
        } else {
            "$player2 MENANG!\n"
        }

        callback.cetakHasil(hasil)
    }
}