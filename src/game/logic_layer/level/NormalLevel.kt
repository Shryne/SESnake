package game.logic_layer.level

import game.NormalSnake
import game.logic_layer.intelligence.Intelligence
import game.logic_layer.takeable.food.NormalFood
import game.logic_layer.unit.Position
import game.logic_layer.map.EmptyMap

class NormalLevel(playerIntelligence: Intelligence) : Level {
    private val map = EmptyMap(
            listOf(
                    NormalSnake(Position(0, 0), playerIntelligence)
            ),
            listOf(
                    NormalFood(Position(0, 0))
            )
    )


    override fun sequence() {
        throw UnsupportedOperationException()
    }
}