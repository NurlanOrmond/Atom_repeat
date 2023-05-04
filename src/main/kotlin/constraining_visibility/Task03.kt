package constraining_visibility
/*
A Robot can only move forward. Check that the steps argument is a positive number.
For right(), left(), down() and up(), a negative or zero steps argument should not update the
location. Instead it should produce console output using this String:
"steps argument must be positive, is $steps"
In main(), test your code using positive, negative and zero values of steps.
 */
class Robot(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {
    private fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }



    fun right(steps: Int) {
        if (steps > 0) {
            x += steps
            x = crossBoundary(x)
        } else {
            println("steps argument must be positive, is $steps")
        }

    }

    fun left(steps: Int) {
        if (steps > 0) {
            x -= steps
            x = crossBoundary(x)
        } else {
            println("steps argument must be positive, is $steps")
        }

    }

    fun down(steps: Int) {
        if (steps > 0) {
            y += steps
            y = crossBoundary(y)
        } else {
            println("steps argument must be positive, is $steps")
        }

    }

    fun up(steps: Int) {
        if (steps > 0) {
            y -= steps
            y = crossBoundary(y)
        } else {
            println("steps argument must be positive, is $steps")
        }

    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
    val robot = Robot(10, 1, 1)
    robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/