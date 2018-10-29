package engageft.theming

import android.content.Context
import android.databinding.BindingAdapter
import android.support.v4.content.ContextCompat
import android.widget.Button
import com.airbnb.paris.Paris
import com.airbnb.paris.extensions.style
import com.airbnb.paris.styles.Style

/*
 * Created by Travis on 10/25/2018.
 */
class StyleManager(val context: Context){
    //provides a default style that can be updated when requirements are received
    var myStyle: Style = Paris.styleBuilder(Button(context))
            .backgroundTint(ContextCompat.getColor(context,R.color.colorPrimary))
            .textColor(ContextCompat.getColor(context,android.R.color.white))
            .build()
}

@BindingAdapter("setButtonStyle")
fun Button.setButtonStyle(style : Style){
    this.style(style)
}