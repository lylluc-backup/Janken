class Player (val id: Int) {
    lateinit var inputPlayer: String
    val inputArray = arrayOf("gunting","batu","kertas")
        
    fun setInputPlayer() {
        var isValid = false
        while(!isValid) {
            print("Masukkan pemain $id: ")
            inputPlayer = readLine().toString().toLowerCase()
            if (inputArray.indexOf(inputPlayer) != -1) isValid = true
            if (!isValid) println("Hanya boleh memilih gunting, batu, atau kertas.")
        }
    }

    fun randomInputPlayer(){
        var index:Int = (Math.random()*inputArray.size).toInt()
        inputPlayer = inputArray[index]
    }
}