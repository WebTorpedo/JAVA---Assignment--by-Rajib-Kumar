/*Write a program to check the font class method as follows: Create a font
TimesRoman bold and Italic size 12. In this object use the font methods. Then
display the attributes of the font */


import java.applet.*;
import java.awt.*;
public class FontChecking
{
    public static void main (String [] args)
    {
        Font f;
        f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
        String font = f. getName();
        int style = f.getStyle ();
        int size = f.getSize ();
        boolean bold = f.isBold ();
        boolean normal = f.isPlain ();
        boolean italic = f.isItalic ();
        System.out.println(f.getPSName());

        System.out.println ("Font : "+ font + "\n Style : "+ style +
                "\n Size: " + size + "\n Bold : " +bold + "\n Italic : "+italic);
    }
}