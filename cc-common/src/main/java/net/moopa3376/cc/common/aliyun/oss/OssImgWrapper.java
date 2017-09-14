package net.moopa3376.cc.common.aliyun.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import net.moopa3376.cc.common.config.ConfigCenterConfigs;

import java.io.ByteArrayInputStream;

/**
 * Created by Moopa on 03/06/2017.
 * blog: moopa.net
 *
 * @autuor : Moopa
 */
public class OssImgWrapper {
    private static String imgServerAddress = ConfigCenterConfigs.get("img.server",null);
    private static String id = "LTAIwqKNw5ucqahI";
    private static String secret = "XC90Ic90YaFtQccSUG4faVOYnDdEAM";
    private static String bucketName = "iucl-oss";

    public static int updateImg(byte[] bytes,String avatar_key){

        try {
            // endpoint以杭州为例，其它region请按实际情况填写
            String endpoint = "http://oss-cn-shanghai.aliyuncs.com";

            // 创建OSSClient实例
            OSSClient ossClient = new OSSClient(endpoint, id, secret);

            // 上传img文件
            PutObjectResult putObjectResult = ossClient.putObject(bucketName, avatar_key, new ByteArrayInputStream(bytes));
            // 关闭client
            ossClient.shutdown();
        }catch (Exception e){
            return -1;
        }

        return 1;
    }

}
