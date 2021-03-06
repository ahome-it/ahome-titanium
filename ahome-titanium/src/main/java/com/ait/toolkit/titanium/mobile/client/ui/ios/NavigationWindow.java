/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.ui.Window;
import com.ait.toolkit.titanium.mobile.client.ui.ipad.SplitWindow;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A NavigationWindow implements a specialized view that manages the navigation
 * of hierarchical content.
 * <p>
 * All NavigationWindow objects must have at least one root window that cannot
 * be removed. When creating a NavigationWindow with the factory method, you
 * must set its window property to the root level window.
 * <p>
 * This object is not meant to be added to other windows. However, it can be
 * used within a {@link SplitWindow}.
 */
public class NavigationWindow extends Window {

    public NavigationWindow( Window window ) {
        jsObj = createNavigationWindow( "", new ArrayList<String>(), window.getJsObj() );
    }

    public NavigationWindow( String id, Window window ) {
        jsObj = createNavigationWindow( id, new ArrayList<String>(), window.getJsObj() );
    }

    public NavigationWindow( String id, List<String> classes, Window window ) {
        jsObj = createNavigationWindow( id, classes, window.getJsObj() );
    }

    public native void closeWindow( Window windown ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.closeWindow(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void closeWindow( Window windown, boolean animate ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.closeWindow(
				window.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					animated : animate
				});
    }-*/;

    public native void openWindow( Window windown ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.openWindow(window.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void openWindow( Window windown, boolean animate ) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.openWindow(
				window.@com.ait.toolkit.core.client.JsObject::getJsObj()(), {
					animated : animate
				});
    }-*/;

    public native Window getWindow() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.getWindow();
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.Window::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
    }-*/;

    native JavaScriptObject createNavigationWindow( String elId, List<String> classes, JavaScriptObject win ) /*-{
		var cls = @com.ait.toolkit.titanium.mobile.client.ui.UI::_createClassList(Ljava/util/List;)(classes);
		var obj = @com.ait.toolkit.titanium.mobile.client.ui.UI::createIfPossible(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)('Titanium.UI.iOS.NavigationWindow', elId, classes)
		return obj || Titanium.UI.iOS.createNavigationWindow({
			window : win,
			id : elId,
			'class' : cls
		})
    }-*/;

}
