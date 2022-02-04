package com.fellipe.kennelsystem.dto;

import com.fellipe.kennelsystem.entity.Litter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class DamDto {

    private Long id;
    private String name;
    private String breed;
    private SimpleDateFormat birthDate;
}
