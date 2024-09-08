import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Circle (_name: String) : Shape(_name) {
    override var radius = 0.0f

    override fun setDimensions(_radius: Float) {
        radius = _radius

    }

    override fun getArea(): Double {
        var area = 0.0
        area = PI*(radius.pow(2));
        return area
    }
}