import com.faangx.ktp.basics.SimpleInterestCalculatorMiniAppV1

fun getInterest(p: Float, r: Float, t: Float): Float {
    return (p * t * r) / 100
}

fun main() {
    SimpleInterestCalculatorMiniAppV1(::getInterest)
}