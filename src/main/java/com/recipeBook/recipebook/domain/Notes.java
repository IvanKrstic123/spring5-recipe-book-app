package com.recipeBook.recipebook.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = "recipe")
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    @Column(name = "recipe_notes")
    private String recipeNote;

    /** getters and setters **/
}
