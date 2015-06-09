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
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

/**
 * A set of constants for the style that can be used for the separatorStyle property
 * of Titanium.UI.ListView.
 */
public class ListViewSeparatorStyle {

    public static final int LISTVIEW_SEPARATOR_STYLE_NONE = NONE();
    public static final int LISTVIEW_SEPARATOR_STYLE_SINGLE_LINE = SINGLE_LINE();

    private ListViewSeparatorStyle() {
    }

    public static native final int NONE() /*-{
		return Titanium.UI.iPhone.ListViewSeparatorStyle.NONE;
    }-*/;

    public static native final int SINGLE_LINE() /*-{
		return Titanium.UI.iPhone.ListViewSeparatorStyle.SINGLE_LINE;
    }-*/;

}