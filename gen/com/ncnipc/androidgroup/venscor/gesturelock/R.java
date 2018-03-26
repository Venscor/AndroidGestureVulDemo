/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.ncnipc.androidgroup.venscor.gesturelock;

public final class R {
    public static final class attr {
        /**  Aspect to use when drawing LockPatternView. Choices are "square"(default), "lock_width"
             or "lock_height" 
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int aspect=0x7f010000;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 
         */
        public static final int activity_horizontal_margin=0x7f040000;
        public static final int activity_vertical_margin=0x7f040001;
    }
    public static final class drawable {
        public static final int btn_code_lock_default_holo=0x7f020000;
        public static final int btn_code_lock_touched_holo=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int indicator_code_lock_drag_direction_green_up=0x7f020003;
        public static final int indicator_code_lock_drag_direction_red_up=0x7f020004;
        public static final int indicator_code_lock_point_area_default_holo=0x7f020005;
        public static final int indicator_code_lock_point_area_green_holo=0x7f020006;
        public static final int indicator_code_lock_point_area_red_holo=0x7f020007;
    }
    public static final class id {
        public static final int action_settings=0x7f080008;
        public static final int left_btn=0x7f080004;
        public static final int lock=0x7f080006;
        public static final int lock_pattern=0x7f080003;
        public static final int psd=0x7f080002;
        public static final int psdBt =0x7f080001;
        public static final int right_btn=0x7f080005;
        public static final int text=0x7f080000;
        public static final int unlock=0x7f080007;
    }
    public static final class layout {
        public static final int activity_lock=0x7f030000;
        public static final int activity_lock_setup=0x7f030001;
        public static final int activity_main=0x7f030002;
    }
    public static final class menu {
        public static final int main=0x7f070000;
    }
    public static final class string {
        public static final int action_settings=0x7f050001;
        public static final int app_name=0x7f050000;
        public static final int cancel=0x7f050002;
        public static final int confirm=0x7f050005;
        public static final int goon=0x7f050004;
        public static final int lockpattern_error=0x7f050007;
        public static final int lockpattern_recording_incorrect_too_short=0x7f050006;
        /**  Accessibility description sent when user adds a cell to the pattern. [CHAR LIMIT=NONE] 
         */
        public static final int lockscreen_access_pattern_cell_added=0x7f05000a;
        /**  Accessibility description sent when the pattern times out and is cleared. [CHAR LIMIT=NONE] 
         */
        public static final int lockscreen_access_pattern_cleared=0x7f050009;
        /**  Accessibility description sent when user completes drawing a pattern. [CHAR LIMIT=NONE] 
         */
        public static final int lockscreen_access_pattern_detected=0x7f05000b;
        /**  Accessibility description sent when user starts drawing a lock pattern. [CHAR LIMIT=NONE] 
         */
        public static final int lockscreen_access_pattern_start=0x7f050008;
        public static final int try_again=0x7f050003;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f060001;
    }
    public static final class styleable {
        /** Attributes that can be used with a LockPatternView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #LockPatternView_aspect com.ncnipc.androidgroup.venscor.gesturelock:aspect}</code></td><td> Aspect to use when drawing LockPatternView.</td></tr>
           </table>
           @see #LockPatternView_aspect
         */
        public static final int[] LockPatternView = {
            0x7f010000
        };
        /**
          <p>
          @attr description
           Aspect to use when drawing LockPatternView. Choices are "square"(default), "lock_width"
             or "lock_height" 


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.ncnipc.androidgroup.venscor.gesturelock:aspect
        */
        public static final int LockPatternView_aspect = 0;
    };
}
