package org.jhotdraw.io;

/**
 * @see Base64#GZIP **/
public class Gzip2 extends Gzip {
    public String encodeBytes(byte[] source, int off, int len, int dontBreakLines) {
        java.io.ByteArrayOutputStream baos = null;
        java.util.zip.GZIPOutputStream gzos = null;
        Base64.OutputStream b64os = null;
        try {
            // GZip -> Base64 -> ByteArray
            baos = new java.io.ByteArrayOutputStream();
            b64os = new Base64.OutputStream(baos, Base64.ENCODE | dontBreakLines);
            gzos = new java.util.zip.GZIPOutputStream(b64os);
            gzos.write(source, off, len);
            gzos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                gzos.close();
            } catch (Exception e) {
                // empty allowed
            }
            try {
                b64os.close();
            } catch (Exception e) {
                // empty allowed
            }
            try {
                baos.close();
            } catch (Exception e) {
                // empty allowed
            }
        }
        try {
            return new String(baos.toByteArray(), Base64.PREFERRED_ENCODING);
        } catch (java.io.UnsupportedEncodingException uue) {
            return new String(baos.toByteArray());
        }
    }
}