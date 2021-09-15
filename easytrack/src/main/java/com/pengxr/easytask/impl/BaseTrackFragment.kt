package com.pengxr.easytask.impl

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.pengxr.easytask.core.ITrackModel
import com.pengxr.easytask.core.TrackParams
import com.pengxr.easytask.util.trackModel

/**
 * Base Fragment with event track，You don't have to used it.
 * <p>
 * Created by pengxr on 10/9/2021
 */
abstract class BaseTrackFragment : Fragment, ITrackModel {

    constructor ()

    constructor (@LayoutRes contentLayoutId: Int) : super(contentLayoutId)

    // ---------------------------------------------------------------------------------------------
    // Fragment
    // ---------------------------------------------------------------------------------------------

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.trackModel = this
    }

    // ---------------------------------------------------------------------------------------------
    // IPageTrackNode
    // ---------------------------------------------------------------------------------------------

    override fun fillTrackParams(params: TrackParams) {
    }
}