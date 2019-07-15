package lesson9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    private T type;
}
