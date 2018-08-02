data class MarsRover(var coordinates: Coordinates, var direction: CardinalDirection) {
    fun move(route: String) {
        var commands = route
        while (commands.isNotEmpty()) {
            when (commands[0]) {
                'r' -> turnRightFrom(direction)
                'l' -> turnRightFrom(oppositeOf(direction))
                'f' -> moveTowards(direction)
                'b' -> moveTowards(oppositeOf(direction))
            }

            commands = commands.substring(1)
        }
    }

    private fun turnRightFrom(direction: CardinalDirection) {
        this.direction = when (direction) {
            CardinalDirection.NORTH -> CardinalDirection.EAST
            CardinalDirection.EAST -> CardinalDirection.SOUTH
            CardinalDirection.SOUTH -> CardinalDirection.WEST
            CardinalDirection.WEST -> CardinalDirection.NORTH
        }
    }

    private fun moveTowards(direction: CardinalDirection) {
        when (direction) {
            CardinalDirection.NORTH ->coordinates.y++
            CardinalDirection.EAST -> coordinates.x++
            CardinalDirection.SOUTH -> coordinates.y--
            CardinalDirection.WEST -> coordinates.x--
        }
    }

    private fun oppositeOf(direction: CardinalDirection): CardinalDirection {
        return when (direction) {
            CardinalDirection.NORTH -> CardinalDirection.SOUTH
            CardinalDirection.EAST -> CardinalDirection.WEST
            CardinalDirection.SOUTH -> CardinalDirection.NORTH
            CardinalDirection.WEST -> CardinalDirection.EAST
        }
    }
}
