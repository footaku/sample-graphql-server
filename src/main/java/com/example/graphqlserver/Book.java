package com.example.graphqlserver;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("books")
public record Book (@Id Long id, String name, String type) {}
