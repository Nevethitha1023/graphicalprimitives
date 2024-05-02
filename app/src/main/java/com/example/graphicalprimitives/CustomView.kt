import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw a circle
        paint.color = Color.BLUE
        canvas.drawCircle(200f, 200f, 100f, paint)

        // Draw an ellipse
        paint.color = Color.RED
        val rectF = RectF(350f, 100f, 550f, 300f)
        canvas.drawOval(rectF, paint)

        // Draw a rectangle
        paint.color = Color.GREEN
        canvas.drawRect(100f, 400f, 400f, 600f, paint)

        // Draw text
        paint.color = Color.BLACK
        paint.textSize = 40f
        canvas.drawText("Hello, World!", 100f, 800f, paint)
    }
}
