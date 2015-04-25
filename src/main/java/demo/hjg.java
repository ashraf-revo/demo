package demo;

import java.net.URI;

/**
 * Created by ashraf on 4/25/15.
 */
public class hjg {
    public static void main(String[] args) throws Exception{
        URI dbUri = new URI("postgres://axwphuyfglmmdw:kaegQ1a1m303RrLq7vYBn3c8Yg@ec2-54-163-238-96.compute-1.amazonaws.com:5432/d40jfjsuhjctgj");

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        System.out.println(dbUri);
    }
}
