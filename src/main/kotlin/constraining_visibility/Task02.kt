package constraining_visibility

/*
    Continue developing the Robot class from the exercises in the previous atoms.
    Use private on all the properties and crossBoundary(), and verify that you can't
    access the private members outside of the class.
 */


class Robot1(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {
    fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }

    fun right(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun down(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun up(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
    val robot = Robot1(10, 1, 1)
    // robot.x
    // Should be "can't access x" error:
//  println(robot.x)
}