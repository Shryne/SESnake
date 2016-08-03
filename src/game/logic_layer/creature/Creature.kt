package game.logic_layer.creature

import game.logic_layer.intelligence.Intelligence
import game.logic_layer.map.Appereance
import game.logic_layer.unit.Bounds
import game.logic_layer.unit.Direction
import game.logic_layer.unit.Speed

interface Creature {
    val bounds: Bounds
    val speed: Speed
    val intelligence: Intelligence
    val direction: Direction
    val appereance: Appereance

    fun step()
}