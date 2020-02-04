class Main {
    companion object {
        val tampilan = Tampilan()

        @JvmStatic
        fun main(args: Array<String>) {
            tampilan.menu()
            val player1 = Player(1)
            player1.setInputPlayer()
            val player2 = Player(2)
            player2.setInputPlayer()
            val janken = Janken(player1.inputPlayer, player2.inputPlayer)
            print(janken.hasil())
        }
    }
}