//---------------------------------------------------------------------------
// THIS FILE WAS AUTOMATICALLY GENERATED - HAND ALTERATIONS MAY BE LOST
//---------------------------------------------------------------------------
package flash.display;

import org.epistem.j2avm.annotations.runtime.*;

@FlashNativeClass
public class Bitmap extends flash.display.DisplayObject {

    public  Bitmap( flash.display.BitmapData bitmapData, String pixelSnapping, boolean smoothing ) {}

    public  Bitmap( flash.display.BitmapData bitmapData, String pixelSnapping ) {}

    public  Bitmap( flash.display.BitmapData bitmapData ) {}

    public  Bitmap( ) {}

    @Setter
    public native void setBitmapData( flash.display.BitmapData setBitmapData );

    @Getter
    public native String getPixelSnapping( );

    @Setter
    public native void setPixelSnapping( String setPixelSnapping );

    @Setter
    public native void setSmoothing( boolean setSmoothing );

    @Getter
    public native flash.display.BitmapData getBitmapData( );

    @Getter
    public native boolean getSmoothing( );
}
