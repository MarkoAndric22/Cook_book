package com.cooker.cook.dtos.ingridient;


import com.cooker.cook.dtos.allergen.AllergenUpdateRequestDto;

import java.util.List;

public record IngridientUpdateRequestDto(

  String name,

  Integer unitOfMeasure,

  Integer numberCaloria,

  Integer carbohydrates,

  Integer fats,

  Integer proteins
) {
}
