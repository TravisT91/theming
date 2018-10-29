package engageft.theming

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.airbnb.paris.Paris
import engageft.theming.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val shouldShowAsRed: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.styleManager = StyleManager(this).apply {
            //here we can update the style based on what is received from the back end
            val styleBuilder = Paris.styleBuilder(Button(this@MainActivity))
                    .textColor(ContextCompat.getColor(this@MainActivity,android.R.color.white))
                    .text("styled at runtime")
            if (shouldShowAsRed) {
                styleBuilder.backgroundTint(ContextCompat.getColor(this@MainActivity,android.R.color.holo_red_dark))
            }
            myStyle = styleBuilder.build()
        }
    }
}
