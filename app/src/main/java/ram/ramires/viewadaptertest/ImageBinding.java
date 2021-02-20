package ram.ramires.viewadaptertest;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class ImageBinding {

    @BindingAdapter({"bind:imageUrl"})
    public static void setImageUrl(ImageView view, String url) {


        int imageResource = view.getContext().getResources().getIdentifier( url,
                "drawable", view.getContext().getOpPackageName());

        Drawable drawable=view.getContext().getResources().getDrawable(imageResource);
        view.setImageDrawable(drawable);

    }
}