abstract class Shape (_name : String) : Dimensionable {
    var name = _name
    open var height = 0.0
    open var length = 0.0
    open var radius = 0.0f
    open var a = 0.0
    open var b = 0.0
    open var c = 0.0
    open var side = 0.0

    override fun printDimensions() {
        println("Height: $height")
        println("Length: $length")
        println("Radius: $radius")
        println("a: $a")
        println("b: $b")
        println("c: $c")

    }


    open fun setDimensions(_a: Double, _b: Double, _c: Double) {
        a = _a;
        b = _b;
        c = _c;
    }

    open fun setDimensions(_radius: Float) {
        radius = _radius
    }

    open fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }
    open fun setDimensions(_side: Double) {
        side = _side
    }

    open fun getArea(): Double {
        return 0.0
    }
}