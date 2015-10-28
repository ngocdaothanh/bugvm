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
package com.bugvm.apple.passkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAddPaymentPassRequestConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAddPaymentPassRequestConfigurationPtr extends Ptr<PKAddPaymentPassRequestConfiguration, PKAddPaymentPassRequestConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAddPaymentPassRequestConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKAddPaymentPassRequestConfiguration() {}
    protected PKAddPaymentPassRequestConfiguration(SkipInit skipInit) { super(skipInit); }
    public PKAddPaymentPassRequestConfiguration(String encryptionScheme) { super((SkipInit) null); initObject(init(encryptionScheme)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "encryptionScheme")
    public native String getEncryptionScheme();
    @Property(selector = "cardholderName")
    public native String getCardholderName();
    @Property(selector = "setCardholderName:")
    public native void setCardholderName(String v);
    @Property(selector = "primaryAccountSuffix")
    public native String getPrimaryAccountSuffix();
    @Property(selector = "setPrimaryAccountSuffix:")
    public native void setPrimaryAccountSuffix(String v);
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Property(selector = "primaryAccountIdentifier")
    public native String getPrimaryAccountIdentifier();
    @Property(selector = "setPrimaryAccountIdentifier:")
    public native void setPrimaryAccountIdentifier(String v);
    @Property(selector = "paymentNetwork")
    public native String getPaymentNetwork();
    @Property(selector = "setPaymentNetwork:")
    public native void setPaymentNetwork(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEncryptionScheme:")
    protected native @Pointer long init(String encryptionScheme);
    /*</methods>*/
}