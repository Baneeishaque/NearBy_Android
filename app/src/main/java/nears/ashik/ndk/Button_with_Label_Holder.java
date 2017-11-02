package nears.ashik.ndk;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class Button_with_Label_Holder extends RecyclerView.ViewHolder {
    public Button button;

    public Button_with_Label_Holder(View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.button_with_label);
    }
}