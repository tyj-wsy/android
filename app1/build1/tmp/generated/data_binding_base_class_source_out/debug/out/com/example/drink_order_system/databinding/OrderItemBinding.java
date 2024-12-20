// Generated by view binder compiler. Do not edit!
package com.example.drink_order_system.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.drink_order_system.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final TextView textViewCost;

  @NonNull
  public final TextView textViewNumber;

  @NonNull
  public final TextView textViewTakeAway;

  @NonNull
  public final TextView textViewTime;

  private OrderItemBinding(@NonNull LinearLayout rootView, @NonNull View divider,
      @NonNull TextView textViewCost, @NonNull TextView textViewNumber,
      @NonNull TextView textViewTakeAway, @NonNull TextView textViewTime) {
    this.rootView = rootView;
    this.divider = divider;
    this.textViewCost = textViewCost;
    this.textViewNumber = textViewNumber;
    this.textViewTakeAway = textViewTakeAway;
    this.textViewTime = textViewTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.order_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.textView_cost;
      TextView textViewCost = ViewBindings.findChildViewById(rootView, id);
      if (textViewCost == null) {
        break missingId;
      }

      id = R.id.textView_number;
      TextView textViewNumber = ViewBindings.findChildViewById(rootView, id);
      if (textViewNumber == null) {
        break missingId;
      }

      id = R.id.textView_takeAway;
      TextView textViewTakeAway = ViewBindings.findChildViewById(rootView, id);
      if (textViewTakeAway == null) {
        break missingId;
      }

      id = R.id.textView_time;
      TextView textViewTime = ViewBindings.findChildViewById(rootView, id);
      if (textViewTime == null) {
        break missingId;
      }

      return new OrderItemBinding((LinearLayout) rootView, divider, textViewCost, textViewNumber,
          textViewTakeAway, textViewTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
