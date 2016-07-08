
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by avlad92 on 7/8/16.
 */
public class SameWidthLinearLayout extends LinearLayout {

    public SameWidthLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        if(this.getOrientation() == LinearLayout.VERTICAL) {
            setChildsWidth(w);
        }
    }

    private void setChildsWidth(int width){
        int count = this.getChildCount();
        while(count != 0){
            count = count - 1;
            this.getChildAt(count).setMinimumWidth(width);
        }
    }
}
