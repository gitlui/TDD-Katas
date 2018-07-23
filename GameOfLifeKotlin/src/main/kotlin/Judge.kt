package main.kotlin

class Judge {
    fun willBeAlive(isAliveInThisGeneration: Boolean, countOfNeighbours: Int): Boolean =
            countOfNeighbours == 3 || (isAliveInThisGeneration && countOfNeighbours == 2)
}