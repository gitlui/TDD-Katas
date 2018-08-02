import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class MarsRoverTest {
    private lateinit var rover: MarsRover
    private val defaultCoordinates = Coordinates(1, 1)

    @Before
    fun setUp() {
        rover = MarsRover(defaultCoordinates, CardinalDirection.NORTH)
    }

    private fun assertDirectionAfterOnlyTurnCommands(command: String, expectedDirection: CardinalDirection){
        rover.move(command)
        assertThat(rover.direction).isEqualTo(expectedDirection)
        assertThat(rover.coordinates).isEqualTo(defaultCoordinates)
    }

    @Test
    fun itStartsAtCoordinatesOneOneFacingNorth() {
        assertThat(rover.coordinates).isEqualTo(defaultCoordinates)
        assertThat(rover.direction).isEqualTo(CardinalDirection.NORTH)
    }

    @Test
    fun itCanTurnLeftAndFaceWest() {
        assertDirectionAfterOnlyTurnCommands("l", CardinalDirection.WEST)
    }

    @Test
    fun itCanTurnLeftTwiceAndFaceSouth() {
        assertDirectionAfterOnlyTurnCommands("ll", CardinalDirection.SOUTH)
    }

    @Test
    fun itCanTurnLeftTriceAndFaceEast() {
        assertDirectionAfterOnlyTurnCommands("lll", CardinalDirection.EAST)
    }

    @Test
    fun itCanTurnLeftOneCompleteRound() {
        assertDirectionAfterOnlyTurnCommands("llll", CardinalDirection.NORTH)
    }

    @Test
    fun itCanTurnRightAndFaceEast() {
        assertDirectionAfterOnlyTurnCommands("r", CardinalDirection.EAST)
    }
    @Test
    fun itCanTurnRightTwiceAndFaceSouth() {
        assertDirectionAfterOnlyTurnCommands("rr", CardinalDirection.SOUTH)
    }

    @Test
    fun itCanTurnRightTriceAndFaceWest() {
        assertDirectionAfterOnlyTurnCommands("rrr", CardinalDirection.WEST)
    }

    @Test
    fun itCanTurnRightOneCompleteRound() {
        assertDirectionAfterOnlyTurnCommands("rrrr", CardinalDirection.NORTH)
    }

    @Test
    fun itCanTurnRightLeftRightAndFaceEast() {
        assertDirectionAfterOnlyTurnCommands("rlr", CardinalDirection.EAST)
    }

    @Test
    fun itCanMoveForward() {
        rover.move("f")
        assertThat(rover.coordinates).isEqualTo(Coordinates(1, 2))
        assertThat(rover.direction).isEqualTo(CardinalDirection.NORTH)
    }

    @Test
    fun itCanMoveForwardTwice() {
        rover.move("ff")
        assertThat(rover.coordinates).isEqualTo(Coordinates(1, 3))
        assertThat(rover.direction).isEqualTo(CardinalDirection.NORTH)
    }

    @Test
    fun itCanMoveForwardFacingEast() {
        rover.move("rf")
        assertThat(rover.coordinates).isEqualTo(Coordinates(2, 1))
    }

    @Test
    fun itCanMoveBackwards() {
        rover.move("b")
        assertThat(rover.coordinates).isEqualTo(Coordinates(1, 0))
    }

    @Test
    fun itCanMoveCompletely() {
        rover.move("ffrffblfflfflb")
        assertThat(rover.coordinates).isEqualTo(Coordinates(0, 6))
    }
}
