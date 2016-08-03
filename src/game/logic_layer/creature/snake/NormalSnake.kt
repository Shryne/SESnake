package game

import game.logic_layer.intelligence.Intelligence
import game.logic_layer.creature.snake.Snake
import game.logic_layer.map.Appereance
import game.logic_layer.map.Fillment
import game.logic_layer.unit.Bounds
import game.logic_layer.unit.Position
import game.logic_layer.unit.Speed
import java.util.*


class NormalSnake(position: Position, override val intelligence: Intelligence) : Snake(position, 3) {
    override val appereance = Appereance(listOf(Fillment.EMPTY))

    override fun step() {
        throw UnsupportedOperationException()
    }
}