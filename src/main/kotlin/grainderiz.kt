import java.math.BigInteger

var grzRizCompteur : BigInteger = BigInteger.ZERO
var grzRizTotal : BigInteger = BigInteger.ZERO
fun main() {
    for(i in 1..64){
                        // 2^(i-1)
        grzRizCompteur = BigInteger("2").pow(i-1)
        grzRizTotal = grzRizTotal.add( grzRizCompteur)
        println("Pour la case $i nous avons $grzRizCompteur")
    }
    println("En totalité il y a $grzRizTotal")
}