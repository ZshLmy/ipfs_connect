import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IpfsService ipfsService = new IpfsServiceImpl();
//        String hash = ipfsService.uploadToIpfs("first upload".getBytes(StandardCharsets.UTF_8));
//        System.out.println(hash);
        String hash = "QmS3zyc5dirL1PygNhDuNDKy1h2dfJgrhc9t4F5YxXA2ZW";
        System.out.println(new String(ipfsService.downFromIpfs(hash)));
    }
}
