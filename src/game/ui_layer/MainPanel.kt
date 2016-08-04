package game.ui_layer

import game.logic_layer.clock.Clock
import game.logic_layer.creature.Creature
import game.logic_layer.intelligence.Intelligence
import game.logic_layer.level.NormalLevel
import kotlin.concurrent.thread

private const val TITLE = "SeSnake"
private const val RW = 800
private const val RH = 600

fun main(args: Array<String>) {
    LevelPanel(WindowSettings(RW, RH, TITLE), NormalLevel(
            { creature, clock -> creature }
    ))
}

/**
 * The entry point of the game where one can select
 * different top level choices.
 */
class MainPanel() {

}