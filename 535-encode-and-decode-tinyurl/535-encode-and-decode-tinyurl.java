public class Codec {
HashMap<Integer,String> hs=new HashMap<Integer,String>();
    static int key=1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        hs.put(key,longUrl);
        key++;
        return Integer.toString(key-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
       return hs.get(Integer.parseInt(shortUrl)); 
        
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));