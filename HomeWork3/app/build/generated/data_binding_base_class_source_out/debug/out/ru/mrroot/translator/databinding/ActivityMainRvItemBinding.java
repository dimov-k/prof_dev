// Generated by view binder compiler. Do not edit!
package ru.mrroot.translator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.mrroot.translator.R;

public final class ActivityMainRvItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView descriptionTextviewRv;

  @NonNull
  public final TextView headerTextviewRv;

  @NonNull
  public final TextView transcriptionTextviewRv;

  private ActivityMainRvItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView descriptionTextviewRv, @NonNull TextView headerTextviewRv,
      @NonNull TextView transcriptionTextviewRv) {
    this.rootView = rootView;
    this.descriptionTextviewRv = descriptionTextviewRv;
    this.headerTextviewRv = headerTextviewRv;
    this.transcriptionTextviewRv = transcriptionTextviewRv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainRvItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_rv_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainRvItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description_textview_rv;
      TextView descriptionTextviewRv = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextviewRv == null) {
        break missingId;
      }

      id = R.id.header_textview_rv;
      TextView headerTextviewRv = ViewBindings.findChildViewById(rootView, id);
      if (headerTextviewRv == null) {
        break missingId;
      }

      id = R.id.transcription_textview_rv;
      TextView transcriptionTextviewRv = ViewBindings.findChildViewById(rootView, id);
      if (transcriptionTextviewRv == null) {
        break missingId;
      }

      return new ActivityMainRvItemBinding((LinearLayout) rootView, descriptionTextviewRv,
          headerTextviewRv, transcriptionTextviewRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}