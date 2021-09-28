package com.pengxr.easytrack.core

/**
 * Created by pengxr on 10/9/2021
 */
private sealed class TrackNodeType {

}
interface ITrackNode : ITrackModel {

    val parent: ITrackNode?
}