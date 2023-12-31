package pl.RemigiuszInstalacje.util;

import pl.RemigiuszInstalacje.domain.Address;
import pl.RemigiuszInstalacje.domain.Build;
import pl.RemigiuszInstalacje.domain.Customer;
import pl.RemigiuszInstalacje.domain.Stage;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DomainFixtures {
    public static Build someBuild() {
    return Build.builder()
            .id(1)
            .address(someAddress())
            .investor(someCustomer())
            .stage(Stage.IN_PROGRESS)
            .materialCosts(BigDecimal.valueOf(10000))
            .workCosts(BigDecimal.valueOf(10000))
            .startDate(OffsetDateTime
                    .of(2023,10,23,8,30,0,0, ZoneOffset.UTC))
            .deadline(OffsetDateTime
                    .of(2023,12,23,8,30,0,0, ZoneOffset.UTC))
            .build();

    }

    public static Address someAddress() {
        return Address.builder()
                .id(1)
                .city("City")
                .street("street 53")
                .postalCode("44-444")
                .fullAddress("street 53, City 44-444")
                .build();
    }

    public static Customer someCustomer() {
        return Customer.builder()
                .id(1)
                .email("email@email.pl")
                .name("name")
                .surname("surname")
                .phoneNumber("111222333")
                .build();
    }
}
