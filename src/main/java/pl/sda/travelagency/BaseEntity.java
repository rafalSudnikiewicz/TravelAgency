package pl.sda.travelagency;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;


}
