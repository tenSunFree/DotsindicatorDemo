package com.example.administrator.dotsindicatordemo;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class DotIndicatorPagerAdapter extends PagerAdapter {

    private static final List<Item> names =
            Arrays.asList(new Item("中國北京烤鴨"), new Item("日本壽司"),
                    new Item("西班牙海鮮飯"), new Item("義大利那不勒斯比薩"),
                    new Item("新加坡辣椒蟹"));

    private static final List<Item2> foods =
            Arrays.asList(new Item2(R.drawable.food1), new Item2(R.drawable.food2),
                    new Item2(R.drawable.food3), new Item2(R.drawable.food4),
                    new Item2(R.drawable.food5));

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View item = LayoutInflater.from(container.getContext())
                .inflate(R.layout.material_page, container, false);
        ImageView item_image = item.findViewById(R.id.item_image);
        item_image.setImageResource(foods.get(position).food);
        TextView nameTextView = item.findViewById(R.id.nameTextView);
        nameTextView.setText(names.get(position).name);
        container.addView(item);
        return item;
    }

    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    private static class Item {
        private final String name;
        private Item(String name) {
            this.name = name;
        }
    }

    private static class Item2 {
        private final int food;
        private Item2(int food) {
            this.food = food;
        }
    }
}
