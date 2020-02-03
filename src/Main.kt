class Main {
    companion object {
        val tampilan = Tampilan()

        @JvmStatic
        fun main(args: Array<String>) {
            tampilan.menu()
            val player1 = tampilan.inputPlayer(1)
            val player2 = tampilan.inputPlayer(2)
            val janken = Janken(player1, player2)
            print(janken.hasil())
        }
    }
}