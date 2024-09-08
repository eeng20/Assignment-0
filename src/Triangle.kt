import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    override var a = 0.0
    override var b = 0.0
    override var c = 0.0

    override fun setDimensions(_a: Double, _b: Double, _c: Double) {
        a = _a;
        b = _b;
        c = _c;

    }

    override fun getArea(): Double {
        var area = 0.0
        var perimeter = a+b+c
        perimeter /= 2
        area = sqrt((perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)))
        return area
    }
}