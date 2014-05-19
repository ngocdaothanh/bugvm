/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.corelocation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CoreLocation/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CoreLocation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCLErrorDomain", optional=true)
    public static native NSString ErrorDomain();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="kCLErrorUserInfoAlternateRegionKey", optional=true)
    public static native NSString ErrorUserInfoAlternateRegionKey();
    @GlobalValue(symbol="kCLDistanceFilterNone", optional=true)
    public static native double DistanceFilterNone();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="kCLLocationAccuracyBestForNavigation", optional=true)
    public static native double LocationAccuracyBestForNavigation();
    @GlobalValue(symbol="kCLLocationAccuracyBest", optional=true)
    public static native double LocationAccuracyBest();
    @GlobalValue(symbol="kCLLocationAccuracyNearestTenMeters", optional=true)
    public static native double LocationAccuracyNearestTenMeters();
    @GlobalValue(symbol="kCLLocationAccuracyHundredMeters", optional=true)
    public static native double LocationAccuracyHundredMeters();
    @GlobalValue(symbol="kCLLocationAccuracyKilometer", optional=true)
    public static native double LocationAccuracyKilometer();
    @GlobalValue(symbol="kCLLocationAccuracyThreeKilometers", optional=true)
    public static native double LocationAccuracyThreeKilometers();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="CLLocationDistanceMax", optional=true)
    public static native double LocationDistanceMax();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="CLTimeIntervalMax", optional=true)
    public static native double TimeIntervalMax();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="kCLLocationCoordinate2DInvalid", optional=true)
    public static native @ByVal CLLocationCoordinate2D LocationCoordinate2DInvalid();
    @GlobalValue(symbol="kCLHeadingFilterNone", optional=true)
    public static native double HeadingFilterNone();
    /*</methods>*/
}