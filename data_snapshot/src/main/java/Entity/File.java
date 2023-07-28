package Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table
@Data@NoArgsConstructor
public class File {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")

    private String id;

    private String fileName;
    private String fileType;
    private long size;
    @Lob
    private byte[] Data;

    public File(String fileName, MultipartFile multipartFile) {
    }


    public void setFileDownloadURI(String s) {
    }

    public File(String fileName, String fileType, byte[] data) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.size = size;
        Data = data;
    }
}
