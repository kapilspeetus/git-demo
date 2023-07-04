import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

class Base64Class{
	public static void main(String[] args) {
        String base64Data = "UEsDBBQACAgIAMhb3lYAAAAAAAAAAAAAAAAhAAAAdW5wYWNrYWdlZC9vYmplY3RzL0FjY291bnQub2JqZWN07VlRb5swEH7vr0B5XyFJt1UTpeqada2UppXSPuwpcsyRejWY2iZr9utnMAQYSdV0OIrW5Amfj4/Pn++OM3FPn0NqzYELwqKTTvfQ6VgQYeaTaHbSub+7+HDcOfUO3PNESBbeTH8Clpa6JRInnQcp4y+2LRiKD0XAOIZDzEK75zifbOfIDkEiH0nU8Q4s9XMDAtQXeqANCaUjFIJ3hiWZw2SCXXtpK93gWQKPEL3yvQBRAa5dsZRuFE2B5lCurUflLIenhHBYQizHpYvkCD9eAPiXRK2VLwrXhr1yyyIG75bgR6qmlGc6LGfniCYwBlmaauYBBCQiUuled8icBOOyZJuPmm4ZVtNel3fEVula8/UhQAmVxfOK4WpnrW2K+pfKSw97Da/X8f0BwgThDHYTxrlxzVaVs3l829UAfyHadSoBv+WEcSIXrcR9AWoVqPsUqGp+SWYPJmJK45pJgyH7ZYJyBmuG8TX4JAlNkC6Qdyh9J1eDdZmLkVDAkSDpu6hYZt24Ms0lT16Z5VeDZn5TiGbyweseqyl9uZXcv1N8G3mfRORJ7YdeUD7YTObrxUU610pxzLHWS+Y4u6NZDvEm0UZJOFWRyYLJOYskwrIV+TSqxQIrR20KGXPAJG0hs/ArRxupKTCi4Kmt0Bf/LrMmbk5oFgwZRmldES0LvcR9Ser+e1B6PDz79hwTnskxQLKdY4JCtUpYK8XdasOkH1iqtYkcY+AE0TzV2xJDg1rFPq4tlP9HnVQrbku5fZ9dFfY7S1+z7fd/GtdM1zomdJ7GfPusC2QzvG+pKl6RmX67xDbD/Stn0W8wwbxA3oGTwn0sgNKbOFYppcpUSyd9jWpVYPclqHZwQIupkcjKgc0kxP4b3U59o6Ns1k5LnwKtb6f6Xedzb0VL9dbkvJQhbSamOiBMKQxJBML7qDq4mmEzXYREXE4kCdtpwzM4K4Xbag27yx74hu5bgpCTbitLj1UdPcOYJdGK4/R7rt+pxl0TtSUHNlMPU/CeKdY9k6z7plj3TbI+MsX6aDvvH9eu/qPqHfwBUEsHCKgerwkSAwAAiB0AAFBLAwQUAAgICADIW95WAAAAAAAAAAAAAAAAFgAAAHVucGFja2FnZWQvcGFja2FnZS54bWy9lM1qwzAQhO9+CuN7Laf0j6I4mKSBQtoGkpyFqmxcUUsrpHVI3r6undDeeiiKTlox0sdqluGTg2nSPfig0Y6zUV5kKViFW23rcbZZz68eskmZ8KVUn7KGtFPbMM4+iNwjYwGly8MOvYJcoWHXRXHHihtmgORWkszKJO0Wp6ODMOz72oB575BlpRS2lvJpGwgN+KXX6DUdhVCcnUU/16w0UA7auYZmy1l/MjDYL8ifwNWiis6oFOk9RMe8tt817haoJHUmhujEjQvQNG/OoafWXsiuFXgtm6HZS/CeDk77/kNnkuK7GEh6EqTNpQZG4E5M0ZJUFJ34cuwfiM5psI4//QSBxCg65hyJ4nn2b9Yp3svb+7zg7FwlnJ1SvUy+AFBLBwhgXPioHwEAAAcGAABQSwECFAAUAAgICADIW95WqB6vCRIDAACIHQAAIQAAAAAAAAAAAAAAAAAAAAAAdW5wYWNrYWdlZC9vYmplY3RzL0FjY291bnQub2JqZWN0UEsBAhQAFAAICAgAyFveVmBc+KgfAQAABwYAABYAAAAAAAAAAAAAAAAAYQMAAHVucGFja2FnZWQvcGFja2FnZS54bWxQSwUGAAAAAAIAAgCTAAAAxAQAAAAA";
		byte[] decodedBytes = Base64.getDecoder().decode(base64Data);
		String outputPath = "C:/Users/speetus/Desktop/Base64 Java/output.zip";
		try (FileOutputStream fos = new FileOutputStream(outputPath)) {
		    fos.write(decodedBytes);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}

/*
	
import java.util.Base64;

public class Base64Decoder {
    public static void main(String[] args) {
        String base64Data = "T3BlbkFJ"; // Base64-encoded data

        // Decode the Base64 data
        byte[] decodedBytes = Base64.getDecoder().decode(base64Data);

        // Convert the decoded bytes to string
        String decodedText = new String(decodedBytes);

        System.out.println(decodedText);
    }
}
*/