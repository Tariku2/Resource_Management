package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import repo.fileUploadRepository;
import Entity.File;

@Service
@Slf4j
public class FileUploadServiceImpl implements FileUploadService{
    @Autowired
    private fileUploadRepository fileUploadRepo;
    public FileUploadServiceImpl(fileUploadRepository fileUploadRepo){
        this.fileUploadRepo=fileUploadRepo;
    }
    public File saveFile(MultipartFile multipartFile) throws Exception {
        log.info("inside saveAttachment of file Upload service");
        String fileName= StringUtils.cleanPath(multipartFile.getOriginalFilename());
        try {
            if(fileName.contains("...")){
                throw new Exception("file name contaians invalid path sequence"+fileName);
            }
 File file =new File(fileName,multipartFile.getContentType(),multipartFile.getBytes());
            return fileUploadRepo.save(file);

        }
        catch (Exception e){
            throw new Exception("file couldn't be saved"+fileName);

        }


    }

    public File findFileById(String fileId) {
        return fileUploadRepo.getReferenceById(fileId);
    }

    @Override
    public File getFile(String fileId) throws Exception {
        return fileUploadRepo.findById(fileId)
                .orElseThrow(()->new  Exception("File not found with id"+fileId));

    }



}


