import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AbsoluteRelative{
    public static void main(String[] args){
        try{
            //Base URL(Absolute URL)
            URI baseUri = new URI("https://www.example.com/path/to/resource");
            System.out.println("Base URL(Absolute):");

            //Relative URL
            URI relativeUri = new URI("subpage.html");
            System.out.println("Relative URL:"+relativeUri);

            //Resolve the relative URL against the base URL
            URI resolvedUri = baseUri.resolve(relativeUri);
            System.out.println("Resolved URL(Absolute):"+resolvedUri);
            
            //Convert URI to URL
            URL resolvedUrl = resolvedUri.toURL();
            System.out.println("Resolved URL as URL object:"+resolvedUrl);
        }
    }
}