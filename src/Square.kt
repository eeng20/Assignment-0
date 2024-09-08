import kotlin.math.PI
import kotlin.math.pow

class Square(_name: String) : Shape(_name) {

    override fun getArea(): Double {
        var area = 0.0
        area = length*height
        return area
    }

    override fun printDimensions() {
        println("Square's dimensions:\nlength: $length\nheight: $height")
    }

}