package game.logic_layer.creature.snake

import game.logic_layer.creature.Creature
import game.logic_layer.unit.*

abstract class Snake(position: Position, length: Int) : Creature {
    override val speed = Speed(4.0)
    override val bounds = Bounds(position, Size(length, 1))
    override val direction = Direction.NON
    val growth = Growth(0)
}