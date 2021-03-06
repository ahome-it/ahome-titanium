/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.core.events.geolocation;

import com.ait.toolkit.titanium.mobile.client.core.events.Event;
import com.ait.toolkit.titanium.mobile.client.geolocation.HeadingInfo;
import com.google.gwt.core.client.JavaScriptObject;

public class HeadingEvent extends Event {

    public static final String HEADING = "heading";

    protected HeadingEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * if success is false, the error code if available (iOS only)
     */
    public final native double getCode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.code;
    }-*/;

    /**
     * boolean to indicate if the heading event was successfully received or an
     * error occurred
     */
    public final native boolean isSuccess() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.success;
    }-*/;

    /**
     * if success is false, returns a string of the error description
     */
    public final native String getError() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		return jso.error;
    }-*/;

    /**
     * heading results dictionary.
     */
    public final native HeadingInfo getHeading() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()()
		var obj = jso.headinInfo;
		var toReturn = @com.ait.toolkit.titanium.mobile.client.geolocation.HeadingInfo::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
