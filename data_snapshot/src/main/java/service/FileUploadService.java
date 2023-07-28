package service;

import Entity.File;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    public File saveFile(MultipartFile multipartFile) throws Exception;

    File getFile(String fileId) throws Exception;
}
