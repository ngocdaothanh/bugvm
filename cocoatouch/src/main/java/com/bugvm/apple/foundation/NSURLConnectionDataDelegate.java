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
package com.bugvm.apple.foundation;

/*<imports>*/

import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSURLConnectionDataDelegate/*</name>*/ 
    /*<implements>*/extends NSURLConnectionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "connection:willSendRequest:redirectResponse:")
    NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response);
    @Method(selector = "connection:didReceiveResponse:")
    void didReceiveResponse(NSURLConnection connection, NSURLResponse response);
    @Method(selector = "connection:didReceiveData:")
    void didReceiveData(NSURLConnection connection, NSData data);
    @Method(selector = "connection:needNewBodyStream:")
    NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request);
    @Method(selector = "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite);
    @Method(selector = "connection:willCacheResponse:")
    NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse);
    @Method(selector = "connectionDidFinishLoading:")
    void didFinishLoading(NSURLConnection connection);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}