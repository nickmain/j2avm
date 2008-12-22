package org.epistem.jvm.type;

/**
 * The void type
 *
 * @author nickmain
 */
public final class VoidType extends JavaType {
    
    public static final VoidType VOID = new VoidType();
    
    private VoidType() { super( "void", "V" ); }
}
