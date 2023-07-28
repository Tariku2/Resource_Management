package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileUpload {
    private String fileName;
    private String downloadURI;
    private String fileType;
    private Long fileSize;
}
