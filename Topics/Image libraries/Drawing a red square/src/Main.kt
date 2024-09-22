import java.awt.Color
import java.awt.image.BufferedImage  

const val L = 500

fun drawSquare(): BufferedImage {
    val image = BufferedImage(L, L, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    val xs = intArrayOf(100, 400, 400, 100, 100)
    val ys = intArrayOf(100, 100, 400, 400, 100)
    graphics.color = Color.RED
    graphics.fillPolygon(xs, ys, 4)
    graphics.dispose()
    return image
}