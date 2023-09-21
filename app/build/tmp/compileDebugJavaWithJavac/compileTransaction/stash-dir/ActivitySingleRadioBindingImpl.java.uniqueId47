package com.ypyglobal.xradio.databinding;
import com.ypyglobal.xradio.R;
import com.ypyglobal.xradio.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySingleRadioBindingImpl extends ActivitySingleRadioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(1, 
            new String[] {"item_single_radio_detail"},
            new int[] {3},
            new int[] {com.ypyglobal.xradio.R.layout.item_single_radio_detail});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.my_toolbar, 2);
        sViewsWithIds.put(R.id.img_bg, 4);
        sViewsWithIds.put(R.id.layout_ads, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySingleRadioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivitySingleRadioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (com.ypyglobal.xradio.databinding.ItemSingleRadioDetailBinding) bindings[3]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[0]
            , (bindings[2] != null) ? com.ypyglobal.xradio.databinding.ItemToolbarBinding.bind((android.view.View) bindings[2]) : null
            );
        setContainedBinding(this.itemSinglePlay);
        this.layoutBg.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        itemSinglePlay.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (itemSinglePlay.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        itemSinglePlay.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemSinglePlay((com.ypyglobal.xradio.databinding.ItemSingleRadioDetailBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemSinglePlay(com.ypyglobal.xradio.databinding.ItemSingleRadioDetailBinding ItemSinglePlay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        executeBindingsOn(itemSinglePlay);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemSinglePlay
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}