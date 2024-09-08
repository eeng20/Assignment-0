import kotlin.math.pow
import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    override fun getArea(): Double {
        var area = 0.0
        area = (sqrt(3.0)/4.0)*(side.pow(2))
        return area
    }

    override fun printDimensions() {
        println("Equilateral Triangle's dimensions: $side")
    }
}