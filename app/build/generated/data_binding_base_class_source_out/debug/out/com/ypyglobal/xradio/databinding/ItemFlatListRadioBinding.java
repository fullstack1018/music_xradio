// Generated by view binder compiler. Do not edit!
package com.ypyglobal.xradio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ypyglobal.xradio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFlatListRadioBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imgRadio;

  @NonNull
  public final RelativeLayout layoutRoot;

  @NonNull
  public final TextView tvDes;

  @NonNull
  public final TextView tvName;

  private ItemFlatListRadioBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imgRadio,
      @NonNull RelativeLayout layoutRoot, @NonNull TextView tvDes, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.imgRadio = imgRadio;
    this.layoutRoot = layoutRoot;
    this.tvDes = tvDes;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFlatListRadioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFlatListRadioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_flat_list_radio, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFlatListRadioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_radio;
      ImageView imgRadio = ViewBindings.findChildViewById(rootView, id);
      if (imgRadio == null) {
        break missingId;
      }

      id = R.id.layout_root;
      RelativeLayout layoutRoot = ViewBindings.findChildViewById(rootView, id);
      if (layoutRoot == null) {
        break missingId;
      }

      id = R.id.tv_des;
      TextView tvDes = ViewBindings.findChildViewById(rootView, id);
      if (tvDes == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new ItemFlatListRadioBinding((RelativeLayout) rootView, imgRadio, layoutRoot, tvDes,
          tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
