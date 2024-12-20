// Generated by view binder compiler. Do not edit!
package com.example.drink_order_system.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.drink_order_system.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BillItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView TextDrinkIntro;

  @NonNull
  public final TextView TextDrinkName;

  @NonNull
  public final TextView TextDrinkPrice;

  @NonNull
  public final ImageButton buttonAdd;

  @NonNull
  public final ImageButton buttonSubtract;

  @NonNull
  public final ImageView imgDrink;

  @NonNull
  public final TextView textViewDrinkNumber;

  private BillItemBinding(@NonNull LinearLayout rootView, @NonNull TextView TextDrinkIntro,
      @NonNull TextView TextDrinkName, @NonNull TextView TextDrinkPrice,
      @NonNull ImageButton buttonAdd, @NonNull ImageButton buttonSubtract,
      @NonNull ImageView imgDrink, @NonNull TextView textViewDrinkNumber) {
    this.rootView = rootView;
    this.TextDrinkIntro = TextDrinkIntro;
    this.TextDrinkName = TextDrinkName;
    this.TextDrinkPrice = TextDrinkPrice;
    this.buttonAdd = buttonAdd;
    this.buttonSubtract = buttonSubtract;
    this.imgDrink = imgDrink;
    this.textViewDrinkNumber = textViewDrinkNumber;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BillItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BillItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bill_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BillItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Text_drinkIntro;
      TextView TextDrinkIntro = ViewBindings.findChildViewById(rootView, id);
      if (TextDrinkIntro == null) {
        break missingId;
      }

      id = R.id.Text_drinkName;
      TextView TextDrinkName = ViewBindings.findChildViewById(rootView, id);
      if (TextDrinkName == null) {
        break missingId;
      }

      id = R.id.Text_drinkPrice;
      TextView TextDrinkPrice = ViewBindings.findChildViewById(rootView, id);
      if (TextDrinkPrice == null) {
        break missingId;
      }

      id = R.id.button_add;
      ImageButton buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.button_subtract;
      ImageButton buttonSubtract = ViewBindings.findChildViewById(rootView, id);
      if (buttonSubtract == null) {
        break missingId;
      }

      id = R.id.img_drink;
      ImageView imgDrink = ViewBindings.findChildViewById(rootView, id);
      if (imgDrink == null) {
        break missingId;
      }

      id = R.id.textView_drinkNumber;
      TextView textViewDrinkNumber = ViewBindings.findChildViewById(rootView, id);
      if (textViewDrinkNumber == null) {
        break missingId;
      }

      return new BillItemBinding((LinearLayout) rootView, TextDrinkIntro, TextDrinkName,
          TextDrinkPrice, buttonAdd, buttonSubtract, imgDrink, textViewDrinkNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}