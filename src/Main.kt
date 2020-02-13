class Main {
    companion object {
        private val tampilan = Tampilan()

        @JvmStatic
        fun main(args: Array<String>) {
            val hitungHasil = object : Callback{
                override fun cetakHasil(hasil: String) {
                    println(hasil)
                }
            }

            var pilihan = 0
            while(pilihan != 3) {
                tampilan.menu()
                print("Silahkan pilih menu: ")
                pilihan = readLine()!!.toInt()
                when (pilihan) {
                    1 -> {
                        tampilan.vsCom()
                        val player1 = Player(1)
                        player1.setInputPlayer()
                        val player2 = Player(2)
                        player2.randomInputPlayer()
                        val janken = Janken(player1.inputPlayer, player2.inputPlayer)
                        janken.hasil("CPU", hitungHasil)
                    }

                    2 -> {
                        tampilan.vsPlayer()
                        val player1 = Player(1)
                        player1.setInputPlayer()
                        val player2 = Player(2)
                        player2.setInputPlayer()
                        val janken = Janken(player1.inputPlayer, player2.inputPlayer)
                        janken.hasil("Player", hitungHasil)
                    }

                    3 -> print("BYE")

                    else -> {
                        print("Pilihan yang anda masukkan tidak sesuai.\n\n ")
                    }
                }
            }

        }

    }
}