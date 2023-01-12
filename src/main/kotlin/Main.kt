fun main(){
    val amount = 250000
    val percent = 0.0075
    val fee = if (amount*percent>35) amount*0.0075 else 35
    println("$fee")
}