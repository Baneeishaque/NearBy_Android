package nears.ashik.ndk;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Numbered_Button_Adapter extends RecyclerView.Adapter<Button_with_Label_Holder> {
    private List<String> labels;

    public Numbered_Button_Adapter(int count) {
        labels = new ArrayList<String>(count);
        for (int i = 0; i < count; ++i) {
            labels.add(String.valueOf(i));
        }
    }

    @Override
    public Button_with_Label_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_button_with_label, parent, false);
        return new Button_with_Label_Holder(view);
    }

    @Override
    public void onBindViewHolder(final Button_with_Label_Holder holder, final int position) {
        final String label = labels.get(position);
        switch (position) {
            case 0:
                holder.button.setText("Auto");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.car, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();

                    }
                });
                break;

            case 1:
                holder.button.setText("Bike");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.motorcycle, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 2:
                holder.button.setText("Truck");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.truck, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 3:
                holder.button.setText("Food");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.food, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 4:
                holder.button.setText("Grocery");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.grocery, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 5:
                holder.button.setText("Parcel");
                holder.button.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.parcel, 0, 0);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), holder.button.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
                holder.button.setText(label);
                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                holder.button.getContext(), label, Toast.LENGTH_SHORT).show();
                    }
                });
        }

    }

    @Override
    public int getItemCount() {
        return labels.size();
    }
}