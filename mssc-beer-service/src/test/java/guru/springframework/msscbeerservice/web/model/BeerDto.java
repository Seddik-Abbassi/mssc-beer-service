package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by AD on 12/12/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private int version;

    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnumm beerStyle;

    private Long upc;

    private BigDecimal price;

    private int quantityOnHand;
}
