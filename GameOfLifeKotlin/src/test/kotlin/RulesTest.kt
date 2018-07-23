import main.kotlin.Judge

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RulesTest {
    private lateinit var judge: Judge

    @Before
    fun setUp() {
        judge = Judge()
    }

    private fun assertAlive(wasAlive: Boolean, countOfNeighbours: Int) =
            assertEquals(true, judge.willBeAlive(wasAlive, countOfNeighbours))

    private fun assertDead(wasAlive: Boolean, countOfNeighbours: Int) =
            assertEquals(false, judge.willBeAlive(wasAlive, countOfNeighbours))

    // revive
    @Test
    fun ifADeadCellHasExactlyThreeNeighboursItBecomesAlive() = assertAlive(false, 3)

    // Ha ha ha ha... staying alive staying alive...
    @Test
    fun ifALivingCellHasExactlyTwoNeighboursItStaysAlive() = assertAlive(true, 2)
    @Test
    fun ifALivingCellHasExactlyThreeNeighboursItStaysAlive() = assertAlive(true, 3)

    // loneliness
    @Test
    fun ifALivingCellHasZeroNeighboursItDies() = assertDead(true, 0)
    @Test
    fun ifALivingCellHasOnlyOneNeighbourItDies() = assertDead(true, 1)

    // to much to handle
    @Test
    fun ifALivingCellHasMoreThanThreeNeighboursItDies() = assertDead(false, 4)
}