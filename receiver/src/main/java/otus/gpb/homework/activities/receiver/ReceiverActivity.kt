package otus.gpb.homework.activities.receiver

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val title= intent.extras?.getString("titleKey")
        findViewById<TextView>(R.id.titleTextView).text=title

        val titleyear= intent.extras?.getString("titleyear")
        findViewById<TextView>(R.id.yearTextView).text=titleyear

        val titledescription= intent.extras?.getString("titledescription")
        findViewById<TextView>(R.id.descriptionTextView).text=titledescription

        findViewById<ImageView>(R.id.posterImageView).setImageDrawable(this.getDrawable (R.drawable.interstellar))
    }
}
