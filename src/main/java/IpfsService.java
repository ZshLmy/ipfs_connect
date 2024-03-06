import java.io.IOException;

public interface IpfsService {
    /**
     * 指定path+文件名称,上传至ipfs
     */
    String uploadToIpfs(String filePath) throws IOException;

    /**
     * 将byte格式的数据,上传至ipfs
     */
    String uploadToIpfs(byte[] data) throws IOException;

    /**
     * 根据Hash值,从ipfs下载内容,返回byte数据格式
     */
    byte[] downFromIpfs(String hash);

    /**
     * 根据Hash值,从ipfs下载内容,并写入指定文件destFilePath
     */
    void downFromIpfs(String hash, String destFilePath);
}