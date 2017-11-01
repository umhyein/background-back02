package com.background.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by umhyein on 2017. 10. 30..
 */
@Data
@NoArgsConstructor
public class User implements Serializable {

    private Long id;
    private String account;
    private String pw;

}
