import java.awt.Color
import java.awt.image.BufferedImage

const val N = 200
const val MSG = "Hello, images!"

fun drawStrings(): BufferedImage {
    val image = BufferedImage(N, N, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    val map = mapOf<Color, Pair<Int, Int>>(
        Color.RED to Pair(50, 50),
        Color.GREEN to Pair(51, 51),
        Color.BLUE to Pair(52, 52)
    )

    for (color in map.keys) {
        graphics.color = color
        graphics.drawString(MSG, map[color]!!.first, map[color]!!.second)
    }

    return image
}

// Uncomment the following code to save the image to a file, when debugging
//fun main() {
//    val imageFile = File("drawStrings.png")
//    val image = drawStrings()
//    ImageIO.write(image, "png", imageFile)
//}