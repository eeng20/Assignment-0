import kotlin.math.PI
import kotlin.math.pow

class Square(_name: String) : Shape(_name) {
    override var length = 0.0
    override var height = 0.0

    override fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }

    override fun getArea(): Double {
        var area = 0.0
        area = length*height
        return area
    }
}