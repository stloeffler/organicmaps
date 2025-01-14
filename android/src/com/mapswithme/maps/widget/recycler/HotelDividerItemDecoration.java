package com.mapswithme.maps.widget.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;


class HotelDividerItemDecoration extends DividerItemDecoration
{
  /**
   * Creates a divider {@link RecyclerView.ItemDecoration} that can be used with a
   * {@link LinearLayoutManager}.
   *
   * @param context     Current context, it will be used to access resources.
   * @param orientation Divider orientation. Should be {@link #HORIZONTAL} or {@link #VERTICAL}.
   */
  HotelDividerItemDecoration(Context context, int orientation)
  {
    super(context, orientation);
  }

  @Override
  public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state)
  {
    super.getItemOffsets(outRect, view, parent, state);

    int itemCount = state.getItemCount();
    int itemPosition = parent.getChildAdapterPosition(view);
    // Last position.
    if (itemPosition != RecyclerView.NO_POSITION && itemPosition > 0
        && itemCount > 0 && itemPosition == itemCount - 1)
    {
      outRect.set(0, 0, 0, 0);
    }
  }
}
