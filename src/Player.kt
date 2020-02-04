class Player (val id: Int) {
    lateinit var inputPlayer: String

    fun setInputPlayer() {
        print("1. Masukkan pemain $id: ")
        inputPlayer = readLine().toString()
    }
}