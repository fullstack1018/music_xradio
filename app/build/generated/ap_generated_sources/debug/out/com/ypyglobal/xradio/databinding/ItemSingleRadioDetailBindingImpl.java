package com.ypyglobal.xradio.databinding;
import com.ypyglobal.xradio.R;
import com.ypyglobal.xradio.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSingleRadioDetailBindingImpl extends ItemSingleRadioDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_img, 1);
        sViewsWithIds.put(R.id.tv_sleep_timer, 2);
        sViewsWithIds.put(R.id.img_play_song, 3);
        sViewsWithIds.put(R.id.equalizer, 4);
        sViewsWithIds.put(R.id.layout_info_play, 5);
        sViewsWithIds.put(R.id.tv_drag_song, 6);
        sViewsWithIds.put(R.id.tv_drag_singer, 7);
        sViewsWithIds.put(R.id.layout_volume, 8);
        sViewsWithIds.put(R.id.seekBar1, 9);
        sViewsWithIds.put(R.id.img_volume_off, 10);
        sViewsWithIds.put(R.id.img_volume_max, 11);
        sViewsWithIds.put(R.id.layout_control, 12);
        sViewsWithIds.put(R.id.layout_content, 13);
        sViewsWithIds.put(R.id.fb_play, 14);
        sViewsWithIds.put(R.id.tv_percent, 15);
        sViewsWithIds.put(R.id.play_progressBar1, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSingleRadioDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemSingleRadioDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (eu.gsottbauer.equalizerview.EqualizerView) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[8]
            , (com.wang.avi.AVLoadingIndicatorView) bindings[16]
            , (com.warkiz.widget.IndicatorSeekBar) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[2]
            );
        this.layoutDragDropBg.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}