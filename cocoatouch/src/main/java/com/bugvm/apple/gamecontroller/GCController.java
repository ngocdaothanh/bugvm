/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.gamecontroller;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeDidConnect(final VoidBlock1<GCController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidConnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((GCController) a.getObject());
                }
            });
        }
        public static NSObject observeDidDisconnect(final VoidBlock1<GCController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidDisconnectNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((GCController) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class GCControllerPtr extends Ptr<GCController, GCControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCController() {}
    protected GCController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controllerPausedHandler")
    public native @Block VoidBlock1<GCController> getControllerPausedHandler();
    @Property(selector = "setControllerPausedHandler:")
    public native void setControllerPausedHandler(@Block VoidBlock1<GCController> v);
    @Property(selector = "handlerQueue")
    public native DispatchQueue getHandlerQueue();
    @Property(selector = "setHandlerQueue:")
    public native void setHandlerQueue(DispatchQueue v);
    @Property(selector = "vendorName")
    public native String getVendorName();
    @Property(selector = "isAttachedToDevice")
    public native boolean isAttachedToDevice();
    @Property(selector = "playerIndex")
    public native GCControllerPlayerIndex getPlayerIndex();
    @Property(selector = "setPlayerIndex:")
    public native void setPlayerIndex(GCControllerPlayerIndex v);
    @Property(selector = "gamepad")
    public native GCGamepad getGamepad();
    @Property(selector = "extendedGamepad")
    public native GCExtendedGamepad getExtendedGamepad();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "motion")
    public native GCMotion getMotion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GCControllerDidConnectNotification", optional=true)
    public static native NSString DidConnectNotification();
    @GlobalValue(symbol="GCControllerDidDisconnectNotification", optional=true)
    public static native NSString DidDisconnectNotification();
    
    @Method(selector = "controllers")
    public static native NSArray<GCController> getControllers();
    @Method(selector = "startWirelessControllerDiscoveryWithCompletionHandler:")
    public static native void startWirelessControllerDiscovery(@Block Runnable completionHandler);
    @Method(selector = "stopWirelessControllerDiscovery")
    public static native void stopWirelessControllerDiscovery();
    /*</methods>*/
}
