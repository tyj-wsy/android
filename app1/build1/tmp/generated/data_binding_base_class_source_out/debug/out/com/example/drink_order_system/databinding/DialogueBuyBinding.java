// Generated by view binder compiler. Do not edit!
package com.example.drink_order_system.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.drink_order_system.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogueBuyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonBought;

  @NonNull
  public final Button buttonQuit;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textViewAllCost;

  private DialogueBuyBinding(@NonNull LinearLayout rootView, @NonNull Button buttonBought,
      @NonNull Button buttonQuit, @NonNull ImageView imageView3,
      @NonNull TextView textViewAllCost) {
    this.rootView = rootView;
    this.buttonBought = buttonBought;
    this.buttonQuit = buttonQuit;
    this.imageView3 = imageView3;
    this.textViewAllCost = textViewAllCost;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogueBuyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogueBuyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialogue_buy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogueBuyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_bought;
      Button buttonBought = ViewBindings.findChildViewById(rootView, id);
      if (buttonBought == null) {
        break missingId;
      }

      id = R.id.button_quit;
      Button buttonQuit = ViewBindings.findChildViewById(rootView, id);
      if (buttonQuit == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView_allCost;
      TextView textViewAllCost = ViewBindings.findChildViewById(rootView, id);
      if (textViewAllCost == null) {
        break missingId;
      }

      return new DialogueBuyBinding((LinearLayout) rootView, buttonBought, buttonQuit, imageView3,
          textViewAllCost);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
