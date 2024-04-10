package Accelerator.DBEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "customer_record")
@Getter
@Setter
@RequiredArgsConstructor
public class Customer_record implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "record_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private DBUser user;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private RecordRole recordRole;

    // Getters and setters

}

