package com.emkay.entity.unimany;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


//@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Table(name = "major")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Major {
    @Id
    @Column(name = "id", columnDefinition = "CHAR(2)")
    String id;
    @Column(name = "name", columnDefinition = "NVARCHAR(100)")
    String name;

}
