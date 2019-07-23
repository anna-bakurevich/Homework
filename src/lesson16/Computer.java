package lesson16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Computer implements Serializable {
    private String name;
    private String processor;
    private String hardDisk;

}
