package game.logic_layer.level

import game.NormalSnake
import game.logic_layer.creature.Creature
import game.logic_layer.intelligence.Intelligence
import game.logic_layer.takeable.food.NormalFood
import game.logic_layer.unit.Position
import game.logic_layer.map.EmptyMap
import game.logic_layer.unit.Nat
import java.time.Clock

class NormalLevel(playerIntelligence: (creature: Creature, clock: Clock) -> Creature) : Level {
    private val map = EmptyMap(
            listOf(
                    NormalSnake(Position(Nat(0), Nat(0)), playerIntelligence)
            ),
            listOf(
                    NormalFood(Position(Nat(0), Nat(0)))
            )
    )


    override fun sequence() {
        throw UnsupportedOperationException()
    }
}