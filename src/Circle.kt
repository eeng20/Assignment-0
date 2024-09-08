import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Circle (_name: String) : Shape(_name) {
    fun setDimensions(_radius: Double) {
        var radius = _radius

    }

    override fun getArea(): Double {
        var area = 0.0
        area = PI*radius.pow(2);
        return area
    }
}