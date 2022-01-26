package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private String serialId;
    private String title;
    private String description;
    private double price;
    private int count;
    private Set<Author> authors;
    private Set<String> tags;
}
