package tests.logic_layer.creature

import game.NormalSnake
import game.logic_layer.intelligence.Intelligence
import game.logic_layer.creature.snake.Snake
import game.logic_layer.takeable.food.NormalFood
import game.logic_layer.unit.Position
import org.junit.Test
import org.junit.Assert.assertEquals


/**
 * Created by Seven on 28.06.2016.
 */
class SnakeTest private constructor() {

    /**
     * A list of all snakes possible to create. This
     */
    val snakes = listOf(
            NormalSnake(Positions.ZERO, Intelligences.ZERO)
    )

    val foods = listOf(
            NormalFood()
    )

    /**
     * Tests whether the given snakes grow by the intended amount
     * after eating some normal food.
     */
    @Test
    fun eat() {
        assertEquals(snake.eat(NormalFood()), snake.INITIAL_LENGTH + NormalFood.)
        assertEquals(5, 4)

        snakes.forEach {
            snake ->
            foods.forEach {
                food ->
                assertEquals("Wrong length for snake: " +
                        "${snake.javaClass.simpleName} after eating " +
                        "${food.javaClass.simpleName}. Previous length: ${} - " +
                        "Food growth: ${food.GROWTH}",
                        

            }

        }
    }

    /*-----------------------------------------------------
    private helper
    -----------------------------------------------------*/

}