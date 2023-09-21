package com.ypyglobal.xradio.databinding;
import com.ypyglobal.xradio.R;
import com.ypyglobal.xradio.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRecyclerviewBindingImpl extends FragmentRecyclerviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"item_footer"},
            new int[] {1},
            new int[] {com.ypyglobal.xradio.R.layout.item_footer});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swiperefresh, 2);
        sViewsWithIds.put(R.id.recycler_view, 3);
        sViewsWithIds.put(R.id.tv_no_result, 4);
        sViewsWithIds.put(R.id.progress_bar, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecyclerviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRecyclerviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.ypyglobal.xradio.databinding.ItemFooterBinding) bindings[1]
            , (com.ypyglobal.xradio.ypylibs.view.CircularProgressBar) bindings[5]
            , (com.ypyglobal.xradio.ypylibs.view.YPYRecyclerView) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        setContainedBinding(this.footerView);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        footerView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (footerView.hasPendingBindings()) {
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
        footerView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFooterView((com.ypyglobal.xradio.databinding.ItemFooterBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFooterView(com.ypyglobal.xradio.databinding.ItemFooterBinding FooterView, int fieldId) {
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
        executeBindingsOn(footerView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): footerView
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}