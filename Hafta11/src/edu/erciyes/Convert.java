package edu.erciyes;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Convert
{

    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        String text = "madamada";
        System.out.println(hashFunctionGenerator(text));
    }
    public static String hashFunctionGenerator(String stringForEncode)
    {
        MessageDigest digest = null;
        try
        {
            digest = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        byte[] hash = digest.digest(stringForEncode.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }
}
