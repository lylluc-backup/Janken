//import.java.util.*

class Main {
    companion object {
        val tampilan = Tampilan()

        @JvmStatic
        fun main(args: Array<String>) {
            tampilan.menu()
            var player1 = tampilan.inputPlayer(1)
            val player2 = tampilan.inputPlayer(2)

            print(tampilan.hasil(player1, player2))
        }
    }
}