package game

import game.logic_layer.creature.Creature
import game.logic_layer.intelligence.Intelligence
import game.logic_layer.creature.snake.Snake
import game.logic_layer.map.Appearance
import game.logic_layer.map.Filling
import game.logic_layer.map.Line
import game.logic_layer.unit.Position
import java.time.Clock


class NormalSnake(position: Position, override val intelligence:
(creature: Creature, clock: Clock) -> Creature) : Snake(position, 3) {

    override val appearance = Appearance(
            Line(Filling.EMPTY)
    )

    override fun step() {
        throw UnsupportedOperationException()
    }
}