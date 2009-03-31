//---------------------------------------------------------------------------
// THIS FILE WAS AUTOMATICALLY GENERATED - HAND ALTERATIONS MAY BE LOST
//---------------------------------------------------------------------------
package flash.text;

import org.epistem.j2avm.annotations.runtime.*;

@FlashNativeClass
public class TextField extends flash.display.InteractiveObject {

    public  TextField( ) {}

    public static final native boolean isFontCompatible( String fontName, String fontStyle );

    @Setter
    public native void setAlwaysShowSelection( boolean setAlwaysShowSelection );

    public native void replaceText( int beginIndex, int endIndex, String newText );

    @Setter
    public native void setSharpness( double setSharpness );

    @Getter
    public native boolean getWordWrap( );

    public native void setTextFormat( flash.text.TextFormat format, int beginIndex, int endIndex );

    public native void setTextFormat( flash.text.TextFormat format, int beginIndex );

    public native void setTextFormat( flash.text.TextFormat format );

    public native int getLineLength( int lineIndex );

    @Setter
    public native void setGridFitType( String setGridFitType );

    public native flash.FlashArray getTextRuns( int beginIndex, int endIndex );

    public native flash.FlashArray getTextRuns( int beginIndex );

    public native flash.FlashArray getTextRuns( );

    @Getter
    public native int getCaretIndex( );

    @Setter
    public native void setWordWrap( boolean setWordWrap );

    @Getter
    public native int getBorderColor( );

    @Setter
    public native void setCondenseWhite( boolean setCondenseWhite );

    @Getter
    public native int getNumLines( );

    @Getter
    public native int getScrollH( );

    public native int getLineOffset( int lineIndex );

    @Getter
    public native int getMaxScrollH( );

    @Setter
    public native void setAutoSize( String setAutoSize );

    @Getter
    public native flash.text.TextFormat getDefaultTextFormat( );

    public native flash.display.DisplayObject getImageReference( String id );

    @Getter
    public native double getTextWidth( );

    @Getter
    public native int getScrollV( );

    @Setter
    public native void setBackgroundColor( int setBackgroundColor );

    @Getter
    public native boolean getEmbedFonts( );

    @Getter
    public native boolean getBorder( );

    @Getter
    public native boolean getMultiline( );

    @Getter
    public native boolean getBackground( );

    @Setter
    public native void setMaxChars( int setMaxChars );

    @Setter
    public native void setSelectable( boolean setSelectable );

    @Getter
    public native int getMaxScrollV( );

    @Setter
    public native void setBorderColor( int setBorderColor );

    @Setter
    public native void setDisplayAsPassword( boolean setDisplayAsPassword );

    public native String getLineText( int lineIndex );

    public native int getFirstCharInParagraph( int charIndex );

    @Getter
    public native boolean getMouseWheelEnabled( );

    @Getter
    public native double getTextHeight( );

    @Getter
    public native String getRestrict( );

    @Setter
    public native void setScrollH( int setScrollH );

    public native String getRawText( );

    @Getter
    public native boolean getAlwaysShowSelection( );

    @Getter
    public native double getSharpness( );

    public native flash.geom.Rectangle getCharBoundaries( int charIndex );

    @Getter
    public native String getGridFitType( );

    @Getter
    public native flash.text.StyleSheet getStyleSheet( );

    @Getter
    public native boolean getUseRichTextClipboard( );

    @Getter
    public native String getType( );

    @Setter
    public native void setDefaultTextFormat( flash.text.TextFormat setDefaultTextFormat );

    public native void replaceSelectedText( String value );

    @Getter
    public native boolean getCondenseWhite( );

    public native int getParagraphLength( int charIndex );

    @Getter
    public native int getTextColor( );

    @Getter
    public native boolean getDisplayAsPassword( );

    @Getter
    public native String getAutoSize( );

    public native void setSelection( int beginIndex, int endIndex );

    @Setter
    public native void setScrollV( int setScrollV );

    @Setter
    public native void setUseRichTextClipboard( boolean setUseRichTextClipboard );

    @Getter
    public native int getBackgroundColor( );

    @Getter
    public native boolean getSelectable( );

    @Setter
    public native void setAntiAliasType( String setAntiAliasType );

    @Setter
    public native void setBorder( boolean setBorder );

    @Getter
    public native int getMaxChars( );

    @Setter
    public native void setMultiline( boolean setMultiline );

    public native String getXMLText( int beginIndex, int endIndex );

    public native String getXMLText( int beginIndex );

    public native String getXMLText( );

    @Setter
    public native void setBackground( boolean setBackground );

    @Setter
    public native void setEmbedFonts( boolean setEmbedFonts );

    public native int getCharIndexAtPoint( double x, double y );

    @Setter
    public native void setText( String setText );

    @Getter
    public native int getSelectionEndIndex( );

    @Getter
    public native int getSelectionBeginIndex( );

    @Setter
    public native void setMouseWheelEnabled( boolean setMouseWheelEnabled );

    @Getter
    public native int getLength( );

    public native void appendText( String newText );

    @Getter
    public native String getAntiAliasType( );

    @Setter
    public native void setStyleSheet( flash.text.StyleSheet setStyleSheet );

    @Setter
    public native void setTextColor( int setTextColor );

    @Getter
    public native String getSelectedText( );

    @Setter
    public native void setHtmlText( String setHtmlText );

    public native void insertXMLText( int beginIndex, int endIndex, String richText, boolean pasting );

    public native void insertXMLText( int beginIndex, int endIndex, String richText );

    @Getter
    public native String getText( );

    @Getter
    public native double getThickness( );

    public native int getLineIndexAtPoint( double x, double y );

    @Setter
    public native void setThickness( double setThickness );

    @Getter
    public native String getHtmlText( );

    public native flash.text.TextLineMetrics getLineMetrics( int lineIndex );

    public native flash.text.TextFormat getTextFormat( int beginIndex, int endIndex );

    public native flash.text.TextFormat getTextFormat( int beginIndex );

    public native flash.text.TextFormat getTextFormat( );

    @Setter
    public native void setType( String setType );

    public native int getLineIndexOfChar( int charIndex );

    @Getter
    public native int getBottomScrollV( );

    @Setter
    public native void setRestrict( String setRestrict );
}
